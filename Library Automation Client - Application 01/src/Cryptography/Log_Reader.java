package Cryptography;

import Background.get_localDate;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Log_Reader
{
    public static String reader(String file_name) throws FileNotFoundException
    {
        String db_name = file_name;
        
        FileInputStream fis = new FileInputStream(db_name);

        Scanner output = new Scanner(fis);
        
        String data = null;
        
        String value = null;

        while (output.hasNext())
        {
            data = output.nextLine();
            
            value = Decryption.decrypt(data);
        }
        
        return value;
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        String db_name = "logs/"+get_localDate.LocalDate()+".log";
        
        System.out.println(reader(db_name));
    }
    
}
