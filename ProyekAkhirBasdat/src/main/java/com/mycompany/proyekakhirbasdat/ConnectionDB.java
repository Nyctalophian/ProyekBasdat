/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyekakhirbasdat;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

/**
 *
 * @author Isuraa
 */

public class ConnectionDB {
    // Sultan
    static String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=ProyekBasdat;encrypt=true;trustServerCertificate=true;";
    static String urlrafa = "jdbc:sqlserver://localhost:1433;databaseName=ProyekBasdat;integratedSecurity=true;encrypt=false;";
    static String userName = "sa";
    static String password = "123";

    public static Connection getConnection(String url, String userName, String passwd)
        throws SQLException, ClassNotFoundException 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, userName, passwd);

            return conn;
        }
        
        public static Connection getConnection() throws SQLException, ClassNotFoundException 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(urlrafa);
            return conn;
        }

}
