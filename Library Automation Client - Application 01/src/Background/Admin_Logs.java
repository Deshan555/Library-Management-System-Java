
package Background;

import java.io.BufferedWriter;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.PrintWriter;

import java.text.SimpleDateFormat;

import java.util.Date;

public class Admin_Logs 
{
    public static void write(String activity)
    {
        try
        {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        Date date = new Date();
        
        String time =  formatter.format(date);
        
        String db_name = "logs/"+Cache_Reader.reader("Current_admin.dat")+".log";
        
        FileOutputStream details = new FileOutputStream(db_name,true);

        PrintWriter file = new PrintWriter(details);

        BufferedWriter store = new BufferedWriter(file);

        store.write("\n<!-- ["+get_localDate.LocalDate()+"] ["+time+"]["+Cache_Reader.reader("Current_admin.dat")+"]["+activity+"]-->\n");
                
        store.newLine();

        store.close();

        file.close();
        }
        catch(IOException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
}
