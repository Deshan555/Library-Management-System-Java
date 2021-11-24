
package Sound_Profiles;

import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;


public class Profiles 
{
     public static void fail() throws FileNotFoundException, JavaLayerException
     {
         try
         {
             Notifications.play("Voices/system-fault-518.mp3");
         }
         catch(Exception ERROR)
         {
             Notifications.play("Voices/case-closed-531.mp3");
         }
     }
     
     public static void done() throws FileNotFoundException, JavaLayerException
     {
          try
          {
            Notifications.play("Voices/Complete.mp3");
          }
          catch(Exception ERROR)
          {
            Notifications.play("Voices/case-closed-531.mp3");        
          }
     }
    
}
