package io.github.eddiediamondfire.advancedpunishment.common.punishment.type;

import io.github.eddiediamondfire.advancedpunishment.common.punishment.PunishmentType;

public class TemporaryBan extends PunishmentType {

    @Override
    public String punishmentName() {
        return "Temporary_Ban";
    }

    @Override
    public boolean isTemporary() {
        return true;
    }

    @Override
    public String getID() {
        return "temp_ban";
    }
}
