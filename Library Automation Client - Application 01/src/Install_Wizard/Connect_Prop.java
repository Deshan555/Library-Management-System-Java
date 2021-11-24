/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Install_Wizard;

import static Install_Wizard.Install_wizard.install_wiz;
import SQLite_03.Save_SQL;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jayashanka Deshan
 */
public class Connect_Prop extends javax.swing.JInternalFrame {

    /**
     * Creates new form icon
     */
    public Connect_Prop()
    {
        initComponents();
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        jLabel10.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(989, 492));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel1.setText("Profile Name :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, 156, 37));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Schema Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 156, 37));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Port Address :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 246, 156, 37));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Password : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 302, 156, 37));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Host Address :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, 156, 37));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("REMOTE SERVER CONNECTION ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 37));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField1.setText("library");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 67, 294, 37));

        jTextField2.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 127, 294, 37));

        jTextField3.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 247, 294, 37));

        jTextField4.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField4.setBorder(null);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 187, 294, 37));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 105, 294, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 165, 294, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 225, 294, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 285, 294, 6));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 341, 294, 10));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save_all_30px.png"))); // NOI18N
        jLabel8.setText("Save And Test Connection");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 260, 30));

        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 290, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/First_Launch/image_(4).gif"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 450, 420));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/more_than_40px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 40, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        save_data();

        Thread_01 thread_ = new Thread_01();

        thread_.start();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
        install_wiz.removeAll();
        
        Admin_Account screen = new Admin_Account();
        
        install_wiz.add(screen).setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    
    
    public void save_data()
    {
        int save = Save_SQL.save_settings(jTextField4.getText(),jTextField3.getText(),jTextField2.getText(),jTextField1.getText(),jPasswordField1.getText());
        
        if(save == 1)
        {
            JOptionPane.showMessageDialog(null,"UPDATE COMPLETE");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"SOMETHING WRONG");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
