/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Background.Bugs;
import My_SQL.Connector;
import My_SQL.Profit_CSV;
import My_SQL.Tax_Operations;
import My_SQL.total_fund;
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
public class Income extends javax.swing.JInternalFrame {

    String ID = null;
    
    public Income() 
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
        
        table_load();
        
        data_load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1280, 668));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 30)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/290-coin-outline.gif"))); // NOI18N
        jLabel3.setText("INCOME MANAGEMENT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 70));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setOpaque(false);

        table.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        table.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        table.setForeground(new java.awt.Color(51, 51, 51));
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
                "Book ID", "Book Name", "Author", "Title 4"
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
    table.setGridColor(new java.awt.Color(255, 255, 255));
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

    getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 610, 390));

    jLabel14.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(51, 51, 51));
    jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view_30px.png"))); // NOI18N
    jLabel14.setText("VIEW ");
    jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel14MouseClicked(evt);
        }
    });
    getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 580, 130, 44));

    jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(51, 51, 51));
    jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/export_csv_30px.png"))); // NOI18N
    jLabel15.setText("EXPORT");
    jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel15MouseClicked(evt);
        }
    });
    getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 580, 150, 40));

    jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Panal_2.png"))); // NOI18N
    getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 640, 450));

    jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Panal_5.png"))); // NOI18N
    getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 600, 60));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel18.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cut_paper_30px.png"))); // NOI18N
    jLabel18.setText("Total Damage Items Fine Count :");
    jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 189, 501, 52));

    jLabel19.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registration_30px.png"))); // NOI18N
    jLabel19.setText("Total Registeration Fine Count :");
    jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 501, 52));

    jLabel20.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/data_pending_30px.png"))); // NOI18N
    jLabel20.setText("Pending Fine Count : ");
    jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 353, 501, 52));

    jLabel21.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sand_clock_30px.png"))); // NOI18N
    jLabel21.setText("Total Over Due Items Fine Count :");
    jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, 501, 52));

    jLabel22.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/packing_30px.png"))); // NOI18N
    jLabel22.setText("Total Fine Count : ");
    jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 271, 510, 52));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 530, 440));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
         
        int row = table.getSelectedRow();
        
        ID = table.getValueAt(row,0).toString();
        
    }//GEN-LAST:event_tableMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        if(ID.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Select A Record Before View It");
        }
        else
        {
            new View_Payment(ID).setVisible(true);
        }
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        
       int choice = JOptionPane.showConfirmDialog(null,"Do You Want Create Backup");
       
       if(choice == 0)
       {
           String message = Profit_CSV.profit_csv();
           
            JOptionPane.showMessageDialog(null,message);
       }
    }//GEN-LAST:event_jLabel15MouseClicked


    public void table_load()
    {
        Connection connection = Connector.connection();
        
        String SQL = "SELECT RECIPT_NUMBER,DATE,VALUE,DISCRIPTION FROM PROFIT";
        
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
    
    public void data_load()
    {
        jLabel22.setText("Total Fine Count : LKR "+total_fund.fund()+".00");
        
        jLabel19.setText("Total Registeration Fine Count : LKR "+total_fund.fund_Register()+".00");
        
        jLabel21.setText("Total Over Due Items Fine Count : LKR "+total_fund.fund_Late()+".00");
        
        jLabel18.setText("Total Damage Items Fine Count : LKR "+total_fund.fund_damage()+".00");        
        
        jLabel20.setText("Pending Fine Count : LKR "+Tax_Operations.total_count()+".00");

    }
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
