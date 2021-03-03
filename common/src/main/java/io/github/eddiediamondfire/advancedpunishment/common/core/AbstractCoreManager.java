package io.github.eddiediamondfire.advancedpunishment.common.core;

import java.util.UUID;

public interface AbstractCoreManager {

    void disconnectPlayer(UUID playerUUID);

    boolean isMuted(UUID playerUUID);

    void sendMessageToPlayer(UUID playerUUID, String message);

    void sendMessageToConsole(String message);

    void broadcastMessage(String message);
}
