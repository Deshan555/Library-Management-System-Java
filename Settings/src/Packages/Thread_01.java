package Packages;

import static Interfaces.ui_1.jLabel7;

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
            
           jLabel7.setText("DATABASE ONLINE");
            
           jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ok_30px.png")));
           
           JOptionPane.showMessageDialog(null,"Connected To\n"+database_url);
        }
        catch (Exception ERROR)
        {
            System.out.println("Error Message : "+ERROR);
            
            jLabel7.setText("DATABASE OFFLINE");
            
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/high_priority_30px.png")));
            
            JOptionPane.showMessageDialog(null,"Connection Fail Error [ERROR Code]\n"+ERROR);
        }
    }
    
    
    public void start()
    {
        thread.start();
    }
    
};
