package io.github.eddiediamondfire.advancedpunishment.common.player;

import io.github.eddiediamondfire.advancedpunishment.common.punishment.Punishment;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Player {

    private UUID playerUUID;
    private List<Punishment> punishments;

    public Player(UUID playerUUID)
    {
        setPlayerUUID(playerUUID);
        setPunishments(new ArrayList<>());
    }
}
