package monster.esex.iloveclairo.register;

import monster.esex.iloveclairo.Iloveclairo;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Iloveclairo.MOD_ID);

    public static final RegistryObject<SoundEvent> SKIBIDI = SOUND_EVENTS.register("skibidi_fortnite", () ->
            SoundEvent.createVariableRangeEvent(new ResourceLocation(Iloveclairo.MOD_ID, "skibidi_fortnite")));

}
