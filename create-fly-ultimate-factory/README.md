# Create: Ultimate Factory Fly

A custom recipe addon for **[Create Fly](https://www.curseforge.com/minecraft/mc-mods/create-fly)** (ZurrTum's Create Fabric port).  
Ported from the original [Create: Ultimate Factory](https://www.curseforge.com/minecraft/mc-mods/create-ultimate-factory) for Create Fly. Adds 33 recipes across Compacting, Mixing, Haunting, Splashing, and Crushing machines.

## Requirements

| Dependency | Version |
|------------|---------|
| Minecraft | 1.21.11 |
| Fabric Loader | >= 0.19.2 |
| Fabric API | >= 0.141.3 (required for resource loading) |
| [Create Fly](https://www.curseforge.com/minecraft/mc-mods/create-fly) | >= 6.0.8 |

> **Note:** Fabric API must be installed even though this mod does not use it directly — it provides the resource loader that enables custom recipe loading from addon mods.

## Recipes (33 total)

### Compacting (9) — Mechanical Press + Basin

| Input | Output | Condition |
|-------|--------|-----------|
| Cobblestone + Lava (1/3 Bucket) | Tuff | - |
| Stone + Lava (1/3 Bucket) | Deepslate | - |
| Gravel + Bone Meal | Calcite | - |
| Zinc Nugget x4 + Gravel + Water (1/3 Bucket) | Asurine | - |
| Iron Nugget x4 + Gravel + Lava (1/3 Bucket) | Crimsite | - |
| Gold Nugget x4 + Gravel + Lava (1/3 Bucket) | Ochrum | - |
| Copper Nugget x4 + Gravel + Lava (1/3 Bucket) | Veridium | - |
| Blaze Powder x4 | Blaze Rod | - |
| Coal Block x2 + Lava (1 Bucket) | Diamond | Requires heated Blaze Burner |

### Mixing (3) — Mechanical Mixer + Basin

| Input | Output |
|-------|--------|
| Netherrack + Flint + Lava (1/3 Bucket) | Redstone x4 |
| Calcite + Water (1/3 Bucket) | Dripstone Block |
| Coal + Blaze Powder | Gunpowder x3 |

### Haunting (6) — Encased Fan + Soul Fire

| Input | Output |
|-------|--------|
| Basalt | Netherrack |
| Obsidian | Crying Obsidian |
| Charcoal | Coal |
| Poppy | Wither Rose |
| Spider Eye | Fermented Spider Eye |
| Apple | Chorus Fruit |

### Splashing (3) — Encased Fan + Water

| Input | Output |
|-------|--------|
| Packed Ice | Blue Ice |
| Magma Cream | Slime Ball |
| Colored Terracotta (all 16 colors) | Terracotta |

### Crushing (12) — Crushing Wheels

| Input | Output | Chance |
|-------|--------|--------|
| Blackstone | Wither Skeleton Skull | 10% (Rare) |
| | Blackstone | 25% (Occasionally) |
| Scoria | Blaze Powder x2 | 100% |
| | Blaze Rod | 10% (Rare) |
| Nether Bricks | Nether Brick x2 | 100% |
| | Netherite Scrap | 2% (Extremely Rare) |
| Soul Sand | Glowstone Dust x2 | 100% |
| Limestone | Quartz | 100% |
| | Lapis Lazuli | 100% |
| Red Sandstone | Red Sand x2 | 100% |
| | Nautilus Shell | 2% (Extremely Rare) |
| Crying Obsidian | Powdered Obsidian x2 | 100% |
| | Amethyst Shard | 100% |
| Coral Blocks (all 5 variants) | Heart of the Sea | 2% (Extremely Rare) |
| Dead Coral Blocks (all 5 variants) | Bone Meal x3 | 100% |
| Red Mushroom Block | Red Mushroom x2 | 100% |
| Brown Mushroom Block | Brown Mushroom x2 | 100% |
| End Stone | Ender Pearl | 10% (Rare) |
| | End Stone | 25% (Occasionally) |

## License

MIT License
