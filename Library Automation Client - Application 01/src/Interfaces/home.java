/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Background.Bugs;
import Background.Cache_Reader;
import Background.Config;
import BootUpServices.Automatic_Backup;
import BootUpServices.Background_Testing;
import BootUpServices.Notification_List;
import Interfaces.Work_Space.Compact_Design;
import Log_In_Services.Request;
import SQLite_03.Load_Location;
import System.System_Tray;
import com.sbix.jnotify.NPosition;
import com.sbix.jnotify.NoticeType;
import com.sbix.jnotify.NoticeWindow;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;

// Icon color HEX Format = #2E2C2C - for side bar

public class home extends javax.swing.JFrame {

    Integer value;
    
    System_Tray display = new System_Tray();
         
    public home() throws FileNotFoundException 
    {
        initComponents();
        
        pane.removeAll();
        
        open_screen screen = new open_screen();
        
        pane.add(screen).setVisible(true);
        
        Cache_Reader obj = new Cache_Reader();
        
        String admin_name = obj.reader("Current_admin.dat");
                
        int i = Integer.valueOf(Load_Location.load_settings("AUTOMATIC"));
        
        if(i == 1)
        {
            Automatic_Backup backup = new Automatic_Backup();
            
            backup.run();
        }
        else
        {
            new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"Automatic Backup Function Currently Disable.\n\nWe Recommand To Turn It On Or Make Manual Backup\n",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
        }
        
        Integer value = Integer.valueOf(Config.get_properties("auto_notification"));
        
        if(value == 1)
        {
            //Notification List : That Method send notifications
        
              Notification_List list = new Notification_List();
        
              list.start();
        }
        
        setIconImage(new ImageIcon(getClass().getResource("/Images/bluelock_64px.png")).getImage());
        
        Background_Testing testing = new Background_Testing();
        
        testing.start();
        
        
    }
    
    public class thread_01 implements  Runnable
    {

        @Override
        public void run() 
        {
           Automatic_Backup abackup = new  Automatic_Backup();
         
           abackup.run();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pane = new javax.swing.JDesktopPane();
        jLabel15 = new javax.swing.JLabel();

        jMenuItem1.setText("Quick Note");
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SBB Access");
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(false);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1359, 730));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashboard_40px.png"))); // NOI18N
        jLabel5.setToolTipText("Dashboard");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ok_25px.png"))); // NOI18N
        jLabel4.setText("DATABASE ONLINE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, 190, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Picture3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nirvana/Hedder_Bar.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/workspace_40px.png"))); // NOI18N
        jLabel6.setToolTipText("Workspace");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 190, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_40px.png"))); // NOI18N
        jLabel7.setToolTipText("View Books And Update Info");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_40px.png"))); // NOI18N
        jLabel9.setToolTipText("Add New Books");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 260, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/validation_40px.png"))); // NOI18N
        jLabel10.setToolTipText("Data Validation Section");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/database_40px.png"))); // NOI18N
        jLabel11.setToolTipText("BD Management");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view_more_40px.png"))); // NOI18N
        jLabel12.setToolTipText("More");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/team_40px.png"))); // NOI18N
        jLabel3.setToolTipText("View And Update Info Of Members");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_user_group_woman_man_40px.png"))); // NOI18N
        jLabel13.setToolTipText("Add New Members");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        pane.setComponentPopupMenu(jPopupMenu1);

        javax.swing.GroupLayout paneLayout = new javax.swing.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nirvana/Slide_Bar.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
                
        pane.removeAll();
        
        Statics screen_06 = new Statics();
        
        pane.add(screen_06).setVisible(true);
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       
        pane.removeAll();
        
        Members screen_03 = new Members();
        
        pane.add(screen_03).setVisible(true);
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
        pane.removeAll();
        
        add_books screen_02 = null;
        try 
        {
            screen_02 = new add_books();
        }
        catch(FileNotFoundException ex)
        {
            Bugs.exceptions(String.valueOf(ex));
        }
        
        pane.add(screen_02).setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

       pane.removeAll();
      
       Compact_Design design = new Compact_Design();
      
       pane.add(design).setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
                
        pane.removeAll();
        
        validation screen_06 = new validation();
        
        pane.add(screen_06).setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    
        pane.removeAll();

        Search_Books screen_01 = new Search_Books();
        
        pane.add(screen_01).setVisible(true);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        
        pane.removeAll();
        
        new_member screen_05 = new new_member();
        
        pane.add(screen_05).setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
         
        new Advance().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

       
       new Request().setVisible(true);
            
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

   
    public static void main(String args[]) 
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                try 
                {
                    new home().setVisible(true);
                }
                catch (FileNotFoundException ex)
                {
                    Bugs.exceptions(String.valueOf(ex));
                }
            }
        });
        
    
        
 
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    public static javax.swing.JDesktopPane pane;
    // End of variables declaration//GEN-END:variables
}
