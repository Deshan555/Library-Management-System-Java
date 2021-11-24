/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Background.Network_Connection;
import E_Mail.mail_group;
import My_SQL.Payment_List;
import SQLite_03.Load_Settings;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jayashanka Deshan
 */
public class mail_Group extends javax.swing.JInternalFrame {

    /**
     * Creates new form open_screen
     */
    public mail_Group() 
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        Load_Settings  load = new  Load_Settings();
        
        mail.setText(load.load_settings("EMAIL"));
        
        sname.setText(load.load_settings("SENDER_NAME"));
        
        check_network();
    }
    
    public void check_network()
    {
        int data =  Network_Connection.net_connection();
        
        if(data == 1)
        {
           jLabel7.setText("Network Cnnection Available");
           
           jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked_30px.png"))); 
        }
        else
        {
            jLabel7.setText("Network Cnnection Disable");
            
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel_30px.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(null);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1280, 668));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 30)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/970-video-conference-outline.gif"))); // NOI18N
        jLabel3.setText("Mail Group");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 259, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setText("System Mail Address :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 94, 201, 49));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("From :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 158, 201, 49));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setText("To :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 296, 201, 49));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Subject :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 223, 201, 49));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Type Message :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 356, 201, 49));

        sname.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        sname.setBorder(null);
        getContentPane().add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 158, 365, 49));

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 221, 365, 49));

        mail.setEditable(false);
        mail.setBackground(new java.awt.Color(255, 255, 255));
        mail.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        mail.setBorder(null);
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 92, 365, 49));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked_30px.png"))); // NOI18N
        jLabel7.setText("Network Connection Available");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 260, -1));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Members", "Students Who have Payments", "All Members In ICT School", "All Members In Music School", "All Members In Buisness School", "All Members In Technology and Engineering School" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboBox1.setFocusable(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 304, 365, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 356, 740, 270));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 144, 365, 3));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 208, 365, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 273, 365, 10));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/send_comment_35px.png"))); // NOI18N
        jLabel8.setText("START QUEUE PROCESSING");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 580, 270, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tune_30px.png"))); // NOI18N
        jLabel9.setToolTipText("Mail Template Editor");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, 30, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background_01.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
        check_network();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        int data = Network_Connection.net_connection();
        
        if(data == 0)
        {
            JOptionPane.showMessageDialog(null,"You are offline There for queue processing Currently unavailable\nPlease Turn On Network Connection And Try ");
        }
        else
        {
            int choice = JOptionPane.showConfirmDialog(null,"Do You Really Want to Start Queue Process");
       
            if(choice == 0)
            {
                get_selection();
            }  
        }
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
        if(jComboBox1.getSelectedItem().equals("All Members"))
        {
            jTextArea1.setText("");
            
            jTextArea1.append("All Members Of SLTC Book Bucket System,");
        }
        if(jComboBox1.getSelectedItem().equals("Students Who have Payments"))
        {
            jTextArea1.setText("");
            
            try
            {
                reader("templates/Fund_Request.dat");
            }
            catch(Exception ERROR)
            {
                JOptionPane.showMessageDialog(null,ERROR);
            }
            
        }
        if(jComboBox1.getSelectedItem().equals("All Members In ICT School"))
        {
            jTextArea1.setText("");
            
            try
            {
                reader("templates/ICT_School.dat");
            }
            catch(Exception ERROR)
            {
                JOptionPane.showMessageDialog(null,ERROR);
            }
        }
        if(jComboBox1.getSelectedItem().equals("All Members In Music School"))
        {
            jTextArea1.setText("");
            
            try
            {
                reader("templates/Music_School.dat");
            }
            catch(Exception ERROR)
            {
                JOptionPane.showMessageDialog(null,ERROR);
            }
        }
        if(jComboBox1.getSelectedItem().equals("All Members In Buisness School"))
        {
            jTextArea1.setText("");
            
            try
            {
                reader("templates/Buisness_School.dat");
            }
            catch(Exception ERROR)
            {
                JOptionPane.showMessageDialog(null,ERROR);
            }
        }
        if(jComboBox1.getSelectedItem().equals("All Members In Technology and Engineering School"))
        {
             jTextArea1.setText("");
            
            try
            {
                reader("templates/Engineering_School.dat");
            }
            catch(Exception ERROR)
            {
                JOptionPane.showMessageDialog(null,ERROR);
            }
        }
   
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        new Mail_templates().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    public void reader(String file_name) throws FileNotFoundException
    {   
        FileInputStream fis = new FileInputStream(file_name);

        Scanner output = new Scanner(fis);
        
        String text = null;
        
         jTextArea1.setText("");

        while (output.hasNext())
        {
            text = output.nextLine();

             jTextArea1.append(text+"\n");
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
public void get_selection()
    {
        if(jComboBox1.getSelectedItem().equals("All Members"))
        {
            String sql = "SELECT * FROM LIBRARY_USER";
            
            String template = "<h5><p><pre>"+jTextArea1.getText()+"</pre></p></h5>";
            
            String subject = jTextField2.getText();
       
            mail_group.mail_group_sender(sql,template,subject);
            
            
        }
        if(jComboBox1.getSelectedItem().equals("Students Who have Payments"))
        {
            String template = "<h5><p><pre>"+jTextArea1.getText()+"</pre></p></h5>";
            
            String subject = jTextField2.getText();
            
            Payment_List.Payment_group(template, subject);
        }
        if(jComboBox1.getSelectedItem().equals("All Members In ICT School"))
        {
            String sql = "SELECT * FROM LIBRARY_USER WHERE SCHOOL = 'SCHOOL OF COMPUTING'";
            
            String template = "<h5><p><pre>"+jTextArea1.getText()+"</pre></p></h5>";
            
            String subject = jTextField2.getText();
            
            mail_group.mail_group_sender(sql,template,subject);
        }
        if(jComboBox1.getSelectedItem().equals("All Members In Music School"))
        {
            String sql = "SELECT * FROM LIBRARY_USER WHERE SCHOOL = 'SCHOOL OF MUSIC'";
             
            String template = "<h5><p><pre>"+jTextArea1.getText()+"</pre></p></h5>";
            
            String subject = jTextField2.getText();
            
            mail_group.mail_group_sender(sql,template,subject);
        }
        if(jComboBox1.getSelectedItem().equals("All Members In Buisness School"))
        {
            String sql = "SELECT * FROM LIBRARY_USER WHERE SCHOOL = 'SCHOOL OF BUISNESS'";
            
            String template = "<h5><p><pre>"+jTextArea1.getText()+"</pre></p></h5>";
            
            String subject = jTextField2.getText();
            
            mail_group.mail_group_sender(sql,template,subject);
        }
        if(jComboBox1.getSelectedItem().equals("All Members In Engineering School"))
        {
             String sql = "SELECT * FROM LIBRARY_USER WHERE SCHOOL = 'SCHOOL OF ENGINEERING'";
             
            String template = "<h5><p><pre>"+jTextArea1.getText()+"</pre></p></h5>";
            
            String subject = jTextField2.getText();
            
            mail_group.mail_group_sender(sql,template,subject);
        }
   
    }
     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField sname;
    // End of variables declaration//GEN-END:variables
}
