/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.project.util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Abhishek
 */
public class MYSQLConnectionUtil {
    public static Connection getMySQLConnection(String DB_DRIVER, String DB_URL, String DB_USER, String DB_PASS) {
        Connection con = null;
        try {
            Class.forName(DB_DRIVER);
            con = (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("( MYSQLConnectionUtil ) Connection to DB created...");
        }
        catch (Exception e) {
            System.out.println("( MYSQLConnectionUtil ) Exception :: " + e);
        }
        return con;
    }
}
