package io.github.eddiediamondfire.advancedpunishment.common.database.sqllite;

import io.github.eddiediamondfire.advancedpunishment.common.core.BootStrap;

import java.sql.Connection;

public class SQLLite extends Database{

    private BootStrap plugin;
    public SQLLite(BootStrap plugin) {
        super(plugin);
    }

    private String createSQLTable = "CREATE TABLE IF NOT EXISTS " + plugin.getSQLTableName() + " (" +
            "'UUID' varchar(32) NOT NULL," +
            "'Username' varchar(20) NOT NULL," +
            "'Punishment_Type' varchar(64) NOT NULL," +
            "'Punishment_ID' int(99999) NOT NULL," +
            "'Reason' varchar(64) NOT NULL," +
            "'Temporary' bit NOT NULL,";

    @Override
    public Connection getConnection() {

        return null;
    }

    @Override
    public void loadSQL() {

    }
}
