/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.DataBase_Management;

import Background.get_localDate;
import My_SQL.My_SQL_CSV;
import My_SQL.SQL_Dump;
import SQLite_03.Load_Location;
import SQLite_03.Load_SQL;
import com.sbix.jnotify.NPosition;
import com.sbix.jnotify.NoticeType;
import com.sbix.jnotify.NoticeWindow;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jayashanka Deshan
 */
public class DB_Backup extends javax.swing.JInternalFrame {

    /**
     * Creates new form Properties
     */
    public DB_Backup()
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        ButtonGroup group = new ButtonGroup();
        
        group.add(box_1);
        
        group.add(box_2);
        
        get_fileList();
                          
    }
    
    public static void install_dump() throws FileNotFoundException
    {        
        String fileName = "SQL_DUMP_"+get_localDate.LocalDate()+"_.sql";
        
        String dbName = Load_SQL.load_settings("DBNAME");
        
        String dbUser = Load_SQL.load_settings("UNAME");
         
        String dbPort = Load_SQL.load_settings("PORT");
          
        String dbHost = Load_SQL.load_settings("HOST");
           
        String dbPass = Load_SQL.load_settings("PASSWORD");
        
        String dumpExe = Load_Location.load_settings("DUMPEXE"); // Select .exe for make dump
        
        String dumpSavePath = Load_Location.load_settings("SQLDUMP");
        
        int i = SQL_Dump.Make_dump(dbHost, dbPort, dbUser, dbPass, dbName, dumpExe, dumpSavePath, fileName);
        
        jTextField6.setText(dumpSavePath+fileName);
        
        if(i == 1)
        {
            new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Dump Save In"+dumpSavePath+fileName,NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
        }
        else
        {
            new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"Can't Create SQL DUMP",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
        }
    }

    public class Thread_02 implements Runnable
    {
        @Override
        public void run() 
        {
            try 
            {
                install_dump();
            } 
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(DB_Backup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        box_1 = new javax.swing.JRadioButton();
        box_2 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cmd = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 550));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/data_backup_35px.png"))); // NOI18N
        jLabel15.setText("Backup Database");

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel13.setText("Select an Option :");

        box_1.setBackground(new java.awt.Color(255, 255, 255));
        box_1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        box_1.setText("Full Sql Backup");
        box_1.setFocusable(false);
        box_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_1ActionPerformed(evt);
            }
        });

        box_2.setBackground(new java.awt.Color(255, 255, 255));
        box_2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        box_2.setText("Table To CSV");
        box_2.setFocusable(false);
        box_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel12.setText("Backup File Path :");

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play_30px.png"))); // NOI18N
        jLabel14.setText("Backup Now");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sql_28px.png"))); // NOI18N
        jLabel1.setText("Available SQL Backups : ");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        cmd.setEditable(false);
        cmd.setBackground(new java.awt.Color(0, 0, 0));
        cmd.setColumns(20);
        cmd.setForeground(new java.awt.Color(255, 255, 255));
        cmd.setRows(5);
        cmd.setBorder(null);
        jScrollPane1.setViewportView(cmd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(box_1)
                                .addGap(31, 31, 31)
                                .addComponent(box_2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 481, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel15)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13))
                    .addComponent(box_1)
                    .addComponent(box_2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_2ActionPerformed

    private void box_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        int choice = JOptionPane.showConfirmDialog(null,"Do You Really Want to Backup Database"); // Get User Choice
        
        if(choice == 0)
        {
            if(box_1.isSelected())
        {
            Thread_02 obj = new Thread_02();

            Thread thread = new Thread(obj);

            thread.start();
            
            get_fileList();
        }
        else
        {
            My_SQL_CSV obj = new  My_SQL_CSV();

            obj.start();
        }
        }
        

    }//GEN-LAST:event_jLabel14MouseClicked

    
    
    public static void get_fileList()
    {
        cmd.setText("");
        
        Load_Location location = new Load_Location();
        
        String path = location.load_settings("SQLDUMP");
        
        File folder = new File(path);
        
        File[] listOfFiles = folder.listFiles();
        
        BasicFileAttributes data;
        
        int count = 1;
        
        for(int i = 0;i < listOfFiles.length;i++)
        {
            if(listOfFiles[i].isFile())
            {
                String name = listOfFiles[i].getName();
                
                long size = listOfFiles[i].length();
                
                String path_ = listOfFiles[i].getAbsolutePath();
                
                cmd.append(count+". \nBackup Name : "+name+"\nBackup File Size : "+size+" Bytes\nFile Path : "+path_+"\n\n");
                
                count ++;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton box_1;
    private javax.swing.JRadioButton box_2;
    private static javax.swing.JTextArea cmd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
