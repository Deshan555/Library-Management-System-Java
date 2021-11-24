package My_SQL;

import Background.get_localDate;
import SQLite_03.Load_Location;
import com.sbix.jnotify.NPosition;
import com.sbix.jnotify.NoticeType;
import com.sbix.jnotify.NoticeWindow;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class My_SQL_CSV implements Runnable
{ 
    private final Thread thread;
    
    public  My_SQL_CSV()
    {
        thread = new Thread(this);
    }
    
    public static void books_csv()
    {
        String SQL = "SELECT * FROM BOOKS";
        
        String table_name = "BOOKS";
        
        Connection connect = Connector.connection();
        
        try
        {
            Statement stmt = connect.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            String file_name = table_name+"_"+get_localDate.LocalDate()+".csv";
                
            String file_path = Load_Location.load_settings("CSV")+file_name;
            
            FileWriter writter = new FileWriter(file_path);
            
            //StringBuilder build = new StringBuilder();
            
            while(rs.next())
            {
                String book_id = rs.getString("BOOK_ID");
                
                String name_book = rs.getString("TITLE_OF_BOOK");
                
                String author = rs.getString("AUTHOR_NAME");
                
                String link = rs.getString("BOOK_LINK");
                
                String category = rs.getString("CATEGORY");
                
                String section = rs.getString("SECTION");
                
                String permissions = rs.getString("PERMISSIONS");
                
                String price = rs.getString("BOOK_PRICE");
                
                String issue = rs.getString("ISSUE_PERSON");
                
                writter.append(book_id);
                
                writter.append(",");
                
                writter.append(name_book);
                
                writter.append(",");
                
                writter.append(author);
                
                writter.append(",");
                
                writter.append(link);
                
                writter.append(",");
                
                writter.append(category);
                
                writter.append(",");
                
                writter.append(section);
                
                writter.append(",");
                
                writter.append(permissions);
                
                writter.append(",");
                
                writter.append(price);
                
                writter.append(",");
                
                writter.append(issue);
                
                writter.append("\n");
                
                System.out.println(name_book);
            }
            
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
    }
    
    public static void e_mail_csv()
    {
        String SQL = "SELECT * FROM E_MAIL";
        
        String table_name = "E_MAIL";
        
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
                writter.append(rs.getString("EMAIL_ID"));
                
                writter.append(",");
                
                writter.append(rs.getString("SUBJECT"));
                
                writter.append(",");
                
                writter.append(rs.getString("TIME"));
                
                writter.append(",");
                
                writter.append(rs.getString("SEND_TO"));
                
                writter.append("\n");
            }
            
            writter.flush();
            
            writter.close();
        }
        catch(Exception ERROR)
        {
            
        }
    }
    
    public static void lend_table_csv()
    {
        String SQL = "SELECT * FROM LEND_TABLE";
        
        String table_name = "LEND_TABLE";
        
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
                writter.append(rs.getString("LEND_ID"));
                
                writter.append(",");
                
                writter.append(rs.getString("ISSUE_DATE"));
                
                writter.append(",");
                
                writter.append(rs.getString("DUE_DATE"));
                
                writter.append(",");
                
                writter.append(rs.getString("USER_ID"));
                
                writter.append(",");
                
                writter.append(rs.getString("BOOK_ID"));
                
                writter.append("\n");
            }
            
            writter.flush();
            
            writter.close();
        }
        catch(Exception ERROR)
        {
            System.out.print(ERROR);
        }
    }
    
    public static void profit_csv()
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
        }
        catch(Exception ERROR)
        {
            System.out.print(ERROR);
        }
    }
    
    
    
    public static void return_table_csv()
    {
        String SQL = "SELECT * FROM RETURN_TABLE";
        
        String table_name = "RETURN_TABLE";
        
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
                String return_id = rs.getString("RETURN_ID");
                
                writter.append(return_id);
                
                writter.append(",");
                
                writter.append(rs.getString("BOOK_ID"));
                
                writter.append(",");
                
                writter.append(rs.getString("USER_ID"));
                
                writter.append(",");
                
                writter.append(rs.getString("TAX"));
                
                writter.append(",");
                
                writter.append(rs.getString("STATUS"));
                                
                writter.append("\n");
                
                System.out.print(return_id);
            }
            
            writter.flush();
            
            writter.close();
        }
        catch(Exception ERROR)
        {
            System.out.print(ERROR);
        }
    }
    
    public static void staff_csv()
    {
        String SQL = "SELECT * FROM STAFF";
        
        String table_name = "STAFF";
        
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
                writter.append(rs.getString("ADMIN_ID"));
                
                writter.append(",");
                
                writter.append(rs.getString("ADMIN_NAME"));
                
                writter.append(",");
                
                writter.append(rs.getString("E_MAIL_ADDRESS"));
                
                writter.append(",");
                
                writter.append(rs.getString("MOBILE_NUMBER"));
                                
                writter.append("\n");
            }
            
            writter.flush();
            
            writter.close();
        }
        catch(Exception ERROR)
        {
            System.out.print(ERROR);
        }
    }
    
    
        public static void user_csv()
    {
        String SQL = "SELECT * FROM LIBRARY_USER";
        
        String table_name = "LIBRARY_USER";
        
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
                String user_id = rs.getString("USER_ID");
                
                String name = rs.getString("USER_NAME");
                
                String index = rs.getString("SLTC_INDEX");
                
                String number = rs.getString("MOBILE_NUMBER");
                
                String nic = rs.getString("NIC");
                
                String email = rs.getString("EMAIL_ADDRESS");
                
                String school = rs.getString("SCHOOL");
                
                String batch = rs.getString("BATCH_NUMBER");
                
                writter.append(user_id);
                
                writter.append(",");
                
                writter.append(name);
                
                writter.append(",");
                
                writter.append(index);
                
                writter.append(",");
                
                writter.append(number);
                
                writter.append(",");
                
                writter.append(nic);
                
                writter.append(",");
                
                writter.append(email);
                
                writter.append(",");
                
                writter.append(school);
                
                writter.append(",");
                
                writter.append(batch);
                
                writter.append("\n");
                
                System.out.println(user_id+" "+name+" "+index+" "+number+" "+nic+" "+email+" "+school+" "+batch+" \n\n");
            }
            
            writter.flush();
            
            writter.close();
        }
        catch(Exception ERROR)
        {
            System.out.print(ERROR);
        }
    }

    @Override
    public void run() 
    {
            books_csv();
        
            staff_csv();
        
            return_table_csv();
        
            user_csv();
        
            profit_csv();
        
            lend_table_csv();
        
            e_mail_csv();        
            
            new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Backup Completed!!",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
    }
    
    public void start()
    {
        thread.start();
    }
  
}
    
    

