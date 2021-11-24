/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author whatd
 */
public class Editor extends javax.swing.JFrame {

    File file;
    
    public Editor(String data) throws FileNotFoundException 
    {
        initComponents();
        
        reader(data);
        
        int length = panel.getText().length();
        
        String size = String.valueOf(length);
        
        jLabel4.setText("Words : "+size+" | Lines : "+panel.getLineCount());
        
         setIconImage(new ImageIcon(getClass().getResource("/Images/edit_30px_2.png")).getImage());
         
         file = new File(data);
         
         path.setText(file.getAbsolutePath());
    }
    
    
    
    
    public void data_save()
    {
        try
        {        
        FileOutputStream details = new FileOutputStream(file.getAbsoluteFile());

        PrintWriter file = new PrintWriter(details);

        BufferedWriter store = new BufferedWriter(file);

        store.write(panel.getText());
                
        store.newLine();

        store.close();

        file.close();
        
        JOptionPane.showMessageDialog(null,"Changes Saved Succesfully !");
        }
        catch(Exception error)
        {
            System.out.println("ERROR : "+error);
            
            JOptionPane.showMessageDialog(null,ERROR);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        path = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        path.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        path.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save_all_30px.png"))); // NOI18N
        path.setText("Current File : ");
        path.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pathMouseClicked(evt);
            }
        });
        getContentPane().add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 800, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit_40px.png"))); // NOI18N
        jLabel5.setText("Template Editor ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nirvana/Hedder_Bar.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 468, 850, 50));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 10, 220, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nirvana/Hedder_Bar.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 59));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        panel.setColumns(20);
        panel.setRows(5);
        panel.setBorder(null);
        panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(panel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 850, 400));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background_01.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelKeyPressed
        
        int length = panel.getText().length();
        
        String size = String.valueOf(length);
        
        jLabel4.setText("Words : "+size+" | Lines : "+panel.getLineCount());
    }//GEN-LAST:event_panelKeyPressed

    private void pathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pathMouseClicked
        
        data_save();
        
         try 
        {
            reader(String.valueOf(file));
        } 
        catch(FileNotFoundException ex)
        {
            System.out.println("ERROR CODE : "+ERROR);
        }
    }//GEN-LAST:event_pathMouseClicked

    public void reader(String file_name) throws FileNotFoundException
    {   
        FileInputStream fis = new FileInputStream(file_name);

        Scanner output = new Scanner(fis);
        
        String text = null;
        
        panel.setText("");

        while (output.hasNext())
        {
            text = output.nextLine();

            panel.append(text+"\n");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea panel;
    private javax.swing.JLabel path;
    // End of variables declaration//GEN-END:variables
}
