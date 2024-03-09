package monster.esex.iloveclairo.register;

import monster.esex.iloveclairo.Iloveclairo;
import monster.esex.iloveclairo.entity.ModBoatEntity;
import monster.esex.iloveclairo.item.ModBoatItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Iloveclairo.MOD_ID);


    // Normal Items
    public static final RegistryObject<Item> AMONGUY = ITEMS.register("amonguy",
            () -> new Item(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> JACARANDA_SIGN = ITEMS.register("jacaranda_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), BlockInit.JACARANDA_SIGN.get(), BlockInit.JACARANDA_WALL_SIGN.get()));
    public static final RegistryObject<Item> JACARANDA_HANGING_SIGN = ITEMS.register("jacaranda_hanging_sign",
            () -> new SignItem(new Item.Properties().stacksTo(1), BlockInit.JACARANDA_HANGING_SIGN.get(), BlockInit.JACARANDA_WALL_HANGING_SIGN.get()));

    public static final RegistryObject<Item> JACARANDA_BOAT = ITEMS.register("jacaranda_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.JACARANDA, new Item.Properties()));

    public static final RegistryObject<Item> JACARANDA_CHEST_BOAT = ITEMS.register("jacaranda_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.JACARANDA, new Item.Properties()));



    // Block Items
    public static final RegistryObject<BlockItem> SUS_BLOCK_ITEM = ITEMS.register("sus_block",
            () -> new BlockItem(BlockInit.SUS_BLOCK.get(), new Item.Properties().rarity(Rarity.RARE)));


    public static final RegistryObject<BlockItem> JACARANDA_LOG_ITEM = ITEMS.register("jacaranda_log",
            () -> new BlockItem(BlockInit.JACARANDA_LOG.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> JACARANDA_WOOD_ITEM = ITEMS.register("jacaranda_wood",
            () -> new BlockItem(BlockInit.JACARANDA_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> STRIPPED_JACARANDA_WOOD_ITEM = ITEMS.register("stripped_jacaranda_wood",
            () -> new BlockItem(BlockInit.STRIPPED_JACARANDA_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> STRIPPED_JACARANDA_LOG_ITEM = ITEMS.register("stripped_jacaranda_log",
            () -> new BlockItem(BlockInit.STRIPPED_JACARANDA_LOG.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> JACARANDA_PLANKS_ITEM = ITEMS.register("jacaranda_planks",
            () -> new BlockItem(BlockInit.JACARANDA_PLANKS.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> JACARANDA_LEAVES_ITEM = ITEMS.register("jacaranda_leaves",
            () -> new BlockItem(BlockInit.JACARANDA_LEAVES.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> JACARANDA_SAPLING_ITEM = ITEMS.register("jacaranda_sapling",
            () -> new BlockItem(BlockInit.JACARANDA_SAPLING.get(), new Item.Properties()));

}
