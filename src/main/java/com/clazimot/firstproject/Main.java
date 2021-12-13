package com.clazimot.firstproject;

import com.clazimot.firstproject.manager.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] params) throws SQLException, ClassNotFoundException {
        System.out.println("Hi");
        Manager mn = new Manager();
        mn.getAuthor();
        System.out.println("Ok");
    }
}
