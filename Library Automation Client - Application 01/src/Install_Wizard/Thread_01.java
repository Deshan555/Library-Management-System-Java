package Install_Wizard;


import static Install_Wizard.Connect_Prop.jLabel10;

import SQLite_03.Load_SQL;

import java.sql.Connection;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Thread_01 implements Runnable 
{
    private final Thread thread;
    
    public Thread_01() 
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
                       
           JOptionPane.showMessageDialog(null,"Connected To\n"+database_url);
           
           jLabel10.setVisible(true);
        }
        catch (Exception ERROR)
        {
            System.out.println("Error Message : "+ERROR);
                        
            JOptionPane.showMessageDialog(null,"Connection Fail Error [ERROR Code]\n"+ERROR);
        }
    }
    
    
    public void start()
    {
        thread.start();
    }
    
}

