/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.E_Library;

import Background.Bugs;
import Interfaces.Notification_Windows.Delete;
import Interfaces.Notification_Windows.Update;
import My_SQL.Connector;
import Online_Services.Connect_Online;
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
public class panel_1_1 extends javax.swing.JFrame {

    String book_id = null;
    
    public panel_1_1(String id) 
    {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/Images/question_mark_30px.png")).getImage());
        
        this.book_id = id;
        
        extract_data();
    }
    
    
    public void extract_data()
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM movies WHERE MOVIE_ID = '"+book_id+"';";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                jTextField3.setText(book_id);
                
                jTextField1.setText(rs.getString("Movie_Title"));
                
                jTextField2.setText(rs.getString("URL"));
            }
            
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
    
    public void data_update()
    {
        String SQL = "UPDATE movies SET URL = '"+ jTextField2.getText()+"' WHERE MOVIE_ID = '"+book_id+"';";
        
        Connection connection =  Connector.connection();
        
        Connection conn = Connect_Online.Online();
        
        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.executeUpdate();
           
           PreparedStatement preparedStatement2 = conn.prepareStatement(SQL);

           preparedStatement2.executeUpdate();
           
           new Update().setVisible(true);
           
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
            
            JOptionPane.showMessageDialog(null,"SQL ERROR : \n"+ERROR);
        }
    }
    
    
    public void cascade_delete()
    {
        String SQL = "DELETE FROM movies WHERE MOVIE_ID = '"+book_id+"';";
                
        Connection connection = Connector.connection();
        
        Connection conn = Connect_Online.Online();
        
        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.executeUpdate();
           
           PreparedStatement preparedStatement_2 = conn.prepareStatement(SQL);

           preparedStatement_2.executeUpdate();
           
           new Delete().setVisible(true);
           
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
            
            JOptionPane.showMessageDialog(null,"SQL ERROR : \n"+ERROR);
        }
        
    }
    
    
    
    
    public static void main(String[] args)
    {
        new panel_1_1("130221060").setVisible(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Info Management - Movies");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Movie Link : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 148, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Movie ID : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 148, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Movie Name  : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, 148, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 86, 437, 38));

        jTextField2.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 147, 437, 38));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField3.setBorder(null);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 25, 437, 38));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/waste_30px.png"))); // NOI18N
        jLabel4.setText("Remove Item");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 249, 147, 42));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/available_updates_30px.png"))); // NOI18N
        jLabel5.setText("Update Item");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 249, 147, 42));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 64, 437, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 125, 437, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 186, 437, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background_01.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        int choice = JOptionPane.showConfirmDialog(null,"Do You Really Want to Update That Data");
        
        if(choice == 0)
        {
             data_update();
             
             panel_2.table_load();
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        int choice = JOptionPane.showConfirmDialog(null,"Do You Really Want to Remove That Item\nIt Can't Be Undone");
        
        if(choice == 0)
        {
            cascade_delete();
            
            panel_2.table_load();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
