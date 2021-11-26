package Packages;

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

            System.out.println("Connection to SQLite has been established.");
        }
        catch(SQLException error)
        {
            System.out.println("ERROR : "+error);
        }
        
        return conn;
    }
    
    public static void main(String[] args)
    {
        connect();
    }
}
