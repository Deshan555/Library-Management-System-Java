/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import BootUpServices.Open_Config;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jayashanka Deshan
 */
public class System_Tray 
{
    static TrayIcon trayicon;
    
    public System_Tray() 
    {
        Show_SystemTray();
    }
    
    public static void Show_SystemTray()
    {
        if(!SystemTray.isSupported())
        {
            System.out.print("System ICON Not Supported");
            
            return;
        }
        
        final PopupMenu popup = new PopupMenu();
        
        trayicon = new TrayIcon(CreateImg("/Images/bluelock_16px.png","Tray Icon"));
        
        final SystemTray tray = SystemTray.getSystemTray();
        
        trayicon.setToolTip("Version 1.5\nSBB Access");
        
        MenuItem AboutItem = new MenuItem("DB Config Utility");
        
        MenuItem Exit = new MenuItem("Shut Down System");
        
        popup.add(AboutItem);
        
        popup.addSeparator();
                
        popup.add(Exit);
        
        trayicon.setPopupMenu(popup);
        
        Exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                int choice = JOptionPane.showConfirmDialog(null,"Are You Want Close That Application ?");
                
                if(choice == 0)
                {
                    System.exit(0);
                }
            }
        });
        
        
        AboutItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                Open_Config.Exe_Open();
            }
        });
        
        
        try
        {
            tray.add(trayicon);
        }
        catch(Exception ERROR)
        {
            System.out.print("System ICON Not Supported"+ERROR);
        }
    }
    
    protected static Image CreateImg(String path,String dest)
    {
        URL ImageURL = System_Tray.class.getResource(path);
        
        return (new ImageIcon(ImageURL,dest)).getImage();
    }
}
