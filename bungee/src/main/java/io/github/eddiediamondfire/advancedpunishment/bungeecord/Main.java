package io.github.eddiediamondfire.advancedpunishment.bungeecord;

import io.github.eddiediamondfire.advancedpunishment.bungeecord.listeners.BanListener;
import io.github.eddiediamondfire.advancedpunishment.bungeecord.managers.PlayerManager;
import io.github.eddiediamondfire.advancedpunishment.common.core.BootStrap;
import io.github.eddiediamondfire.advancedpunishment.common.core.AbstractCoreManager;
import io.github.eddiediamondfire.advancedpunishment.common.database.sqllite.ErrorLog;
import io.github.eddiediamondfire.advancedpunishment.common.player.AbstractPlayerManager;
import io.github.eddiediamondfire.advancedpunishment.common.punishment.AbstractPunishmentManager;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin implements BootStrap {
    private final Listener listener;
    private final AbstractPlayerManager abstractPlayerManager;
    private final AbstractCoreManager coreManager;

    public Main()
    {
        listener = new BanListener();
        abstractPlayerManager = new PlayerManager(this);
        coreManager = new CoreManager(this);
    }

    @Override
    public void onEnable()
    {
        this.getProxy().getPluginManager().registerListener(this, listener);
    }

    @Override
    public AbstractPlayerManager getPlayerManager() {
        return abstractPlayerManager;
    }

    @Override
    public AbstractPunishmentManager getPunishmentManager() {
        return null;
    }

    @Override
    public AbstractCoreManager getCoreManager() {
        return coreManager;
    }

    @Override
    public ErrorLog getErrorLog() {
        return null;
    }

    @Override
    public String getPluginDirectory() {
        return null;
    }

    @Override
    public String getSQLTableName() {
        return null;
    }


}
