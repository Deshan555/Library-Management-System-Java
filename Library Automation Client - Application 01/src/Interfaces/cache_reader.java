package Interfaces;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Scanner;

public class cache_reader 
{
    public static void reader(String file_name) throws FileNotFoundException, IOException
    {   
        FileInputStream fis = new FileInputStream(file_name);
      
        Scanner output = new Scanner(fis);
        
        String text = null;
        
        int count = 1;
        
        while (output.hasNext())
        {
            text = output.nextLine();
            
            validation.file_panal.append(text+"\n");
            
            count = count+1;
        }
        
        validation.x.setText(String.valueOf(count));
    }
}
