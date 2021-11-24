package Sound_Profiles;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;

import javazoom.jl.player.Player;

public class Notifications 
{
    public static void play(String path) throws FileNotFoundException, JavaLayerException
    {
        FileInputStream fis = new FileInputStream(path);
            
        Player player = new Player(fis);
            
        player.play();
    }
}
