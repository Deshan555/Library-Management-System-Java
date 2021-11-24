package SQLite_03;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.Statement;

import java.util.ArrayList;

public class Save_Category 
{
    public static int save_data(String value_1)
    {
        Connection connection = SQLite_Connector.connect();
        
        String SQL_1 = "INSERT INTO Category VALUES('"+value_1+"')";

        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_1);

            preparedStatement.executeUpdate();
            
            return 1;
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
            
            return 0;
        }
    }
    
    public static ArrayList load_data()
    {
        ArrayList <String> array = new ArrayList<String>();
        
        String SQL = "SELECT VALUE FROM Category";
        
        Connection connection = SQLite_Connector.connect();
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                array.add(rs.getString("VALUE"));
            }
            
            System.out.println(array);
            
            return array;
        }
        catch(Exception ERROR)
        {
            return array;
        }
    }
    
    public static void main(String[]args)
    {
         save_data("asd");
         
         load_data();
    }
    
}
