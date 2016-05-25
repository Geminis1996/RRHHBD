/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Enrique
 */
public class ConexionRRHHBD {
    public static Connection con;
    public static Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con=DriverManager.getConnection("jdbc:sqlserver://Piedra_gurren:1433;databaseName=RRHHBD","sa","sa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
        }
   
           
}
