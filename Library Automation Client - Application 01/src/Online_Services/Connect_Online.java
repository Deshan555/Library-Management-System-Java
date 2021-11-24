package Online_Services;

import java.sql.Connection;

import java.sql.DriverManager;

public class Connect_Online
{
    public static Connection Online()
    {
        Connection conn = null;

        String database_url = ""; // Database URL

        String user_name = ""; // Add User name

        String password = " "; // Password

        try
        {
           conn = DriverManager.getConnection(database_url, user_name, password);

            System.out.println("Connected To remotemysql.com:3306/C5tbieTCrC");
        }
        catch (Exception ERROR)
        {
            System.out.println("Error Message : "+ERROR);
        }
        return conn;
    }
    
    public static void main(String[] args)
    {
        Online();
    }
    
}
