
package First_Launch;

import Background.Cache_Writer;

import Background.get_localDate;

import java.io.File;

import java.io.IOException;

public class Check_Directory 
{
    public static int check_directory() throws IOException
    {
        File file = new File("Install.txt");
        
        System.out.println(file);
        
        if(file.exists())
        {
            System.out.println("File Exists");
            
            return 1;
        }
        else
        {
            System.out.println("File Not Exists");
            
            return 0;
             
        }
    }
    
    
    public static int create_file() throws IOException
    {
        File file = new File("Install.txt");
        
        System.out.println(file);
        
        if(file.exists())
        {
            System.out.println("File Exists");
            
            return 1;
        }
        else
        {
            System.out.println("File Not Exists");
            
            file.createNewFile();
            
            try
            {
                String message = "Install Date "+get_localDate.LocalDate();
                
                Cache_Writer.add_data(message,"Install.txt");
            }
            catch(Exception ERROR)
            {
                System.out.println(ERROR);
            }
            
            return 0;
             
        }
    }
}
