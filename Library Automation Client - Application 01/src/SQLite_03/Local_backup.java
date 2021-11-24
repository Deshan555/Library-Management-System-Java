/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLite_03;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Jayashanka Deshan
 */
public class Local_backup 
{
    public static void local_backup()
    {
         Connection connection = SQLite_Connector.connect();
         
         String SQL = ".backup backup_sqlITE.db";
         
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.executeUpdate();
            
            System.out.print("ok");
            
        }
        catch(Exception ERROR)
        {
            System.out.print("fok");
        }
            
    }
    
    public static void main(String[] args)
    {
        local_backup();
    }
    
}
