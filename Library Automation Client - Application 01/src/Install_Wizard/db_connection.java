/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Install_Wizard;

import static Install_Wizard.Install_wizard.install_wiz;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jayashanka Deshan
 */
public class db_connection extends javax.swing.JInternalFrame {

    /**
     * Creates new form icon
     */
    public db_connection() {
        initComponents();
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(989, 492));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel1.setText("Profile Name :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, 156, 37));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Sql Exe Path :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, 156, 37));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Port Address :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 231, 156, 37));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Password : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 296, 156, 37));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("DATABASE SERVER CONFIG ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 296, 37));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 94, 294, 37));

        jTextField2.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 163, 294, 37));

        jTextField3.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 232, 294, 37));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 132, 294, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 201, 294, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 270, 294, 6));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 335, 294, 10));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sandbox_30px.png"))); // NOI18N
        jLabel8.setText("Execute Query");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 395, 160, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file_30px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 87, 40, 40));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/computers_connecting_30px.png"))); // NOI18N
        jLabel9.setText("Test Connection");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 395, 170, 30));

        pass.setBorder(null);
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 296, 294, 37));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("Note : Only If Are You Use Local Host You Can Use That Section For Create Database Structure In Your My SQL Server");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 740, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/First_Launch/Test-at-speed.gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 390, 480));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/more_than_40px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 40, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        int choice = JOptionPane.showConfirmDialog(null,"That Operation Add New Database To Your Server \nAre You Still Want to Continue ?");

        if(choice == 0)
        {
            Push push = new Push();

            push.start();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        JFileChooser choose = new JFileChooser();

        choose.setFileSelectionMode(JFileChooser.FILES_ONLY);

        choose.showOpenDialog(this);

        try
        {
            File file = choose.getSelectedFile();

            String path = file.getAbsolutePath();

            jTextField1.setText(path);

        }
        catch(Exception ERROR)
        {
            //
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        connection();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
        install_wiz.removeAll();
        
        Connect_Prop screen = new Connect_Prop();
        
        install_wiz.add(screen).setVisible(true);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    public Connection connection()
    {
        Connection conn = null;
        
        String host = "localhost";
        
        String port = jTextField3.getText();
        
        String user_name = jTextField2.getText();
        
        String password = pass.getText();
        
        String db_name = "library";

        String database_url = "jdbc:mysql://"+host+":"+port+"/"+db_name;

        try
        {
           conn = DriverManager.getConnection(database_url, user_name, password);

           JOptionPane.showMessageDialog(null,"Connection Established");
        }
        catch (Exception ERROR)
        {
            JOptionPane.showMessageDialog(null,"Messages :\n"+ERROR);
        }
        return conn;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables


public class Push implements Runnable
{
    public Thread thread;
    
    public Push()
    {
          thread = new Thread(this);
    }

    @Override
    public void run() 
    {   
        
        String mysqlPath 	= jTextField1.getText();
		
        String dbUser 		= jTextField2.getText();
		
        String dbPassword 	= pass.getText();
		
        String backupFile 	= "db/SQL.sql";
        
        String[] executeCmd = new String[]{mysqlPath, "--user=" + dbUser, "--password=" + dbPassword, "-e", "source " + backupFile};
        
        Process runtimeProcess;
        
        try
        {
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            
            int processComplete = 0;
            
            processComplete = runtimeProcess.waitFor();
            
            if (processComplete == 0) 
            {
		String notification = "Backup restored successfully with " + backupFile;
                
                 JOptionPane.showMessageDialog(null,"MESSAGE \n"+notification);
            } 
            else 
            {
		String notification = "Could not restore the backup " + backupFile;
                
                JOptionPane.showMessageDialog(null,"MESSAGE \n"+notification);
            }
        }
        catch(Exception ERROR)
        {
             JOptionPane.showMessageDialog(null,"ERROR MESSAGE \n"+ERROR);
             
             System.out.print(ERROR);
        }
        
    }
    
    public void start()
    {
        thread.start();
    }
}

}













