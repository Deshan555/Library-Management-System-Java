package Online_Services;

import java.sql.Connection;

import java.sql.DriverManager;

public class Connect_Online
{
    public static Connection Online()
    {
        Connection conn = null;

        String database_url = "jdbc:mysql://remotemysql.com:3306/C5tbieTCrC?autoReconnect=true";

        String user_name = "C5tbieTCrC";

        String password = "wKJczujtNF";

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
