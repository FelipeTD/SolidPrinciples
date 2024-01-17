package dip.goodExample;

public class PasswordReminder {

    private Object dbConnection;

    public Object construct(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
        return this.dbConnection;
    }

}
