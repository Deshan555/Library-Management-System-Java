package My_SQL;

import Cryptography.SQL_log;

import static Interfaces.DataBase_Management.DB_Restore.jTextField8;


import SQLite_03.Load_Location;

import SQLite_03.Load_SQL;

import com.sbix.jnotify.NPosition;

import com.sbix.jnotify.NoticeType;

import com.sbix.jnotify.NoticeWindow;


public class Dump_Restore implements Runnable
{
    private final Thread thread;
    
    public Dump_Restore()
    {
          thread = new Thread(this);
    }

    @Override
    public void run() 
    {   
        String mysqlPath 	= Load_Location.load_settings("SQLEXE");
		
        String dbUser 		= Load_SQL.load_settings("UNAME");
		
        String dbPassword 	= Load_SQL.load_settings("PASSWORD");
		
        String backupFile 	= jTextField8.getText();
       
        String[] executeCmd = new String[]{mysqlPath, "--user=" + dbUser, "--password=" + dbPassword, "-e", "source " + backupFile};
        
        Process runtimeProcess;
        
        try
        {
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            
            int processComplete = 0;
            
            processComplete = runtimeProcess.waitFor();
            
            if (processComplete == 0) 
            {
		String notification = "Backup restored successfully with " + backupFile;
                
                new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,notification,NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
                
                try
                {
                         SQL_log.write("DB RESTORE REQUEST -> ","RESTORE Fail");
                }
                catch(Exception ERROR)
                {
                       // do nothing
                }
                    
            } 
            else 
            {
		String notification = "Could not restore the backup " + backupFile;
                
                new NoticeWindow(NoticeType.ERROR_NOTIFICATION,notification,NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
                
                try
                {
                         SQL_log.write("DB RESTORE REQUEST -> ","RESTORE Fail");
                }
                catch(Exception ERROR)
                {
                       // do nothing
                }
            }
        }
        catch(Exception ERROR)
        {
              new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"Error Found",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
              
                try
                {
                         SQL_log.write("DB RESTORE REQUEST -> "+ERROR,"RESTORE Fail");
                }
                catch(Exception EX)
                {
                       // do nothing
                }
              
        }
        
    }
    
    public void start()
    {
        thread.start();
    }
}

