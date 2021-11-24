package My_SQL;

import Background.get_localDate;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.util.Random;

public class Save_mailLog 
{
    public static void save_log(String subject,int rmail)
    {
        String E_mailID = null;
        
        Random rand = new Random();

        int random_id = rand.nextInt(99999);

        String ID_ = String.valueOf(random_id);
        
        E_mailID = "MAIL-"+ID_;
        
        String time = get_localDate.LocalDate();
        
        String SQL = "INSERT INTO E_MAIL VALUES('"+E_mailID+"','"+subject+"','Send Done','"+time+"',"+rmail+");";
        
        Connection connect = Connector.connection();
        
            try
            {
  
             PreparedStatement preparedStatement = connect.prepareStatement(SQL);

             preparedStatement.executeUpdate();
             
             System.out.println("Mail DB UPDATED!!");
             
            }
            catch(SQLException ERROR)
            {
                System.out.println(ERROR);
            }
    }
    
}
