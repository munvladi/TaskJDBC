package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Util util = new Util();
        util.getConnection();

        UserServiceImpl test = new UserServiceImpl();

        test.createUsersTable();

        test.saveUser("Vladi", "Mun", (byte) 34);
        test.saveUser("Vero", "Mun", (byte) 34);
        test.saveUser("Andrew", "Mun", (byte) 9);
        test.saveUser("Simon", "Mun", (byte) 3);

        System.out.println(test.getAllUsers().toString());

        test.cleanUsersTable();

        test.dropUsersTable();
    }
}
