package Interfaces;

import java.io.File;

class get_Extension
{
  public static String extension(String name)
  {
    File file = new File(name);

    String fileName = file.toString();

    int index = fileName.lastIndexOf('.');
    
    String extension = null;
  
    if(index > 0) 
    {
      extension = fileName.substring(index + 1);
    
      System.out.println("File extension is " + extension);
    }
    
    return extension;
  }
}