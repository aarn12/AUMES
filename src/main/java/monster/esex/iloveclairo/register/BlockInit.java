package monster.esex.iloveclairo.register;

import monster.esex.iloveclairo.block.*;
import monster.esex.iloveclairo.Iloveclairo;
import monster.esex.iloveclairo.block.types.ModWoodTypes;
import monster.esex.iloveclairo.worldgen.tree.JacarandaTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Iloveclairo.MOD_ID);


    public static final RegistryObject<Block> SUS_BLOCK = BLOCKS.register("sus_block",
            () -> new ModPortalBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> JACARANDA_LOG = BLOCKS.register("jacaranda_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(4f)));
    public static final RegistryObject<Block> JACARANDA_WOOD = BLOCKS.register("jacaranda_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(4f)));
    public static final RegistryObject<Block> STRIPPED_JACARANDA_LOG = BLOCKS.register("stripped_jacaranda_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final RegistryObject<Block> STRIPPED_JACARANDA_WOOD = BLOCKS.register("stripped_jacaranda_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(4f)));

    public static final RegistryObject<Block> JACARANDA_PLANKS = BLOCKS.register("jacaranda_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> JACARANDA_LEAVES = BLOCKS.register("jacaranda_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });


    public static final RegistryObject<Block> JACARANDA_SIGN = BLOCKS.register("jacaranda_sign",
            () -> new ModStandingSign(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_WALL_SIGN = BLOCKS.register("jacaranda_wall_sign",
            () -> new ModWallSign(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_HANGING_SIGN = BLOCKS.register("jacaranda_hanging_sign",
            () -> new ModHangingSign(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.JACARANDA));
    public static final RegistryObject<Block> JACARANDA_WALL_HANGING_SIGN = BLOCKS.register("jacaranda_wall_hanging_sign",
            () -> new ModWallHangingSign(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.JACARANDA));



    public static final RegistryObject<Block> JACARANDA_SAPLING = BLOCKS.register("jacaranda_sapling",
            () -> new SaplingBlock(new JacarandaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

}
