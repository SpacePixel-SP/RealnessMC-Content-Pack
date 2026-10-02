package org.realnessmc.realnessmc_content_pack;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.level.block.JukeboxBlock;

public class ModJukeboxSongs {
    public static final ResourceKey<JukeboxSong> CANTINA_BAND_KEY =
            ResourceKey.create(Registries.JUKEBOX_SONG,
                    ResourceLocation.fromNamespaceAndPath("realnessmc_content_pack", "cantina_band"));
}
