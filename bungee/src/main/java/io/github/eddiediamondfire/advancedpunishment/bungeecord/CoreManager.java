package io.github.eddiediamondfire.advancedpunishment.bungeecord;

import io.github.eddiediamondfire.advancedpunishment.common.core.AbstractCoreManager;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.UUID;

public class CoreManager implements AbstractCoreManager {
    private final Main plugin;
    public CoreManager(Main plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public void disconnectPlayer(UUID playerUUID) {
        ProxiedPlayer player = plugin.getProxy().getPlayer(playerUUID);
    }

    @Override
    public boolean isMuted(UUID playerUUID) {
        return false;
    }

    @Override
    public void sendMessageToPlayer(UUID playerUUID, String message) {

    }

    @Override
    public void sendMessageToConsole(String message) {

    }

    @Override
    public void broadcastMessage(String message) {

    }
}
