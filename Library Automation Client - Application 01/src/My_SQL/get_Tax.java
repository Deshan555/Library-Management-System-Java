
package My_SQL;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

public class get_Tax 
{
    public static int get_sum(int UID)
    {
        String SQL = "SELECT SUM(TAX) FROM return_table WHERE USER_ID = "+UID+" AND STATUS = 0; ";
        
        Connection connection = Connector.connection();
        
        int tax = 0;
        
        try
        {
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(SQL);

        while (resultSet.next())
        {
            tax = resultSet.getInt("SUM(TAX)");
        }
        
        return tax;
        }
        catch(SQLException ERROR)
        {
            System.out.println(ERROR);
            
            return tax;
        }
    }
}
