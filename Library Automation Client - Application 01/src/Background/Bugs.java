package Background;

import java.io.BufferedWriter;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.PrintWriter;

public class Bugs 
{
    public static void exceptions(String message)
    {
        String file_name = get_localDate.LocalDate()+"Bugs.dat";
        
        try
        {
            FileOutputStream details = new FileOutputStream(file_name,true);

            PrintWriter file = new PrintWriter(details);

            BufferedWriter store = new BufferedWriter(file);
            
            store.write(get_localDate.LocalDate()+"[ "+message+" ]\n");
                
            store.newLine();

            store.close();

            file.close();
        }
        catch(IOException Error)
        {
            
        }
     
    }   
}
