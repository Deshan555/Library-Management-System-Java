package My_SQL;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;

public class Payment_Verification
{
    public static int Income_Verification(String recipt_id,String sltc_id)
    {       
        String SQL = "SELECT * FROM PROFIT WHERE SLTC_INDEX = '"+sltc_id+"' AND RECIPT_NUMBER = '"+recipt_id+"';";
        
        Connection connection =  Connector.connection();
        
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
