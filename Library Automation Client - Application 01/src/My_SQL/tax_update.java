package My_SQL;

import java.sql.Connection;

import java.sql.PreparedStatement;

public class tax_update 
{
    public static void update_tax(int index)
    {
        String UPDATE = "UPDATE RETURN_TABLE SET STATUS = 1 WHERE USER_ID = "+index+"";
        
        Connection connection = Connector.connection();
        
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);

            preparedStatement.executeUpdate();
            
        }
        
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
            
        }
         
    }
}
