
package Background;


import static Background.Config.get_properties;
import static Background.Config.save_properties;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.util.Properties;

public class Config
{
    public static Properties properties = new Properties();

    public static void save_properties(String title,String value)
    {
        try
        {
            properties.setProperty(title,value);

            properties.store(new FileOutputStream("Setting.config"),null);
        }
        catch(IOException error)
        {
            System.out.println("ERROR CAN'T SAVE SETTINGS (ERROR CODE : "+error+" )");
        }
    }

    public static String get_properties(String title)
    {
        String value = "";

        try
        {
            properties.load(new FileInputStream("Setting.config"));

            value = properties.getProperty(title);
        }
        catch(IOException error)
        {
            System.out.println("ERROR CAN'T SAVE SETTINGS (ERROR CODE : "+error+" )");
        }

        return value;
    }
}

class call_setting
{
    public static void main(String[] args)
    {
        save_properties("email_address","maxwon559@gmail.com");
        
        save_properties("email_address2","maxwon559@gmail.com");
        
        save_properties("email_address3","maxwon559@gmail.com");
        
        save_properties("email_address4","maxwon559@gmail.com");

        System.out.println(get_properties("email_address"));
        
        System.out.println(get_properties("email_address2"));
         
        System.out.println(get_properties("email_address3"));
          
        System.out.println(get_properties("email_address4"));

    }
}
