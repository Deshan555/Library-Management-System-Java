package My_SQL;

import Cryptography.SQL_log;

import Interfaces.DataBase_Management.DB_Backup;

import java.io.FileNotFoundException;

public class SQL_Dump 
{    
    public static int Make_dump(String host,String port,String user,String password,String dbName,String dumpExe,String dumpSavePath,String fileName) throws FileNotFoundException
    {
        String batchCommand;
                
        if (password != "") 
        {
		         
		         batchCommand = dumpExe + 
		        		 " -h " + host + 
		        		 " --port " + port + 
		        		 " -u " + user + 
		        		 " --password=" + password + 
		        		 " --add-drop-database -B " + dbName + 
		        		 " -r \"" + dumpSavePath + "" + fileName;
	} 
        else 
        {
	        	 batchCommand = dumpExe + 
	        			 " -h " + host + 
	        			 " --port " + "3306" + 
	        			 " -u " + user + 
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
                    
                    try
                    {
                         SQL_log.write("DB Backup Request -> "+batchCommand,"Backup Complete");
                    }
                    catch(Exception ERROR)
                    {
                       // do nothing
                    }
                     
                     DB_Backup.get_fileList();
                    
                    return 1;
	        } 
                else 
                {
	            System.out.println("Backup Failure");
                    
                    try
                    {
                         SQL_log.write("DB Backup Request -> "+batchCommand,"Backup Fail");
                    }
                    catch(Exception ERROR)
                    {
                       // do nothing
                    }
                    
                    return 0;
	        }
        }
        catch(Exception ERROR)
        {
            System.out.println("Backup Failure : "+ERROR);
            
                    try
                    {
                         SQL_log.write("DB Backup Request -> "+ERROR,"Backup Fail");
                    }
                    catch(FileNotFoundException EX)
                    {
                       // do nothing
                    }
                    
            
            return 0;
        }          
    }
}