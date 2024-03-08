package monster.esex.iloveclairo.datagen;

import monster.esex.iloveclairo.Iloveclairo;
import monster.esex.iloveclairo.register.BlockInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Iloveclairo.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(BlockInit.SUS_BLOCK);

        logBlock(((RotatedPillarBlock) BlockInit.JACARANDA_LOG.get()));
        axisBlock((RotatedPillarBlock) BlockInit.JACARANDA_WOOD.get(), blockTexture(BlockInit.JACARANDA_LOG.get()), blockTexture(BlockInit.JACARANDA_LOG.get()));

        axisBlock((RotatedPillarBlock) BlockInit.STRIPPED_JACARANDA_LOG.get(), blockTexture(BlockInit.STRIPPED_JACARANDA_LOG.get()),
                new ResourceLocation(Iloveclairo.MOD_ID, "block/stripped_jacaranda_log_top"));
        axisBlock((RotatedPillarBlock) BlockInit.STRIPPED_JACARANDA_WOOD.get(), blockTexture(BlockInit.STRIPPED_JACARANDA_LOG.get()),
                blockTexture(BlockInit.JACARANDA_LOG.get()));

        blockItem(BlockInit.JACARANDA_LOG);
        blockItem(BlockInit.JACARANDA_WOOD);
        blockItem(BlockInit.STRIPPED_JACARANDA_LOG);
        blockItem(BlockInit.STRIPPED_JACARANDA_WOOD);

        blockWithItem(BlockInit.JACARANDA_PLANKS);

        leavesBlock(BlockInit.JACARANDA_LEAVES);

        signBlock(((StandingSignBlock) BlockInit.JACARANDA_SIGN.get()), ((WallSignBlock) BlockInit.JACARANDA_WALL_SIGN.get()),
                blockTexture(BlockInit.JACARANDA_PLANKS.get()));

        hangingSignBlock(BlockInit.JACARANDA_HANGING_SIGN.get(), BlockInit.JACARANDA_WALL_HANGING_SIGN.get(),
                blockTexture(BlockInit.JACARANDA_PLANKS.get()));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Iloveclairo.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
