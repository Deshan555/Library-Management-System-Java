package BootUpServices;

import static Install_Wizard.Connect_Prop.jLabel10;
import Log_In_Services.Log_In;

import SQLite_03.Load_SQL;

import java.sql.Connection;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Test_Connection implements Runnable 
{
    private final Thread thread;
    
    public Test_Connection() 
    {
        thread = new Thread(this);
    }

    @Override
    public void run()
    {
        Connection conn = null;
        
        String host = Load_SQL.load_settings("HOST");
        
        String port = Load_SQL.load_settings("PORT");
        
        String user_name = Load_SQL.load_settings("UNAME");
        
        String password = Load_SQL.load_settings("PASSWORD");
        
        String db_name = Load_SQL.load_settings("DBNAME");

        String database_url = "jdbc:mysql://"+host+":"+port+"/"+db_name;

        try
        {
           conn = DriverManager.getConnection(database_url, user_name, password);
           
           System.out.print("Connection Established");
           
           new Log_In().setVisible(true);
        }
        catch (Exception ERROR)
        {
            System.out.println("Error Message : "+ERROR);
                        
            int choice = JOptionPane.showConfirmDialog(null,"Application Can't Connect To Database \nERROR : "+ERROR+"\n\nAre You Want Open DB Config Interface");
            
            if(choice == 0)
            {
                Open_Config.Exe_Open();
            }
            else if(choice == 1)
            {
                System.exit(0);
            }
        }
    }
    
    
    public void start()
    {
        thread.start();
    }
    
}

