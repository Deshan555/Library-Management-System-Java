package Background;

import java.io.File;

public class Remove
{
    public static void delete_file(String file_name)
    {
        File file = new File(file_name);
                
        if(file.exists())
        {
            file.delete();
        }        
    }
    
    
   public static void main(String[] args)
   {
       delete_file("temp_user.dat");
   }
}
