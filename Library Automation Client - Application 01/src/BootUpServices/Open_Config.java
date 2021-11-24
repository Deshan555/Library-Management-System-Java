
package BootUpServices;

import Background.Bugs;

public class Open_Config 
{
    public static void Exe_Open()
    {
        try
        {
            Process process = Runtime.getRuntime().exec("Settings.exe");
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }
}
