package Interfaces;

import javax.swing.filechooser.FileFilter;

import java.io.File;

public class File_Filter extends FileFilter
{
    private String extension = null;

    private String description = null;


    public File_Filter(String extension,String description)
    {
        this.extension = extension;

        this.description = description;


    }

    @Override
    public boolean accept(File file)
    {
        if(file.isDirectory())
        {
            return true;
        }

        return file.getName().endsWith(extension);
    }

    @Override
    public String getDescription()
    {
        return description + String.format("(%s)",extension);
    }
}
