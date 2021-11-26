package Packages;

import Cryptography.Encryption;
import java.sql.Connection;

import java.sql.PreparedStatement;

public class Save_Settings 
{
    public static int save_settings(String value_1,String value_3,String value_4,String value_5,String value_2)
    {
        Connection connection = SQLite_Connector.connect();
        
        String SQL_1 = "UPDATE SETTINGS SET VALUE = '"+Encryption.encrypt(value_1)+"' WHERE SETTING_TYPE = 'SENDER_NAME';";
        
        String SQL_3 = "UPDATE SETTINGS SET VALUE = '"+Encryption.encrypt(value_3)+"' WHERE SETTING_TYPE = 'LPAYMENT';";
        
        String SQL_4 = "UPDATE SETTINGS SET VALUE = '"+Encryption.encrypt(value_4)+"' WHERE SETTING_TYPE = 'PASSWORD';";
        
        String SQL_5 = "UPDATE SETTINGS SET VALUE = '"+Encryption.encrypt(value_5)+"' WHERE SETTING_TYPE = 'EMAIL';";
        
        String SQL_2 = "UPDATE SETTINGS SET VALUE = '"+Encryption.encrypt(value_2)+"' WHERE SETTING_TYPE = 'SPASS';";
        
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_1);

            preparedStatement.executeUpdate();
            
            preparedStatement = connection.prepareStatement(SQL_1);

            preparedStatement.executeUpdate();
            
            preparedStatement = connection.prepareStatement(SQL_2);

            preparedStatement.executeUpdate();
                        
            preparedStatement = connection.prepareStatement(SQL_3);

            preparedStatement.executeUpdate();
            
            preparedStatement = connection.prepareStatement(SQL_4);

            preparedStatement.executeUpdate();
            
             preparedStatement = connection.prepareStatement(SQL_5);

            preparedStatement.executeUpdate();
            
            return 1;
            
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
            
            return 0;
        }
    }
}
