/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Background.Bugs;
import BootUpServices.Test_Connection;

import First_Launch.Check_Directory;
import Install_Wizard.Install_wizard;


import Log_In_Services.Log_In;

import java.awt.Toolkit;

import java.awt.event.WindowEvent;

import java.io.IOException;
import javax.swing.ImageIcon;

public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() 
    {
        initComponents();
            
        setIconImage(new ImageIcon(getClass().getResource("/Images/rocket_100px.png")).getImage());
    }
    
    public void booting() throws IOException
    {
        int find = Check_Directory.check_directory();
        
        if(find == 0)
        {
             new Install_wizard().setVisible(true);
                         
        }
        else
        {
            Test_Connection testing = new Test_Connection();
            
            testing.start();
        }
    }
    
    public void close()
    {
        WindowEvent new_event;
        
        new_event = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(new_event);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-md.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 489, 182));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rocket_30px.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 650, 1310, 40));

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.setForeground(new java.awt.Color(51, 51, 51));
        bar.setBorderPainted(false);
        bar.setFocusable(false);
        bar.setOpaque(true);
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 700, 1390, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nirvana/Main_Screen.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[])
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }

        Welcome welcome = new Welcome();
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                welcome.setVisible(true);     
            }
        });
        
        try
        {
            for(int i = 0;i <= 100;i++)
            {
                Thread.sleep(40);
                
                bar.setValue(i);
                
                jLabel3.setText("APPLICATION LAUNCHING : "+Integer.valueOf(i)+"%");                            
            }
            
            Welcome boot = new Welcome();
                
            boot.booting();
                        
            welcome.dispose();
        }
        catch(IOException | InterruptedException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
            
            jLabel3.setText("Error : Something Wrong");
        }
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
