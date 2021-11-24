
package Cryptography;

import Background.*;

import java.io.*;

import java.text.SimpleDateFormat;

import java.util.Date;

public class SQL_log 
{
    public static void write(String query,String status) throws FileNotFoundException
    {
        try
        {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        Date date = new Date();
        
        String time =  formatter.format(date);
        
        String db_name = "logs/"+get_localDate.LocalDate()+".log";
        
        FileOutputStream details = new FileOutputStream(db_name,true);

        PrintWriter file = new PrintWriter(details);

        BufferedWriter store = new BufferedWriter(file);
        
        String message = "\n<!-- ["+time+"]["+query+"]["+status+"]-->\n";
        
        String get_data = Encryption.encrypt(message);

        store.write(get_data);
                
        store.newLine();

        store.close();

        file.close();
        }
        catch(IOException ERROR)
        {
            System.out.println(ERROR);
        }
    }
    
    
    public static void main(String[] args) throws FileNotFoundException
    {
        write("sfdsfsfd","Sucuss");
    }
}
