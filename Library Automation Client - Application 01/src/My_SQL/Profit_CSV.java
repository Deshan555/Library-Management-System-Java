/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_SQL;

import Background.Bugs;
import Background.get_localDate;

import SQLite_03.Load_Location;

import java.io.FileWriter;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;


public class Profit_CSV 
{
    public static String profit_csv()
    {
         String SQL = "SELECT * FROM PROFIT";
        
        String table_name = "PROFIT";
        
        Connection connect = Connector.connection();
        
        try
        {
            Statement stmt = connect.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            String file_name = table_name+"_"+get_localDate.LocalDate()+".csv";
                
            String file_path = Load_Location.load_settings("CSV")+file_name;
            
            FileWriter writter = new FileWriter(file_path);
                        
            while(rs.next())
            {
                writter.append(rs.getString("BILL_ID"));
                
                writter.append(",");
                
                writter.append(rs.getString("SLTC_INDEX"));
                
                writter.append(",");
                
                writter.append(rs.getString("RECIPT_NUMBER"));
                
                writter.append(",");
                
                writter.append(rs.getString("DATE"));
                
                writter.append(",");
                
                writter.append(rs.getString("DISCRIPTION"));
                
                writter.append(",");
                
                writter.append(rs.getString("VALUE"));
                
                writter.append(",");
                
                writter.append(rs.getString("COUNTER_ID"));
                
                writter.append("\n");
            }
            
            writter.flush();
            
            writter.close();
            
            return "Backup Create successfully Under Fallowing Name \n\n"+file_name;
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
            
            return String.valueOf(ERROR);
        }
    }
}
