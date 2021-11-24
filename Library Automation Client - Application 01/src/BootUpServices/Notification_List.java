package BootUpServices;

import Background.Bugs;

import Background.time_management;
import E_Mail.email_thread_common;

import My_SQL.Connector;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class Notification_List implements Runnable
{
    
    private final Thread thread;
    
    public Notification_List()
    {
        thread = new Thread(this);
    }
    
    static Connection connection =  Connector.connection();
    
    
    @Override
    public void run() 
    {
        String SQL = "SELECT * FROM LEND_TABLE;";

        String get_date = null;

        try
        {
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery(SQL);

            while(rs.next())
            {
                get_date = rs.getString("DUE_DATE");

                int return_data = time_management.time_management(get_date);

                if(return_data < 0)
                {
                    System.out.println("Data : "+get_date+"\n");
                    
                    Integer id = Integer.valueOf(rs.getString("USER_ID"));
                    
                    extract_data(id);
                }
                
            }
        }
        catch (NumberFormatException | SQLException ERROR)
        {
            System.out.println(ERROR);

            Bugs.exceptions(String.valueOf(ERROR));
        }
    }

    public static void extract_data(int index)
    {
        String SQL = "SELECT * FROM LIBRARY_USER WHERE USER_ID = "+index+";";
        
        String template = "<h4>Dear Card Holder : "+index+"</h4>\n" +
"\n" +
"<p><h5>\n" +
"\n" +
"Library records show the overdue Item In Your Account. Please return them soon so that others may borrow them, and to<br>\n" +
"avoid possible charges. If you would like to renew your items, Call your local library if you have questions regarding this notice.\n" +
"\n" +
"<pre>\n" +
"    Thank you for your prompt attention to this matter.If you received this notice via email it was sent from a notification-only address that cannot accept incoming mail.  \n" +
"    Please Do Not Reply to this message but contact your local library directly.\n" +
"</pre>\n" +
"\n" +
"</h5></p>";

        try
        {
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery(SQL);

            while(rs.next())
            {
                String name = rs.getString("USER_NAME");

                String mail_address = rs.getString("EMAIL_ADDRESS");
                
                email_thread_common mail = new email_thread_common(mail_address,name,"Over Due Notification",template,index);
                
                mail.start();
            }
        }
        catch (Exception ERROR)
        {
            System.out.println(ERROR);

            Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
    public void start()
    {
        thread.start();
    }
}
