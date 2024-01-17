package dip.badExample;

// Para reaproveitar a classe é necessário trazer também a classe MySQLConnection
// A responsabilidade de criar a conexão com o banco de dados é da classe PasswordReminder
public class PasswordReminder {

    private MySQLConnection mySQLConnection;

    public MySQLConnection construct() {
        this.mySQLConnection = new MySQLConnection();
        return this.mySQLConnection;
    }

}
