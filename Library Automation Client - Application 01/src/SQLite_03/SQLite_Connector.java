package SQLite_03;

import Background.Bugs;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class SQLite_Connector 
{
    public static Connection connect()
    {
        Connection conn = null;
        
        try
        {
            String url = "jdbc:sqlite:Config.db";// db parameters

            conn = DriverManager.getConnection(url);// create a connection to the database
        }
        catch(SQLException error)
        {
            Bugs.exceptions(String.valueOf(error));
        }
        
        return conn;
    }
    
    
    public static Connection connect_0()
    {
        Connection conn = null;
        
        try
        {
            String url = "jdbc:sqlite:Data.db";// db parameters

            conn = DriverManager.getConnection(url);// create a connection to the database
        }
        catch(SQLException error)
        {
            Bugs.exceptions(String.valueOf(error));
        }
        
        return conn;
    }
}
