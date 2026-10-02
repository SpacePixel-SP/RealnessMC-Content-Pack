package org.realnessmc.realnessmc_content_pack;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(Registries.SOUND_EVENT, "realnessmc_content_pack");

    public static final DeferredHolder<SoundEvent, SoundEvent> CANTINA_BAND =
            SOUND_EVENTS.register("cantina_band", () -> SoundEvent.createVariableRangeEvent(
                    ResourceLocation.fromNamespaceAndPath("realnessmc_content_pack", "cantina_band")
            ));
}
