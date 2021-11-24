
package BootUpServices;

import Background.Bugs;
import Interfaces.home;
import SQLite_03.Load_SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimerTask;

import java.util.Timer;

public class Background_Testing implements Runnable
{
    String host = Load_SQL.load_settings("HOST");
        
    String port = Load_SQL.load_settings("PORT");
        
    String user_name = Load_SQL.load_settings("UNAME");
        
    String password = Load_SQL.load_settings("PASSWORD");
        
    String db_name = Load_SQL.load_settings("DBNAME");
    
    Connection conn = null;
    
    private final Thread thread;
    
    public Background_Testing()
    {
        thread = new Thread(this);
    }

    @Override
    public void run()
    {
        TimerTask timerTask = new TimerTask()
        {
            @Override

            public void run()
            {
                String database_url = "jdbc:mysql://"+host+":"+port+"/"+db_name;
                 
                try
                {
                    conn = DriverManager.getConnection(database_url, user_name, password);
                    
                    home.jLabel4.setText("DATABASE ONLINE");
                    
                    home.jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ok_25px.png")));
                }
                catch(SQLException error)
                {
                    Bugs.exceptions(String.valueOf(error));
                    
                    home.jLabel4.setText("DATABASE OFFLINE");
                    
                    home.jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/high_priority_25px.png")));
                }
            }
        };

        Timer timer = new Timer();

        timer.schedule(timerTask,1,10000);
    }
    
    public void start()
    {
        thread.start();
    }
      
}