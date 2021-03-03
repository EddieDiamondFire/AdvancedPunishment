package io.github.eddiediamondfire.advancedpunishment.common.punishment.type;

import io.github.eddiediamondfire.advancedpunishment.common.punishment.PunishmentType;

public class PermanentBan extends PunishmentType {
    @Override
    public String punishmentName() {
        return "Permanent_Ban";
    }

    @Override
    public boolean isTemporary() {
        return false;
    }

    @Override
    public String getID() {
        return "perm_ban";
    }
}
