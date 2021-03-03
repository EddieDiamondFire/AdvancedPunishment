package io.github.eddiediamondfire.advancedpunishment.bungeecord.managers;

import io.github.eddiediamondfire.advancedpunishment.common.core.BootStrap;
import io.github.eddiediamondfire.advancedpunishment.common.player.AbstractPlayerManager;
import io.github.eddiediamondfire.advancedpunishment.common.player.Player;

import java.util.List;

public class PlayerManager extends AbstractPlayerManager {


    public PlayerManager(BootStrap plugin) {
        super(plugin);
    }

    @Override
    public List<Player> getPlayersInNetwork() {
        return null;
    }
}
