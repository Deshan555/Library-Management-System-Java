package SQLite_03;

import Cryptography.Encryption;

import com.sbix.jnotify.NPosition;

import com.sbix.jnotify.NoticeType;

import com.sbix.jnotify.NoticeWindow;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

public class Save_Location 
{
    public static int save_settings(String value_1,String value_2,String value_3,String value_4,String value_5)
    {
        Connection connection = SQLite_Connector.connect();
        
        String SQL_1 = "UPDATE LOCATIONS SET VALUE = '"+Encryption.encrypt(value_1)+"' WHERE PATH = 'AUTOMATIC';";
        
        String SQL_2 = "UPDATE LOCATIONS SET VALUE = '"+Encryption.encrypt(value_2)+"' WHERE PATH = 'DUMPEXE';";
        
        String SQL_3 = "UPDATE LOCATIONS SET VALUE = '"+Encryption.encrypt(value_3)+"' WHERE PATH = 'SQLEXE';";
        
        String SQL_4 = "UPDATE LOCATIONS SET VALUE = '"+Encryption.encrypt(value_4)+"' WHERE PATH = 'CSV';";
        
        String SQL_5 = "UPDATE LOCATIONS SET VALUE = '"+Encryption.encrypt(value_5)+"' WHERE PATH = 'SQLDUMP';";
        
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
            
            new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Settings Saved Successfully",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
            
            return 1;
        }
        catch(SQLException ERROR)
        {
            System.out.println(ERROR);
            
            new NoticeWindow(NoticeType.WARNING_NOTIFICATION,"Problem Found : "+ERROR,NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
            
            return 0;
        }
    }   
}
