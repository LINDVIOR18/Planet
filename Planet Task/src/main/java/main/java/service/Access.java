package main.java.service;

import main.java.entity.Archive;
import main.java.entity.User;

import java.sql.*;
import java.util.List;

public class Access {
    public static boolean isUserAllowed(List<Access> accesses, User user, Archive archive, int permission) throws SQLException {
        boolean userStatus;
//        Connection connection = DriverManager.getConnection("jdbc...");
//
//        Statement statement = connection.createStatement();
//        String query = "SELECT archive_id, user_first_name, user_last_name FROM users JOIN user_access" +
//                "ON user.user_id=user_access.user_id";
//        ResultSet resultSet = statement.executeQuery(query);


        return...;
    }
}
