package monster.esex.iloveclairo.datagen;

import monster.esex.iloveclairo.Iloveclairo;
import monster.esex.iloveclairo.register.BlockInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Iloveclairo.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(BlockInit.JACARANDA_LOG.get().asItem())
                .add(BlockInit.JACARANDA_WOOD.get().asItem())
                .add(BlockInit.STRIPPED_JACARANDA_WOOD.get().asItem())
                .add(BlockInit.STRIPPED_JACARANDA_LOG.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(BlockInit.JACARANDA_PLANKS.get().asItem());
    }
}