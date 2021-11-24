package Background;

import java.io.IOException;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;

public class Network_Connection 
{
   public static int net_connection() 
   {
      try 
      {
         URL url = new URL("http://www.google.com");
         
         URLConnection connection = url.openConnection();
         
         connection.connect();
                  
         return 1;
         
      } 
      catch (MalformedURLException e) 
      {                  
         return 0;
      } 
      catch (IOException e)
      {         
         return 0;
      }
       
   }
}
