package org.realnessmc.realnessmc_content_pack;


import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@EventBusSubscriber(modid = Realnessmc_content_pack.MODID, bus = EventBusSubscriber.Bus.GAME)
public class WelcomeHandler {
    @SubscribeEvent
    public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

        if (!org.realnessmc.realnessmc_content_pack.Config.ENABLE_WELCOME_MESSAGE.get()) {
            return;
        }

        if (event.getEntity() instanceof ServerPlayer player) {
            Component welcomeMessage = Component.literal("§aWelcome to the RealnessMC Server, " + player.getScoreboardName() + "!");
            player.sendSystemMessage(welcomeMessage);
        }

        if (event.getEntity() instanceof ServerPlayer player) {
            Component modMessage = Component.literal("§9RealnessMC Content Pack was Loaded §aSuccessfully!");
            Component modVersion = Component.literal("§9Version: "+ Config.MOD_VERSION);
            player.sendSystemMessage(modMessage);
            player.sendSystemMessage(modVersion);
        }

    }
}
