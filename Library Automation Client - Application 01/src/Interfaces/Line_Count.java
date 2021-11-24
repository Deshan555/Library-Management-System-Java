package Interfaces;

import java.io.IOException;

import java.net.URI;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;

public class Line_Count
{
    public static int count_line(String path) throws IOException
    {
      URI fileName = null;
    
      Path path_ = Paths.get(fileName);

      long lines = 0;
      
      try 
      {
          lines = Files.lines(path_).count();
          
          System.out.println(lines);

      }
      catch (IOException error) 
      {
          System.out.println(error);
      }
      
      return (int) lines;
    }
}

