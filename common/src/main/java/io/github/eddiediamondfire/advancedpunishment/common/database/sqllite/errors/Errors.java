package io.github.eddiediamondfire.advancedpunishment.common.database.sqllite.errors;

public enum Errors {

    SQL_CONNECTION_CLOSED("Failed to close MySQL Connection: "),
    SQL_EXECUTE_STATEMENT_FAIL("Can't execute MySQL Statement: "),
    SQL_NON_EXIST("Unable to retreive MYSQL connection: "),
    SQL_TABLE_DOESNT_EXIST("Database Error: Table does not Exist!");


    private String errorMessage;

    Errors(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
