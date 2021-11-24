package Interfaces;

import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class File_Chooser extends javax.swing.JFrame 
{

    public File_Chooser() 
    {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/Images/top_menu_48px.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chooser.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        getContentPane().add(chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new File_Chooser().setVisible(true);
                

            File file = chooser.getSelectedFile();
            
            try
            {
                Scanner input = new Scanner(file);
                
                while(input.hasNext())
                {
                    System.out.println(input.nextLine());
                }
            }
            catch(Exception Error)
            {
                System.out.println(Error);
            }
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JFileChooser chooser;
    // End of variables declaration//GEN-END:variables
}
