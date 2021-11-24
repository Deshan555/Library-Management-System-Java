/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_Mail;

import Background.Bugs;

import My_SQL.Connector;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

/**
 *
 * @author Jayashanka Deshan
 */
public class mail_group 
{
    public static void mail_group_sender(String SQL,String Template,String sub)
    {
        Connection connection =  Connector.connection();
        
        String template = Template;
        
        String subject = sub;
                    
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                String mail = rs.getString("EMAIL_ADDRESS");
                
                String uname = rs.getString("USER_NAME");
                
                int index = rs.getInt("USER_ID");
                
                email_thread thread = new email_thread(mail,uname,subject,template,index);
                
                thread.start();
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }   
    }
}
