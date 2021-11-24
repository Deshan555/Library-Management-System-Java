package SQLite_03;

import Background.Bugs;
import Cryptography.Encryption;
import java.sql.Connection;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Save_Settings 
{
    public static int save_settings(String value_1,String value_2,String value_3,String value_4,String value_5)
    {
        Connection connection = SQLite_Connector.connect();
        
        String SQL_1 = "UPDATE SETTINGS SET VALUE = '"+Encryption.encrypt(value_1)+"' WHERE SETTING_TYPE = 'SENDER_NAME';";
        
        String SQL_2 = "UPDATE SETTINGS SET VALUE = '"+Encryption.encrypt(value_2)+"' WHERE SETTING_TYPE = 'RPAYMENT';";
        
        String SQL_3 = "UPDATE SETTINGS SET VALUE = '"+Encryption.encrypt(value_3)+"' WHERE SETTING_TYPE = 'LPAYMENT';";
        
        String SQL_4 = "UPDATE SETTINGS SET VALUE = '"+Encryption.encrypt(value_4)+"' WHERE SETTING_TYPE = 'PASSWORD';";
        
        String SQL_5 = "UPDATE SETTINGS SET VALUE = '"+Encryption.encrypt(value_5)+"' WHERE SETTING_TYPE = 'EMAIL';";
        
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
            
            JOptionPane.showMessageDialog(null,"Settings Update Successfully \nTake a Look");
                    
            return 1;
        }
        catch(Exception ERROR)
        {
            
            JOptionPane.showMessageDialog(null,"UPDATE FAIL ERROR : "+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
            
            return 0;
        }
    }
}
