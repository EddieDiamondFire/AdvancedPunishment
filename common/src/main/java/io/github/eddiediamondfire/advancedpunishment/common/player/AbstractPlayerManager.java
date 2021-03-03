package io.github.eddiediamondfire.advancedpunishment.common.player;

import io.github.eddiediamondfire.advancedpunishment.common.core.BootStrap;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class AbstractPlayerManager {

    private final BootStrap plugin;
    private final List<Player> playersInNetwork;

    public AbstractPlayerManager(BootStrap plugin)
    {
        this.plugin = plugin;
        this.playersInNetwork = new ArrayList<>();
    }

    public void addPlayerToNetwork(UUID playerUUID, String username)
    {

    }

    public void removePlayerFromNetwork(UUID playerUUID)
    {

    }

    public void createPlayerData(UUID playerUUID, String username)
    {

    }

    public Player getPlayer(UUID playerUUID){
        for(Player player: playersInNetwork)
        {
            if(player.getPlayerUUID().equals(playerUUID))
            {
                return player;
            }
        }
        return null;
    }

    public List<Player> getPlayersInNetwork() {
        return playersInNetwork;
    }
}
