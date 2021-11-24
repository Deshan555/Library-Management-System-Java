package My_SQL;

import Background.Bugs;
import Cryptography.SQL_log;

import SQLite_03.Load_SQL;

import java.io.FileNotFoundException;

import java.sql.Connection;

import java.sql.DriverManager;

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

        String database_url = "jdbc:mysql://"+host+":"+port+"/"+db_name+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        try
        {
           conn = DriverManager.getConnection(database_url, user_name, password);
            
            SQL_log.write("Connection Request -> "+database_url,"Database Connected");
        }
        catch (Exception ERROR)
        {
            System.out.println("Error Message : "+ERROR);
            
            try
            {
                SQL_log.write("Connection Request -> "+database_url,"Database Connection Faild"+ERROR);
            }
            catch(FileNotFoundException error)
            {
              Bugs.exceptions(String.valueOf(error));
            }
        }
        return conn;
    }
    
    public static void main(String[] args)
    {
        connection();
    }
}
