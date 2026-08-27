
package org.realnessmc.realnessmc_content_pack.ponder.generated;

import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

public final class GeneratedPonderPlugin implements PonderPlugin {
    @Override
    public String getModId() {
        return "realnessmc_content_pack";
    }

    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        GeneratedPonderIndex.register(helper);
    }

    @Override
    public void registerTags(PonderTagRegistrationHelper<ResourceLocation> helper) {
        GeneratedPonderAttribution.registerTag(helper);
        GeneratedPonderIndex.registerTags(helper);
    }
}
