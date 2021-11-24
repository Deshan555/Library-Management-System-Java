
package My_SQL;

import Background.Bugs;
import E_Mail.email_thread;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import javax.swing.JOptionPane;

public class Payment_List 
{
    public static void Payment_group(String template,String Subject)
    {
        String SQL = "SELECT * FROM LIBRARY_USER";
        
        String template_ = template;
        
        String message = null;
        
        String tax_price = null;
        
        Connection connection = Connector.connection();
        
         try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                String user_id = rs.getString("USER_ID");
                
                String user_name = rs.getString("USER_NAME");
                
                String mail = rs.getString("EMAIL_ADDRESS");
                
                String fund = Tax_Operations.tax_count(Integer.valueOf(user_id));
                
                System.out.println("data "+user_id+" "+user_name+" "+mail+" "+fund+"\n\n");
                
                int return_data = Tax_Operations.validation_tax(Integer.valueOf(user_id));
                
                if(return_data == 0)
                {
                   tax_price =  Tax_Operations.tax_count(Integer.valueOf(user_id));
                   
                   template_ = "<h>\n" +
"    <p><pre>\n" +
"        Dear Member "+user_name+"["+user_id+"]<br>We just wanted to drop you a quick note to remind you that LKR "+tax_price+".00 in respect of our Fund.\n" +
"    </pre></p>\n" +
"</h>"+template;
                   
                email_thread thread = new email_thread(mail,user_name,Subject,template_,Integer.valueOf(user_id));
                
                thread.start();
                }
                
                
            }    
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
            
            JOptionPane.showMessageDialog(null,"SQL ERROR : "+ERROR);
        }
    }

}
