package io.github.eddiediamondfire.advancedpunishment.common.database.sqllite;

import io.github.eddiediamondfire.advancedpunishment.common.core.BootStrap;

public interface ErrorLog {

    void executeStatement(BootStrap plugin, Exception exception);

    void closeConnection(BootStrap plugin, Exception exception);
}
