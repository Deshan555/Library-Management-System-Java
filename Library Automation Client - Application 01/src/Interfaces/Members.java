/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Background.Bugs;
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
public class Members extends javax.swing.JInternalFrame {

    /**
     * Creates new form open_screen
     */
    public Members() {
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
        
        box_2.setVisible(false);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        box = new javax.swing.JComboBox<>();
        box_2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        rclass = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        index = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1280, 668));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 30)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/21-avatar-outline.gif"))); // NOI18N
        jLabel3.setText("LIBRARY MEMBERS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 50));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setOpaque(false);

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

    getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 630, 490));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("FIND BY : ");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 118, 40));

    input.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    input.setBorder(null);
    input.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            inputKeyReleased(evt);
        }
    });
    jPanel1.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 240, 40));

    box.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Find By Name", "Find By School", "Find By ID", "Find By Index", "Find By Class" }));
    box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
    box.setFocusable(false);
    box.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            boxActionPerformed(evt);
        }
    });
    jPanel1.add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 212, 30));

    box_2.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    box_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Engineering", "School of Technology", "School of Business", "School of Computing & IT", "School of Music" }));
    box_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
    box_2.setFocusable(false);
    box_2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            box_2ActionPerformed(evt);
        }
    });
    jPanel1.add(box_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 226, 30));

    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Panal_5.png"))); // NOI18N
    jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 530, 60));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 980, 70));

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
    jLabel4.setText("Member ID : ");
    jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 146, 46));

    jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
    jLabel5.setText("Member Name  : ");
    jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 146, 46));

    jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
    jLabel6.setText("Related Class : ");
    jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 147, 146, 46));

    jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
    jLabel7.setText("E mail Address : ");
    jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 214, 146, 46));

    jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
    jLabel8.setText("SLTC Index :");
    jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 281, 146, 46));

    jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
    jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 59, 332, -1));

    jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
    jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 127, 332, -1));

    jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
    jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 194, 332, -1));

    jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
    jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 261, 332, -1));

    jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
    jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 328, 332, -1));

    jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(51, 51, 51));
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit_30px.png"))); // NOI18N
    jLabel2.setText("Update Current User");
    jLabel2.setToolTipText("Update User");
    jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel2MouseClicked(evt);
        }
    });
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 256, 50));

    id.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 11, 332, 46));

    name.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 87, 332, 38));

    rclass.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    jPanel2.add(rclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 155, 332, 38));

    mail.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    jPanel2.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 222, 332, 38));

    index.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    jPanel2.add(index, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 289, 332, 38));

    jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Panal_2.png"))); // NOI18N
    jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 640, 470));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        int row = table.getSelectedRow();
        
        String ID = table.getValueAt(row,0).toString();
        
        member_data(ID);
    }//GEN-LAST:event_tableMouseClicked

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
       
        if(box.getSelectedItem().equals("Find By School"))
        {
             box_2.setVisible(true);
        }
        else
        {
              box_2.setVisible(false);
        }
        
       
    }//GEN-LAST:event_boxActionPerformed

    private void inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputKeyReleased
                
        String SQL = null;
        
        if(box.getSelectedItem().equals("Find By Name"))
        {
            SQL = "SELECT USER_ID,USER_NAME,SLTC_INDEX,NIC FROM LIBRARY_USER WHERE USER_NAME LIKE '"+input.getText()+"%'";
            
            data_load(SQL);
        }
        else if(box.getSelectedItem().equals("Find By School"))
        {
            SQL = "SELECT USER_ID,USER_NAME,SLTC_INDEX,NIC FROM LIBRARY_USER WHERE USER_NAME LIKE '"+input.getText()+"%' AND SCHOOL =  '"+box_2.getSelectedItem()+"'";
            
            data_load(SQL);
        }
        else if(box.getSelectedItem().equals("Find By ID"))
        {
            SQL = "SELECT USER_ID,USER_NAME,SLTC_INDEX,NIC FROM LIBRARY_USER WHERE USER_ID = "+Integer.valueOf(input.getText())+"";
            
            data_load(SQL);
        }
        else if(box.getSelectedItem().equals("Find By Index"))
        {
            SQL = "SELECT USER_ID,USER_NAME,SLTC_INDEX,NIC FROM LIBRARY_USER WHERE SLTC_INDEX LIKE '"+input.getText()+"%'";
            
            data_load(SQL);
        }
        else if(box.getSelectedItem().equals("Find By Class"))
        {
            SQL = "SELECT USER_ID,USER_NAME,SLTC_INDEX,NIC  FROM LIBRARY_USER WHERE BATCH_NUMBER LIKE '"+input.getText()+"%'";
            
            data_load(SQL);
        }
    }//GEN-LAST:event_inputKeyReleased

    //Query Extractor method
    
    public void data_load(String SQL)
    {
        Connection connection = Connector.connection();
        
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
    
    private void box_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        if(id.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Select Item Before Edit It");
        }
        else
        {
             new Update_Users(id.getText()).setVisible(true);
        }
       
    }//GEN-LAST:event_jLabel2MouseClicked


    // User defined Codes
    
    public static void table_load()
    {
        Connection connection = Connector.connection();
        
        String SQL = "SELECT USER_ID,USER_NAME,SLTC_INDEX,NIC FROM LIBRARY_USER";
        
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
    
    
    // Member data Load
    
    public void member_data(String ID)
    {
        Connection connection =  Connector.connection();
        
        Integer book_id = Integer.valueOf(ID);
        
        String SQL= "SELECT * FROM LIBRARY_USER WHERE USER_ID = '"+book_id+"';";     
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                id.setText(rs.getString("USER_ID"));
                
                name.setText(rs.getString("USER_NAME"));
                
                index.setText(rs.getString("SLTC_INDEX"));
                
                mail.setText(rs.getString("EMAIL_ADDRESS"));
                
                rclass.setText(rs.getString("SCHOOL")+" BATCH : "+rs.getString("BATCH_NUMBER"));
            }
        }
        catch(SQLException ERROR)
        {
             Bugs.exceptions(String.valueOf(ERROR));
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box;
    private javax.swing.JComboBox<String> box_2;
    private javax.swing.JLabel id;
    private javax.swing.JLabel index;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel name;
    private javax.swing.JLabel rclass;
    private static javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
