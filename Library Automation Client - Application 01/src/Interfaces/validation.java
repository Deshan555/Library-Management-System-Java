/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interfaces.Notification_Windows.done_02;
import My_SQL.Connector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jayashanka Deshan
 */
public class validation extends javax.swing.JInternalFrame {


            
    File file;
    
    public validation() 
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        process.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        file_path = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        x = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        process = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        zdata = new javax.swing.JLabel();
        vdata = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        log_0 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        file_panal = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        log_1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        log_02 = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1280, 668));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 30)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/471-ebook-reader-outline.gif"))); // NOI18N
        jLabel1.setText("DATA VALIDATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 344, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file_submodule_30px.png"))); // NOI18N
        jLabel2.setText("Choose File :");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 158, -1));

        file_path.setEditable(false);
        file_path.setBackground(new java.awt.Color(255, 255, 255));
        file_path.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        file_path.setBorder(null);
        file_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_pathActionPerformed(evt);
            }
        });
        file_path.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                file_pathKeyReleased(evt);
            }
        });
        getContentPane().add(file_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 89, 414, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 120, 414, 10));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Number Of Records In Validatin File : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, 286, 41));

        x.setEditable(false);
        x.setBackground(new java.awt.Color(255, 255, 255));
        x.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        x.setBorder(null);
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 136, 124, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 162, 124, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/start_30px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        process.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        jLabel10.setText("Verfied Data :");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        jLabel11.setText("PROCESS :");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        jLabel12.setText("Zombies :");

        total.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        total.setText("0");

        zdata.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        zdata.setText("0");

        vdata.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        vdata.setText("0");

        javax.swing.GroupLayout processLayout = new javax.swing.GroupLayout(process);
        process.setLayout(processLayout);
        processLayout.setHorizontalGroup(
            processLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(processLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(processLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(processLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vdata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(processLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zdata, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        processLayout.setVerticalGroup(
            processLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(processLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(processLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vdata, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(processLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zdata, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(process, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 280, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel14.setText("Process Log");

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel15.setText("View Mode");

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel16.setText("Verified Items");

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel17.setText("Unverified Items");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        log_0.setEditable(false);
        log_0.setColumns(20);
        log_0.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        log_0.setRows(5);
        log_0.setBorder(null);
        jScrollPane1.setViewportView(log_0);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

        file_panal.setEditable(false);
        file_panal.setColumns(20);
        file_panal.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        file_panal.setRows(5);
        file_panal.setBorder(null);
        jScrollPane2.setViewportView(file_panal);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);

        log_1.setEditable(false);
        log_1.setColumns(20);
        log_1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        log_1.setRows(5);
        log_1.setBorder(null);
        jScrollPane3.setViewportView(log_1);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);

        log_02.setEditable(false);
        log_02.setColumns(20);
        log_02.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        log_02.setRows(5);
        jScrollPane4.setViewportView(log_02);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)
                        .addComponent(jLabel17)
                        .addGap(126, 126, 126)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1280, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        JFileChooser chooser = new  JFileChooser();
        
        chooser.setDialogTitle("Choose A File");
        
        chooser.setFileFilter(new File_Filter(".txt","text Files"));
        
        chooser.setFileFilter(new File_Filter(".csv","csv Files"));
        
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            file = chooser.getSelectedFile();
            
            get_Extension get_data = new get_Extension();
            
            String value = get_data.extension(file.toString());
            
            try
            {
                Scanner input = new Scanner(file);
                                
                setTitle(file.toString());
                 
                File_Handler get_value = new File_Handler();
                 
                get_value.handle(value,file.toString());
                
                file_path.setText(file.toString());

            }
            catch(Exception Error)
            {
                System.out.println(Error);
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    public void validation(String file) throws FileNotFoundException, SQLException
    {
        FileInputStream fileInputStream = new FileInputStream(file);

        Scanner scanner = new Scanner(fileInputStream);
        
        int pass = 0;
        
        int fail = 0;
        
        int process = 1;
        
        Connection connection = Connector.connection();

        while(scanner.hasNext())
        {
            String next = scanner.nextLine();

            System.out.print(next+"-------->");

            String SQL = "SELECT BOOK_ID,TITLE_OF_BOOK FROM BOOKS WHERE BOOK_ID = '"+next+"'";

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SQL);
            
           if(resultSet.next() == false)
            {                
                log_0.append(next+"----> Result Not Found\n\n");
                
                log_02.append(next+"\n\n");
                
                fail = fail + 1;
                
                zdata.setText(String.valueOf(fail));
            }
            else
            {
                log_0.append("Now Verify Book ID : "+next+"\nVerified :"+resultSet.getString("TITLE_OF_BOOK")+"\n\n");
                
                log_1.append(next+"\n\n");
                
                pass = pass + 1;
                
                vdata.setText(String.valueOf(pass));
            }
           
           total.setText(String.valueOf(process)+"/"+x.getText());
           
           process = process + 1;
        }
        
        log_0.append("All Done !!");
        
        done_02 done = new done_02();
        
        done.setVisible(true);
    }
    private void file_pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_file_pathActionPerformed

    public class verification implements Runnable
    {

        @Override
        public void run() 
        {
        try 
        {
            Thread.sleep(100);
                    
            validation(file.toString());
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(validation.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(validation.class.getName()).log(Level.SEVERE, null, ex);
        }   
        catch (InterruptedException ex) 
        {
                Logger.getLogger(validation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        process.setVisible(true);
        
        verification obj = new verification();
        
        Thread thread = new Thread(obj);
            
        thread.start();
        
        jLabel4.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void file_pathKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_file_pathKeyReleased
        
        if(file_path.getText().trim().isEmpty())
        {
            
        }
        else
        {
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file_submodule_30px.png")));
        }
    }//GEN-LAST:event_file_pathKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea file_panal;
    private javax.swing.JTextField file_path;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextArea log_0;
    private javax.swing.JTextArea log_02;
    private javax.swing.JTextArea log_1;
    private javax.swing.JPanel process;
    private javax.swing.JLabel total;
    private javax.swing.JLabel vdata;
    public static javax.swing.JTextField x;
    private javax.swing.JLabel zdata;
    // End of variables declaration//GEN-END:variables
}
