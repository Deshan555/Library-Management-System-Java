package Online_Services;

import Background.Bugs;

import Interfaces.Notification_Windows.Cloud_Sync;

import My_SQL.Connector;

import com.sbix.jnotify.NPosition;

import com.sbix.jnotify.NoticeType;

import com.sbix.jnotify.NoticeWindow;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.util.Random;

import javax.swing.JOptionPane;

public class Push_Data
{
    static Connection conn = Connect_Online.Online();

    static Connection connection = Connector.connection();

    //Push data in to remote data base and localhost database : PDF

    public static void Insert_PDF(String book_name,String author,String summery,String isbn,String language,String url,String generes)
    {
        Random rand = new Random();

        int value = rand.nextInt(999999999);

        String random_id = "PDF-"+String.valueOf(value);

        String URL = "INSERT INTO pdf_books VALUES ('"+random_id+"','"+book_name+"','"+author+"','"+summery+"','"+generes+"','"+isbn+"','"+language+"','"+url+"');";

        try
        {
            PreparedStatement preparedStatement = conn.prepareStatement(URL);

            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement_02 = connection.prepareStatement(URL);

            preparedStatement_02.executeUpdate();
            
            new Cloud_Sync().setVisible(true);
        }
        catch(SQLException ERROR)
        {
            JOptionPane.showMessageDialog(null,ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }



    //Push data in to remote data base and localhost database : Movies

    public static int Insert_Movies(String movie_name,String director,String released_year,String certification,String runtime,String genre,String url,String summery)
    {
        
        Random rand = new Random();

        int value = rand.nextInt(99999);

        String random_id = "MOV-"+String.valueOf(value);

        String URL = "INSERT INTO movies VALUES ('"+random_id+"','"+movie_name+"',"+released_year+",'"+certification+"','"+runtime+"','"+genre+"','"+url+"','"+director+"','"+summery+"');";

        try
        {
            PreparedStatement preparedStatement = conn.prepareStatement(URL);

            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement_02 = connection.prepareStatement(URL);

            preparedStatement_02.executeUpdate();
            
            new Cloud_Sync().setVisible(true);
            
            return 1;
        }
        catch(SQLException ERROR)
        {
            
            JOptionPane.showMessageDialog(null,ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
             
             return 0;
        }
    }




    //Push data in to remote data base and localhost database : Audio Books

    public static void Insert_Audio_Books(String audio_name,String written_by,String Listen_Time,String url,String genre,String summery)
    {
        Random rand = new Random();

        int value = rand.nextInt(99999);

        String random_id = "AUD-"+String.valueOf(value);

        String URL = "INSERT INTO audiobooks VALUES ('"+random_id+"','"+audio_name+"','"+written_by+"','"+Listen_Time+"','"+url+"','"+summery+"','"+genre+"');";

        try
        {
            PreparedStatement preparedStatement = conn.prepareStatement(URL);

            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement_02 = connection.prepareStatement(URL);

            preparedStatement_02.executeUpdate();
            
            new Cloud_Sync().setVisible(true);

        }
        catch(SQLException ERROR)
        {
            JOptionPane.showMessageDialog(null,ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }



    //Push data in to remote data base and localhost database : Tutorials and Videos

    public static void Insert_Tutorials(String course_title,String url,String number_of_lec,String level,String content_duration,String subject)
    {
        Random rand = new Random();

        int value = rand.nextInt(99999);

        String random_id = "TUT-"+String.valueOf(value);

        String URL = "INSERT INTO tutorials VALUES ('"+random_id+"','"+course_title+"','"+url+"','"+number_of_lec+"','"+level+"','"+content_duration+"','"+subject+"');";

        try
        {
            PreparedStatement preparedStatement = conn.prepareStatement(URL);

            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement_02 = connection.prepareStatement(URL);

            preparedStatement_02.executeUpdate();
            
            new Cloud_Sync().setVisible(true);

        }
        catch(SQLException ERROR)
        {
            JOptionPane.showMessageDialog(null,ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
    
    //Push data in to remote database : Hard Copies

    public static void Hard_Copies(int book_id,String book_name,String author_name,String ISBN,String book_link,String category,String section,int permissions,String book_price)
    {
        new NoticeWindow(NoticeType.DEFAULT_NOTIFICATION,"Wait...\nData Sync To Cloud",NoticeWindow.LONG_DELAY,NPosition.TOP_RIGHT);
        
        String SQL = "INSERT INTO books VALUES("+book_id+",'"+book_name+"','"+author_name+"','"+ISBN+"','"+book_link+"','"+category+"','"+section+"',"+permissions+",'"+book_price+"');";

        try
        {
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);

            preparedStatement.executeUpdate();
            
            new Cloud_Sync().setVisible(true);

        }
        catch(SQLException ERROR)
        {
            JOptionPane.showMessageDialog(null,ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
}
