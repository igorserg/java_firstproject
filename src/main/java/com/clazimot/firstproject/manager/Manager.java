package com.clazimot.firstproject.manager;

import java.sql.*;

public class Manager {
    public static void getAuthor() throws SQLException, ClassNotFoundException {
        System.out.println("start");
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        /*
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("driver Ok");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

         */
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/firstproject", "postgres", "voices123");
            System.out.println("connect Ok");
        } catch (SQLException e){
            e.printStackTrace();
        }
        //Statement stmt = conn.createStatement();
        //ResultSet rs = stmt.executeQuery("select * from author");
        //while(rs.next())
        //    System.out.println(rs.getString("name"));
    }
}
