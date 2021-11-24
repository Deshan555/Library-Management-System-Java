package My_SQL;

import Background.Bugs;
import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;

public class User_Validation 
{
    public static int validation_userID(String index)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LIBRARY_USER WHERE SLTC_INDEX ='"+index+"'; ";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
                        
            if(!rs.next())
            {
                System.out.print("0");
                
                return 0;
            }
            else
            {
                System.out.print("1");
                
                return 1;
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
            
            return 0;
        }
    }
    

    public static int validation_number(int number)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LIBRARY_USER WHERE MOBILE_NUMBER = "+number+"; ";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
                        
            if(!rs.next())
            {
                System.out.print("0");
                
                return 0;
            }
            else
            {
                System.out.print("1");
                
                return 1;
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
            
            return 0;
        }
    }
    
    
    public static int validation_EMAIL(String mail)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LIBRARY_USER WHERE EMAIL_ADDRESS ='"+mail+"'; ";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
                        
            if(!rs.next())
            {
                System.out.print("0");
                
                return 0;
            }
            else
            {
                System.out.print("1");
                
                return 1;
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
            
            return 0;
        }
    }
    
    
    public static int validation_NIC(int nic)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LIBRARY_USER WHERE NIC = "+nic+"; ";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
                        
            if(!rs.next())
            {
                System.out.print("0");
                
                return 0;
            }
            else
            {
                System.out.print("1");
                
                return 1;
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
            
            return 0;
        }
    }
}
