package dip.badExample;

import dip.goodExample.MySQLConnection;

// Já melhora mais ainda viola o princípio de Aberto / Fechado
// Também viola o DIP, pois dependemos de uma implementação, não de uma abstração
public class PasswordReminderMelhorado {

    private MySQLConnection mySQLConnection;

    public MySQLConnection construct(MySQLConnection mySQLConnection) {
        this.mySQLConnection = mySQLConnection;
        return this.mySQLConnection;
    }

}
