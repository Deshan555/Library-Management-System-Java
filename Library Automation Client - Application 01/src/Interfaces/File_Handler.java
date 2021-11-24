package Interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;


public class File_Handler 
{
    public static void handle(String extension,String file) throws IOException
    {
        if(extension.equals("txt"))
        {
            System.out.print("Open Txt Core Handler");
            
            try 
            {
                cache_reader.reader(file);
            } 
            catch (FileNotFoundException error) 
            {
                System.out.print("ERROR : "+error);
            }
        }
        if(extension.equals("csv"))
        {
            System.out.print("Open Txt Core Handler");
            
            try 
            {
                cache_reader.reader(file);
            } 
            catch (FileNotFoundException error) 
            {
                System.out.print("ERROR : "+error);
            }
        }

                
    }
}
