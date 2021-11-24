package BootUpServices;

import Cryptography.SQL_log;

import Background.get_localDate;

import SQLite_03.Load_Location;

import SQLite_03.Load_SQL;

import com.sbix.jnotify.NPosition;

import com.sbix.jnotify.NoticeType;

import com.sbix.jnotify.NoticeWindow;

import java.io.FileNotFoundException;

import java.time.LocalTime;

import java.util.logging.Level;

import java.util.logging.Logger;

public class Automatic_Backup implements Runnable
{
    private final Thread thread;
    
    public Automatic_Backup()
    {
        thread = new Thread(this);
    }

    @Override
    public void run()
    {
        LocalTime myObj = LocalTime.now();
        
        String time = String.valueOf(myObj);
        
        String fileName = "AUTOMATIC_SQL_DUMP_"+get_localDate.LocalDate()+"_.sql";
        
        String dbName = Load_SQL.load_settings("DBNAME");
        
        String dbUser = Load_SQL.load_settings("UNAME");
         
        String dbPort = Load_SQL.load_settings("PORT");
          
        String dbHost = Load_SQL.load_settings("HOST");
           
        String dbPass = Load_SQL.load_settings("PASSWORD");
        
        String dumpExe = Load_Location.load_settings("DUMPEXE");
        
        String dumpSavePath = Load_Location.load_settings("SQLDUMP");
        
        String batchCommand;
                
        if (dbPass != "") 
        {
		         
		         batchCommand = dumpExe + 
		        		 " -h " + dbHost + 
		        		 " --port " +dbPort + 
		        		 " -u " + dbUser + 
		        		 " --password=" + dbPass + 
		        		 " --add-drop-database -B " + dbName + 
		        		 " -r \"" + dumpSavePath + "" + fileName;
	} 
        else 
        {
	        	 batchCommand = dumpExe + 
	        			 " -h " + dbHost + 
	        			 " --port " + "3306" + 
	        			 " -u " + dbUser + 
	        			 " --add-drop-database -B " + dbName + 
	        			 " -r \"" + dumpSavePath + "" + fileName;
	}
        
        try
        {
	        Process runtimeProcess = Runtime.getRuntime().exec(batchCommand);
                
	        int processComplete = runtimeProcess.waitFor();
                
                if (processComplete == 0) 
                {
	            System.out.println("Backup Complete");
                    
                     new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Automatic Backup SQL Dump Save In "+dumpSavePath+fileName,NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
                     
                     SQL_log.write(batchCommand,"Backup Complete");
	        } 
                else 
                {
	            System.out.println("Backup Failure");
                    
                    new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"Automatic Backup Failure!! Something Wrong",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
                    
                    SQL_log.write(batchCommand,"Backup Fail");
	        }
        }
        catch(Exception ERROR)
        {
            System.out.println("Backup Failure : "+ERROR);
            
            new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"BOOT UP SERVICE FALIURE !! \n\nAutomatioc Backup Fail ERROR : \n\n"+ERROR,NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
            
            try 
            {
                SQL_log.write(batchCommand,"Backup Fail : "+ERROR);
            } 
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(Automatic_Backup.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }          
    }
    
    public void start()
    {
        thread.start();
    }
}
