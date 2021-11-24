/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Work_Space;

import Background.Admin_Logs;
import Background.Cache_Reader;
import static Background.Cache_Reader.reader;
import E_Mail.email_thread_common;
import Interfaces.Notification_Windows.Check_Box;
import Interfaces.Payment_Gateway;
import Interfaces.Notification_Windows.Verification;
import Interfaces.Notification_Windows.Verification_fail;
import Interfaces.new_member;
import My_SQL.Connector;
import My_SQL.Payment_Verification;
import My_SQL.Tax_Operations;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jayashanka Deshan
 */
public class Payments extends javax.swing.JInternalFrame {
    
    int Student_ID = 0;
    
    int values = 0;
    
    String mail_address = null;
    
    
    
    public Payments()
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        try
        {
            Student_ID = Integer.valueOf(Cache_Reader.reader("temp_user.dat"));
        }
        catch(Exception ERROR)
        {
            System.out.println("ERROR : "+ERROR);
        }
        
       reload();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        funds = new javax.swing.JLabel();
        index = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        box_1 = new javax.swing.JCheckBox();
        lable_8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1290, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/assignment_return_35px.png"))); // NOI18N
        jLabel1.setText("PAYMENTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 11, 259, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Card Status : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 181, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setText("SLTC Index :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, 181, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Member Name :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 181, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Total Fines :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 181, -1));

        name.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 89, 291, 31));

        status.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 26, 291, 31));

        funds.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jPanel2.add(funds, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 213, 291, 31));

        index.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jPanel2.add(index, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 151, 291, 31));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 59, 291, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 121, 291, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 183, 291, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 245, 291, 10));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Panal_6.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 300));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, 635, 303));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel12.setText("Verify Payment : ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 73, 196, 55));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel14.setText("Recipt ID : ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 148, 106, -1));

        jTextField1.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 148, 341, 32));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 181, 341, 3));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 73, -1, 459));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel15.setText("Payment Summery : ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, 196, 55));

        box_1.setBackground(new java.awt.Color(255, 255, 255));
        box_1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        box_1.setText("USER PAID ALL FUNDS UNDER HIS/HER ACCOUNT");
        box_1.setBorder(null);
        box_1.setFocusable(false);
        box_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_1ActionPerformed(evt);
            }
        });
        getContentPane().add(box_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 214, 451, -1));

        lable_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked_30px.png"))); // NOI18N
        getContentPane().add(lable_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1142, 148, -1, 36));

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/purchase_order_32px.png"))); // NOI18N
        jLabel17.setText("VERIFY PAYMENT");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 277, 242, -1));

        jLabel28.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/payment_history_32px.png"))); // NOI18N
        jLabel28.setText("DO PAYMENT");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 274, -1, 39));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/Payment_Animation.gif"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 340, 210, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_1ActionPerformed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked

           Payment_Gateway payment = new Payment_Gateway();
       
           payment.setVisible(true);
           
           try 
           {
               payment.get_data(index.getText(),name.getText(),"Fund For Late Book Return",funds.getText(),reader("Current_admin.dat"));
           } 
           catch (FileNotFoundException ex) 
           {
               Logger.getLogger(new_member.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        
        if(box_1.isSelected())
        {
            if(values == 1)
            {
                update_table();
                
                reload();
            }
            else
            {
                Verification_fail verification = new Verification_fail();
           
                verification.setVisible(true);
            }
        }
        else
        {
            Check_Box box = new Check_Box();
            
            box.setVisible(true);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
        int value = Payment_Verification.Income_Verification(jTextField1.getText(),index.getText());
        
        if(value == 1)
        {
            lable_8.setVisible(true);
            
            lable_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked_30px.png")));
                        
            values = 1;
       
        }
        else
        {
            lable_8.setVisible(true);
            
            lable_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel_30px.png")));
            
            values =0;
        }
    }//GEN-LAST:event_jTextField1KeyReleased
 
    // User Define Codes
    
    // Status Function Provide Card Sataus And Tax Values
    
    public void status()
    {
        int ID = Student_ID;
        
        int value = Tax_Operations.validation_tax(ID);
        
        String count = take_count.get_RowCount(ID);
        
        Integer counts = Integer.valueOf(count);
        
        String fund = Tax_Operations.tax_count(ID);
        
        if(counts == 3)
        {
            status.setText("Card Temporary Unavailable");
            
            function_disable.limited_functions_02();
        }
        else if((counts < 3) && (value == 1))
        {
            status.setText("Card Available");
            
            function_disable.basic_functions();
        }
        else if(value == 0)
        {
            status.setText("You Have To Do Payment");
            
            funds.setText(fund);
            
            function_disable.limited_functions_01();
           
        } 
    }

    // That function load user data
    
    public void user_dataLoad(int ID)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LIBRARY_USER WHERE USER_ID = '"+ID+"'";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {   
                index.setText(rs.getString("SLTC_INDEX"));
                
                name.setText(rs.getString("USER_NAME"));
                
                mail_address = rs.getString("EMAIL_ADDRESS");
                
            }
        }
        catch(Exception ERROR)
        {
          System.out.println("ERROR : "+ERROR);  
        }
                
        status();
    }
    
    //That function reload all data in that section
    public void reload()
    {
        user_dataLoad(Student_ID);
        
        lable_8.setVisible(false);
        
        jTextField1.setText("");
    }
    
    // That function update and reload all data
    
    public void update_table()
    {
        String SQL = "UPDATE RETURN_TABLE SET STATUS = 1 WHERE USER_ID = "+Student_ID+";";
        
        Connection connection =  Connector.connection();
        
        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.executeUpdate();
           
           String template = "You Just Paied LKR."+funds.getText()+".00 <br> Thanks You";
           
           email_thread_common thread = new  email_thread_common(mail_address,name.getText(),"Payment Notification",template,Student_ID);
                
           thread.start();
                
           Admin_Logs.write("Process Payment["+jTextField1.getText()+"] From User");
           
           reload();
           
           Verification verification = new Verification();
           
           verification.setVisible(true);
        }
        catch(SQLException ERROR)
        {
            System.out.println(ERROR);
            
           Verification_fail verification = new Verification_fail();
           
           verification.setVisible(true);
        }
    }
    
    
    

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box_1;
    private javax.swing.JLabel funds;
    private javax.swing.JLabel index;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lable_8;
    private javax.swing.JLabel name;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables

}