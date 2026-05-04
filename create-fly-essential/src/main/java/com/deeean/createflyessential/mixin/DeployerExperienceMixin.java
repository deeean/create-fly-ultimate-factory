package com.deeean.createflyessential.mixin;

import com.zurrtum.create.AllItems;
import com.zurrtum.create.content.kinetics.deployer.DeployerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class DeployerExperienceMixin {

    @Shadow
    public abstract @Nullable Player getLastHurtByPlayer();

    @Shadow
    protected abstract int getExperienceReward(ServerLevel world, Entity attacker);

    @Shadow
    public abstract boolean shouldDropExperience();

    @Inject(method = "dropExperience(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)V",
            at = @At("HEAD"),
            cancellable = true)
    private void onDropExperience(ServerLevel world, Entity attacker, CallbackInfo ci) {
        Player lastHurtByPlayer = getLastHurtByPlayer();
        if (!(lastHurtByPlayer instanceof DeployerPlayer deployer))
            return;
        if (!shouldDropExperience())
            return;

        int xp = getExperienceReward(world, lastHurtByPlayer);
        if (xp <= 0)
            return;

        int nuggets = xp / 3;
        int remainder = xp % 3;

        if (nuggets > 0) {
            ItemStack nuggetStack = new ItemStack(AllItems.EXP_NUGGET, nuggets);
            deployer.cast().getInventory().placeItemBackInInventory(nuggetStack);
        }

        if (remainder > 0) {
            deployer.cast().giveExperiencePoints(remainder);
        }

        ci.cancel();
    }
}
