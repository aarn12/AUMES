package monster.esex.iloveclairo.datagen;

import monster.esex.iloveclairo.Iloveclairo;
import monster.esex.iloveclairo.register.BlockInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Iloveclairo.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.SUS_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockInit.JACARANDA_LOG.get())
                .add(BlockInit.JACARANDA_PLANKS.get())
                .add(BlockInit.JACARANDA_WOOD.get())
                .add(BlockInit.STRIPPED_JACARANDA_WOOD.get())
                .add(BlockInit.STRIPPED_JACARANDA_LOG.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(BlockInit.SUS_BLOCK.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(BlockInit.JACARANDA_LOG.get())
                .add(BlockInit.JACARANDA_WOOD.get())
                .add(BlockInit.STRIPPED_JACARANDA_WOOD.get())
                .add(BlockInit.STRIPPED_JACARANDA_LOG.get());

        this.tag(BlockTags.PLANKS)
                .add(BlockInit.JACARANDA_PLANKS.get());
    }
}
