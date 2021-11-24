/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import SQLite_03.SQLite_Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class get_data_from_bookID 
{
    public static String get_book_Data(int book_id)
    {
        Connection conn = SQLite_Connector.connect();
        
        //int book_id = 8720417;
        
        String SQL = "SELECT * FROM BOOKS WHERE BOOK_ID = '"+book_id+"' ; ";
        
        String book_name = null;
        
        try
        {
            Statement stmt  = conn.createStatement();
            
            ResultSet rs    = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                book_name = rs.getString("TITLE_OF_BOOK");
            }
        }
        catch(SQLException ERROR)
        {
            System.out.println("ERROR : "+ERROR);
        }
        
        return book_name;
    }
    
}
