package monster.esex.iloveclairo.datagen.loot;

import monster.esex.iloveclairo.register.BlockInit;
import monster.esex.iloveclairo.register.ItemInit;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(BlockInit.SUS_BLOCK.get());

        dropSelf(BlockInit.JACARANDA_LOG.get());
        dropSelf(BlockInit.JACARANDA_PLANKS.get());
        dropSelf(BlockInit.JACARANDA_WOOD.get());
        dropSelf(BlockInit.STRIPPED_JACARANDA_LOG.get());
        dropSelf(BlockInit.STRIPPED_JACARANDA_WOOD.get());

        add(BlockInit.JACARANDA_LEAVES.get(), block -> createLeavesDrops(block, BlockInit.JACARANDA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        add(BlockInit.JACARANDA_SIGN.get(), block ->
                createSingleItemTable(ItemInit.JACARANDA_SIGN.get()));
        add(BlockInit.JACARANDA_WALL_SIGN.get(), block ->
                createSingleItemTable(ItemInit.JACARANDA_SIGN.get()));
        add(BlockInit.JACARANDA_HANGING_SIGN.get(), block ->
                createSingleItemTable(ItemInit.JACARANDA_HANGING_SIGN.get()));
        add(BlockInit.JACARANDA_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ItemInit.JACARANDA_HANGING_SIGN.get()));

        dropSelf(BlockInit.JACARANDA_SAPLING.get());
    }


    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
