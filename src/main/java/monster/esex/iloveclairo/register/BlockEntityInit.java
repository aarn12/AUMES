package monster.esex.iloveclairo.register;

import monster.esex.iloveclairo.Iloveclairo;
import monster.esex.iloveclairo.block.entity.renderer.ModHangingSignBlockEntity;
import monster.esex.iloveclairo.block.entity.renderer.ModSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Iloveclairo.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            BlockInit.JACARANDA_SIGN.get(), BlockInit.JACARANDA_WALL_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            BlockInit.JACARANDA_HANGING_SIGN.get(), BlockInit.JACARANDA_WALL_HANGING_SIGN.get()).build(null));


}
