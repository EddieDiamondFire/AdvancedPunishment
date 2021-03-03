package io.github.eddiediamondfire.advancedpunishment.common.punishment;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Punishment
{

    private UUID playerPunished;
    private UUID playerModerator;
    private String reason;
    private boolean temporary;
    private PunishmentType punishmentType;
    private int duration;
    private boolean active;
    private int ID;

    public Punishment(UUID playerPunished, UUID playerModerator, String reason, PunishmentType punishmentType, boolean temporary, int duration, boolean active, int ID)
    {
        setPlayerPunished(playerPunished);
        setPlayerModerator(playerModerator);
        setReason(reason);
        setPunishmentType(punishmentType);
        setTemporary(temporary);
        setDuration(duration);
        setActive(active);
        setID(ID);
    }
}
