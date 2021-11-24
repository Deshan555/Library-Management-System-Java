package My_SQL;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;

public class Card_Validation 
{
    
    public static int validation_card(int card_id)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM  LIBRARY_USER WHERE USER_ID ='"+card_id+"'; ";
            
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
            
            return 0;
        }
    }
}
