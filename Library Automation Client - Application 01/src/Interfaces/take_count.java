/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import My_SQL.Connector;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

public class take_count 
{
    public static String get_RowCount(String table_name,String col_name)
    {
        Connection connection = Connector.connection();

        String SQL = "SELECT count("+col_name+") FROM "+table_name+";";
        
        String count = null;
        
        try
        {
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(SQL);

        while (resultSet.next())
        {
            count = resultSet.getString("count("+col_name+")");
        }
        }
        catch(SQLException ERROR)
        {
            System.out.println(ERROR);
        }

        return count;
    }
            
            
    
}
