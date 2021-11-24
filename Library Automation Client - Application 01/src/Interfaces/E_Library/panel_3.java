package Interfaces.E_Library;

import Background.Bugs;
import My_SQL.Connector;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author whatd
 */
public class panel_3 extends javax.swing.JInternalFrame {

    int value = 0;
    
    String key_word = null;
    
    
    public panel_3()
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
    }
    
    public static void table_load()
    {
        Connection connection = Connector.connection();
        
        String SQL = "SELECT * from pdf_books";
        
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

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new Interfaces.Table_Modify.Table();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        setMinimumSize(new java.awt.Dimension(1174, 430));
        setPreferredSize(new java.awt.Dimension(1205, 498));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

    getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1180, 420));

    jTextField1.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
    jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    jTextField1.setBorder(null);
    jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField1KeyReleased(evt);
        }
    });
    getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 470, 30));

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_35px.png"))); // NOI18N
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, 30));

    jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
    getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 470, 10));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        int row = table.getSelectedRow();
        
        String ID = table.getValueAt(row,0).toString();
        
        new panel_2_1(ID).setVisible(true);
    }//GEN-LAST:event_tableMouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       
        key_word =  jTextField1.getText();
        
        if( jTextField1.getText().trim().isEmpty())
        {
            table_load();
        }
        else
        {
            search_data(key_word);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    public void search_data(String key)
    {
        Connection connection = Connector.connection();
        
        String SQL = "SELECT * from pdf_books WHERE title LIKE '%"+key+"%' OR author LIKE '%"+key+"%' OR generes LIKE '%"+key+"%'";
        
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
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private static javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
