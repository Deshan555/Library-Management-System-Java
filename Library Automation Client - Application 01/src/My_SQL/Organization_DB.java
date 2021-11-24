/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_SQL;

import java.sql.Connection;

import java.sql.DriverManager;

public class Organization_DB
{
    public static Connection connection()
    {
        Connection conn = null;

        String database_url = "jdbc:mysql://localhost:3306/SLTC";

        String user_name = "root";

        String password = "";

        try
        {
           conn = DriverManager.getConnection(database_url, user_name, password);

            System.out.println("Connected !!");
        }
        catch (Exception ERROR)
        {
            System.out.println("Error Message : "+ERROR);
        }
        return conn;
    }
}