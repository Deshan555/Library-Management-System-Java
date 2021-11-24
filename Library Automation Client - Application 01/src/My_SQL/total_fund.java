package My_SQL;

import Background.Bugs;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

public class total_fund 
{
    public static String fund()
    {        
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT SUM(VALUE) FROM PROFIT";
        
        int sum = 0;
        
        String sum_cast = null;
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
               sum = rs.getInt("SUM(VALUE)");
            }
        }
        catch(SQLException ERROR)
        {
           Bugs.exceptions(String.valueOf(ERROR));
        }
        
        sum_cast = String.valueOf(sum);
        
        return sum_cast;
    }
    
    
    
    public static String fund_Register()
    {        
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT SUM(VALUE) FROM PROFIT WHERE DISCRIPTION = 'For Registeration Fee'";
        
        int sum = 0;
        
        String sum_cast = null;
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
               sum = rs.getInt("SUM(VALUE)");
            }
        }
        catch(SQLException ERROR)
        {
           Bugs.exceptions(String.valueOf(ERROR));
        }
        
        sum_cast = String.valueOf(sum);
        
        return sum_cast;
    }
    
    
    public static String fund_Late()
    {        
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT SUM(VALUE) FROM PROFIT WHERE DISCRIPTION = 'Fund For Late Book Return'; ";
        
        int sum = 0;
        
        String sum_cast = null;
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
               sum = rs.getInt("SUM(VALUE)");
            }
        }
        catch(SQLException ERROR)
        {
           Bugs.exceptions(String.valueOf(ERROR));
        }
        
        sum_cast = String.valueOf(sum);
        
        return sum_cast;
    }
    
     public static String fund_damage()
    {        
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT SUM(VALUE) FROM PROFIT WHERE DISCRIPTION = 'Payment For Repair Books'; ";
        
        int sum = 0;
        
        String sum_cast = null;
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
               sum = rs.getInt("SUM(VALUE)");
            }
        }
        catch(SQLException ERROR)
        {
           Bugs.exceptions(String.valueOf(ERROR));
        }
        
        sum_cast = String.valueOf(sum);
        
        return sum_cast;
    }
}
