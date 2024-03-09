package monster.esex.iloveclairo.item;

import monster.esex.iloveclairo.Iloveclairo;
import monster.esex.iloveclairo.register.BlockInit;
import monster.esex.iloveclairo.register.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Iloveclairo.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SUS_TAB = CREATIVE_MODE_TABS.register("sus_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.AMONGUY.get()))
                    .title(Component.translatable("creativetab.sus_tab"))
                    .displayItems((pParameters, output) -> {
                        output.accept(ItemInit.AMONGUY.get());
                        output.accept(ItemInit.SUS_BLOCK_ITEM.get());

                        output.accept(ItemInit.JACARANDA_LOG_ITEM.get());
                        output.accept(ItemInit.JACARANDA_WOOD_ITEM.get());
                        output.accept(ItemInit.JACARANDA_PLANKS_ITEM.get());
                        output.accept(ItemInit.STRIPPED_JACARANDA_LOG_ITEM.get());
                        output.accept(ItemInit.STRIPPED_JACARANDA_WOOD_ITEM.get());
                        output.accept(ItemInit.JACARANDA_SIGN.get());
                        output.accept(ItemInit.JACARANDA_HANGING_SIGN.get());
                        output.accept(ItemInit.JACARANDA_BOAT.get());
                        output.accept(ItemInit.JACARANDA_CHEST_BOAT.get());
                        output.accept(ItemInit.JACARANDA_LEAVES_ITEM.get());
                        output.accept(BlockInit.JACARANDA_SAPLING.get().asItem());
                    })
                    .build());
}
