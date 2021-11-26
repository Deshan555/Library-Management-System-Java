package Packages;

import java.sql.Connection;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Connector
{
    public static Connection connection()
    {
        Connection conn = null;
        
        String host = Load_SQL.load_settings("HOST");
        
        String port = Load_SQL.load_settings("PORT");
        
        String user_name = Load_SQL.load_settings("UNAME");
        
        String password = Load_SQL.load_settings("PASSWORD");
        
        String db_name = Load_SQL.load_settings("DBNAME");

        String database_url = "jdbc:mysql://"+host+":"+port+"/"+db_name;

        try
        {
           conn = DriverManager.getConnection(database_url, user_name, password);

            JOptionPane.showMessageDialog(null,"Connected To\n"+database_url);
        }
        catch (Exception ERROR)
        {
            JOptionPane.showMessageDialog(null,"Connection Fail Error [ERROR Code]\n"+ERROR);
        }
        return conn;
    }

    public static void main(String[] args)
    {
        connection();
    }
}
