 package Background;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Cache_Reader 
{
    public static String reader(String file_name) throws FileNotFoundException
    {
        String db_name = file_name;
        
        FileInputStream fis = new FileInputStream(db_name);

        Scanner output = new Scanner(fis);
        
        String user_name = null;

        while (output.hasNext())
        {
            user_name = output.nextLine();          
        }
        
        return user_name;
    }

}
