/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Background.Admin_Logs;
import Background.Bugs;

import My_SQL.Connector;

import java.awt.Color;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

/**
 *
 * @author whatd
 */
public class Update_Admin extends javax.swing.JFrame {

    Integer Student_ID = 0;
    
    String password = null;

    public Update_Admin(String ID) 
    {
        initComponents();
        
        Student_ID = Integer.valueOf(ID);
        
        setIconImage(new ImageIcon(getClass().getResource("/Images/edit_30px_2.png")).getImage());
    }

    
    
    public String check_password()
    {
        Connection connection =  Connector.connection();
        
        String sql = "SELECT * FROM STAFF WHERE ADMIN_ID = "+Student_ID+ " ";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
               password = rs.getString("PASSWORD");
            }
            
            return password;
        }
        catch(SQLException ERROR)
        {
             Bugs.exceptions(String.valueOf(ERROR));
             
             return String.valueOf(ERROR);
        }

    }

    public void update_password()
    {
        String SQL = "UPDATE STAFF SET PASSWORD = '"+jPasswordField1.getText()+"' WHERE ADMIN_ID = "+Student_ID+"";
        
        Connection connection =  Connector.connection();
                
        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.executeUpdate();
           
           Admin_Logs.write("Update Admin Password");
           
           JOptionPane.showMessageDialog(null,"Admin Password Update Succssfully");
           
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
            
            Admin_Logs.write("Access Denied - > Fail to Update Password");
            
            JOptionPane.showMessageDialog(null,"ERROR CODE : "+ERROR);
        }
        
    }

    public void field_validation()
    {
        if((jPasswordField2.getText().equals(check_password())) && (jPasswordField3.getText().equals(jPasswordField1.getText())))
        {
            update_password();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Something Wrong Check Again");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Admin Password");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Retype Password : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, 195, 46));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Current Password : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, 182, 46));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("New Password : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, 182, 46));

        jPasswordField1.setBorder(null);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 195, 336, 46));

        jPasswordField2.setBorder(null);
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyReleased(evt);
            }
        });
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 39, 336, 46));

        jPasswordField3.setBorder(null);
        getContentPane().add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 118, 336, 46));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 86, 336, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 165, 336, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 242, 336, 10));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update_30px.png"))); // NOI18N
        jLabel4.setText("UPDATE PASSWORD");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 279, -1, 52));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background_01.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        int choice = JOptionPane.showConfirmDialog(null,"Do You Really Want to Update That Data");
        
        if(choice == 0)
        {
            field_validation();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jPasswordField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyReleased
        
        if(jPasswordField2.getText().equals(check_password()))
        {
            jPasswordField2.setForeground(Color.BLACK);
        }
        else
        {
            jPasswordField2.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jPasswordField2KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
