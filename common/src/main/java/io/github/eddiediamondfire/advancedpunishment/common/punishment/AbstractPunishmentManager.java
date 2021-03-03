package io.github.eddiediamondfire.advancedpunishment.common.punishment;

import io.github.eddiediamondfire.advancedpunishment.common.core.BootStrap;
import io.github.eddiediamondfire.advancedpunishment.common.player.AbstractPlayerManager;
import io.github.eddiediamondfire.advancedpunishment.common.player.Player;

import java.util.List;

public abstract class AbstractPunishmentManager {

    private final BootStrap plugin;
    private final AbstractPlayerManager playerManager;
    private final List<Player> playersInNetwork;

    public AbstractPunishmentManager(BootStrap plugin)
    {
        this.plugin = plugin;
        this.playerManager = plugin.getPlayerManager();
        this.playersInNetwork = playerManager.getPlayersInNetwork();
    }
    public abstract boolean isPunishmentType(PunishmentType punishmentType);


}
