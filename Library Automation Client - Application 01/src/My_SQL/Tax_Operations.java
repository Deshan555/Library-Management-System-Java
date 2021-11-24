/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_SQL;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;

/**
 *
 * @author Jayashanka Deshan
 */
public class Tax_Operations 
{
    public static int validation_tax(int card_id)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM RETURN_TABLE WHERE USER_ID ='"+card_id+"' AND STATUS = 0; ";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
                    
            if(!rs.next())
            {                
                return 1;
            }
            else
            {                
                return 0;
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
            
            return 0;
        }
    }
    
    public static String tax_count(int card_id)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT SUM(TAX) FROM RETURN_TABLE WHERE USER_ID ='"+card_id+"' AND STATUS = 0 ; ";
        
        int sum = 0;
        
        String sum_cast = null;
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
               sum = rs.getInt("SUM(TAX)");
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
        
        sum_cast = String.valueOf(sum);
        
        return sum_cast;
    }
    
    
    public static String total_count()
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT SUM(TAX) FROM RETURN_TABLE WHERE STATUS = 0 ; ";
        
        int sum = 0;
        
        String sum_cast = null;
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
               sum = rs.getInt("SUM(TAX)");
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
        
        sum_cast = String.valueOf(sum);
        
        return sum_cast;
    }
}
