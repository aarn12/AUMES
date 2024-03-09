package monster.esex.iloveclairo.register;

import monster.esex.iloveclairo.Iloveclairo;
import monster.esex.iloveclairo.entity.ModBoatEntity;
import monster.esex.iloveclairo.entity.ModChestBoatEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Iloveclairo.MOD_ID);

    public static final RegistryObject<EntityType<ModBoatEntity>> JACARANDA_BOAT =
            ENTITY_TYPES.register("jacaranda_boat",
                    () -> EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new, MobCategory.MISC)
                            .sized(1.375f, 0.5625f).build("jacaranda_boat"));
    public static final RegistryObject<EntityType<ModChestBoatEntity>> JACARANDA_CHEST_BOAT =
            ENTITY_TYPES.register("jacaranda_chest_boat",
                    () -> EntityType.Builder.<ModChestBoatEntity>of(ModChestBoatEntity::new, MobCategory.MISC)
                            .sized(1.375f, 0.5625f).build("jacaranda_chest_boat"));
}
