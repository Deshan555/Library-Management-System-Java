/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Background.Bugs;
import Background.Config;
import Background.time_management;
import BootUpServices.Notification_List;
import static BootUpServices.Notification_List.extract_data;
import My_SQL.Connector;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Jayashanka Deshan
 */
public class Due_Item extends javax.swing.JInternalFrame {

    /**
     * Creates new form open_screen
     */
    public Due_Item()
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        table.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        
        table.setBackground(new Color(255,255,255));
        
        table.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        
        table.getTableHeader().setOpaque(false);
        
        table.getTableHeader().setBackground(Color.white);
        
        //jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
        
        lending_table();
        
    }
    
    
    public void lending_table()
    {
        String SQL = "SELECT * FROM LEND_TABLE;";

        String get_date = null;
        
        Connection connection = Connector.connection();

        try
        {
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery(SQL);

            while(rs.next())
            {
                get_date = rs.getString("DUE_DATE");

                int return_data = time_management.time_management(get_date);

                if(return_data < 0)
                {
                    System.out.println("Data : "+get_date+"\n");
                    
                    String id = rs.getString("LEND_ID");
                    
                    table_load(id);
                }
                
            }
        }
        catch (Exception ERROR)
        {
            System.out.println(ERROR);

            Bugs.exceptions(String.valueOf(ERROR));
        }

    }
    
    public void table_load(String id)
    {
        Connection connection = Connector.connection();
        
        String SQL = "SELECT * FROM LEND_TABLE WHERE LEND_ID = '"+id+"' ";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new Interfaces.Table_Modify.Table();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1280, 668));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 30)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/45-clock-time-outline.gif"))); // NOI18N
        jLabel3.setText("DUE ITEMES TRACKER ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notification_32px.png"))); // NOI18N
        jLabel1.setText("Send Reminder Mail");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 220, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1250, 70));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setOpaque(false);

        table.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Author", "Due Date"
            }
        )
        {
            public boolean isCellEditable(int rowIndex,int colIndex)
            {
                return false;
            }
        }
    );
    table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    table.setFocusable(false);
    table.setGridColor(new java.awt.Color(204, 204, 204));
    table.setIntercellSpacing(new java.awt.Dimension(0, 0));
    table.setRowHeight(25);
    table.setSelectionBackground(new java.awt.Color(142, 235, 196));
    table.getTableHeader().setReorderingAllowed(false);
    table.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tableMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(table);

    getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1260, 480));

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/services_30px.png"))); // NOI18N
    jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel2MouseClicked(evt);
        }
    });
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1224, 10, 40, 50));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
       int option = JOptionPane.showConfirmDialog(null,"Do You Really Want Perform That Action");
       
       if(option == 0)
       {
            Notification_List list = new Notification_List();
            
            list.start();
       }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        new Setup().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
