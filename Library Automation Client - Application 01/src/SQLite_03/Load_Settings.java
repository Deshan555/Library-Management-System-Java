
package SQLite_03;

import Cryptography.Decryption;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;

public class Load_Settings 
{
    public static String load_settings(String setting_type)
    {
        String value = null;
        
        String SQL = "SELECT VALUE FROM SETTINGS WHERE SETTING_TYPE = '"+setting_type+"';";
        
        Connection connection = SQLite_Connector.connect();
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                value = rs.getString("VALUE");
            }
            
            return Decryption.decrypt(value);
        }
        catch(Exception ERROR)
        {
            return "settings_not_found";
        }
    }
}
