/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log_In_Services;

import Background.Admin_Logs;
import Background.Bugs;
import Interfaces.DataBase_Management.DB_Management;
import static Interfaces.home.pane;
import My_SQL.Connector;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jayashanka Deshan
 */
public class Request extends javax.swing.JFrame {

    /**
     * Creates new form Local_Account
     */
    public Request() 
    {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/Images/rocket_100px.png")).getImage());

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
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sid = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close_window_30px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 30, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("USE E ID CARD :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 430, 31));

        sid.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        sid.setBorder(null);
        sid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sidKeyReleased(evt);
            }
        });
        jPanel1.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 65, 386, 45));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 111, 383, 10));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 240, 40));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_rounded_up_30px.png"))); // NOI18N
        jLabel8.setText("VERIFY");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 430, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 430, 320));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/busy-working.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 510, 320));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel3.setText("ADMIN AUTHENTICATION REQUIRED");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background_01.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      
        close();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void sidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sidKeyReleased
       
    }//GEN-LAST:event_sidKeyReleased

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        if((sid.getText().length() == 10) && (validation_card() == 1))
        {
            pane.removeAll();
            
            DB_Management screen_06 = new  DB_Management();
            
            pane.add(screen_06).setVisible(true);
            
            Admin_Logs.write("Access Granted - > Log In To DB Management Section");
                        
            close();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"ERROR !! \nPlease Cheack The Login Details");
                        
            sid.setText("");
            
            sid.setEditable(true);
            
            Admin_Logs.write("Access Denied - > Fail to Log In DB Management Section");
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    
     public int validation_card()
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM  STAFF WHERE Admin_ID ="+Integer.valueOf(sid.getText())+"; ";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
                       
            if(!rs.next())
            {                
                return 0;
            }
            else
            {                
                return 1;
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
            
            return 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField sid;
    // End of variables declaration//GEN-END:variables
}
