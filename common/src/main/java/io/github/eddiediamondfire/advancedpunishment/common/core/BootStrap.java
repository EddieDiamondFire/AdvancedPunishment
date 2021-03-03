package io.github.eddiediamondfire.advancedpunishment.common.core;

import io.github.eddiediamondfire.advancedpunishment.common.database.sqllite.ErrorLog;
import io.github.eddiediamondfire.advancedpunishment.common.player.AbstractPlayerManager;
import io.github.eddiediamondfire.advancedpunishment.common.punishment.AbstractPunishmentManager;

public interface BootStrap {

    void onEnable();
    void onDisable();

    AbstractPlayerManager getPlayerManager();
    AbstractPunishmentManager getPunishmentManager();
    AbstractCoreManager getCoreManager();
    ErrorLog getErrorLog();
    String getPluginDirectory();

    String getSQLTableName();
}
