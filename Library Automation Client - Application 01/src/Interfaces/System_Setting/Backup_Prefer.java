/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.System_Setting;

import Background.Bugs;
import SQLite_03.Load_Location;
import SQLite_03.Save_Location;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jayashanka Deshan
 */
public class Backup_Prefer extends javax.swing.JInternalFrame {

    /**
     * Creates new form mail_setting
     */
    public Backup_Prefer() 
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        load_settings();
        
    }
    
    
    
    
   public void load_settings()
    {
        Load_Location location = new Load_Location();
        
        jTextField1.setText(location.load_settings("SQLDUMP"));
        
        jTextField3.setText(location.load_settings("CSV"));
        
        jTextField4.setText(location.load_settings("SQLEXE"));
        
        jTextField5.setText(location.load_settings("DUMPEXE"));
        
        int i = Integer.valueOf(location.load_settings("AUTOMATIC"));
        
        if(i == 1)
        {
            Activated.setSelected(true);
          
        }
        else
        {
             Activated.setSelected(false);
             
        }
    }
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Activated = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1081, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 506, 269, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/work_35px.png"))); // NOI18N
        jLabel5.setText("BACKUP PREFERENCES");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 454, 48));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel7.setText("SQL Dump Store Path :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 200, 39));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("CSV Backup Store Path :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, -1, 39));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("My SQL EXE Path :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, -1, 39));

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel13.setText("My SQL DUMPEXE Path :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 316, -1, 39));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 81, 451, 47));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField3.setBorder(null);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 158, 451, 47));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 312, 451, 47));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField4.setBorder(null);
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 235, 451, 47));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder_30px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 98, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder_30px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 175, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder_30px.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 252, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder_30px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 329, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Automatic Backup Service  :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 389, 243, 39));

        Activated.setBackground(new java.awt.Color(255, 255, 255));
        Activated.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        Activated.setFocusable(false);
        Activated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivatedActionPerformed(evt);
            }
        });
        jPanel2.add(Activated, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 389, 130, 30));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sync_settings_30px.png"))); // NOI18N
        jLabel12.setText("UPDATE SETTING");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 200, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 130, 451, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 207, 451, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 284, 451, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 361, 451, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        JFileChooser choose = new JFileChooser();

        choose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        choose.showOpenDialog(this);

        try
        {
            File file = choose.getSelectedFile();

            String path = file.getAbsolutePath();
            
            path = path+"\\";

            jTextField1.setText(path);

        }
        catch(Exception ERROR)
        {
            System.out.println("Something Wrong : "+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        JFileChooser choose = new JFileChooser();

        choose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        choose.showOpenDialog(this);

        try
        {
            File file = choose.getSelectedFile();

            String path = file.getAbsolutePath();
            
            path = path+"\\";

            jTextField3.setText(path);

        }
        catch(Exception ERROR)
        {
            System.out.println("Something Wrong : "+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        JFileChooser choose = new JFileChooser();

        //choose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        choose.showOpenDialog(this);

        try
        {
            File file = choose.getSelectedFile();

            String path = file.getAbsolutePath();

            jTextField4.setText(path);

        }
        catch(Exception ERROR)
        {
            System.out.println("Something Wrong : "+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }

    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        JFileChooser choose = new JFileChooser();

        //choose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        choose.showOpenDialog(this);

        try
        {
            File file = choose.getSelectedFile();

            String path = file.getAbsolutePath();

            jTextField5.setText(path);

        }
        catch(Exception ERROR)
        {
            System.out.println("Something Wrong : "+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void ActivatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivatedActionPerformed
        
        
    }//GEN-LAST:event_ActivatedActionPerformed

    
    public void update()
    {
        int i = 0;
        
        if(Activated.isSelected())
        {

            i = 1;
        }
        else
        {            
            i = 0;            
        }
        try
        {
            Save_Location. save_settings(String.valueOf(i),jTextField5.getText(),jTextField4.getText(),jTextField3.getText(),jTextField1.getText());
            
            JOptionPane.showMessageDialog(null,"Settings Update Successfully \nTake a Look");
            
            load_settings();
        }
        catch(Exception ERROR)
        {
            JOptionPane.showMessageDialog(null,"UPDATE FAIL ERROR : "+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
            
            load_settings();
        }
    }
    
     
    
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

       int choice = JOptionPane.showConfirmDialog(null,"Do You Really Want to Update Settings");
       
       if(choice == 0)
       {
           update();
       }

    }//GEN-LAST:event_jLabel12MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Activated;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
