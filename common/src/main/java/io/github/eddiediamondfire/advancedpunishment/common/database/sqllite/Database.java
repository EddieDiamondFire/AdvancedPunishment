package io.github.eddiediamondfire.advancedpunishment.common.database.sqllite;

import io.github.eddiediamondfire.advancedpunishment.common.core.BootStrap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Database {

    private Connection connection;
    private BootStrap plugin;
    private String table;
    private ErrorLog errorLog;

    public Database(BootStrap plugin)
    {
        this.plugin = plugin;
        this.table = plugin.getSQLTableName();
        errorLog = plugin.getErrorLog();
    }

    public abstract Connection getConnection();

    public abstract void loadSQL();

    public void initaliseDatabase(){
        connection = getConnection();

        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM " + table + " WHERE player = ?");
            ResultSet result = statement.executeQuery();
            close(statement, result);
        }catch(SQLException ex)
        {
            
        }
    }

    public void close(PreparedStatement ps,ResultSet rs){
        try {
            if (ps != null)
                ps.close();
            if (rs != null)
                rs.close();
        } catch (SQLException ex) {
            errorLog.closeConnection(plugin, ex);
        }
    }


}
