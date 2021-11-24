/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Background.Bugs;
import Interfaces.Scrool_Bar.ScrollBarCustom;
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
public class Search_Books extends javax.swing.JInternalFrame {

    /**
     * Creates new form open_screen
     */
    public Search_Books() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        //table.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        
       // table.setBackground(new Color(255,255,255));
        
       // table.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        
       // table.getTableHeader().setOpaque(false);
        
       // table.getTableHeader().setBackground(Color.white);
        
        //jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
        
        table_load();
    }
    
    public void table_load()
    {
        Connection connection = Connector.connection();
        
        String SQL = "SELECT BOOK_ID,TITLE_OF_BOOK,AUTHOR_NAME FROM BOOKS";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
           
        }
        catch(SQLException ERROR)
        {
           Bugs.exceptions(String.valueOf(ERROR));
           
           JOptionPane.showMessageDialog(null,"System Error : SQL Server Offline or System Error\n\nError Info : "+ERROR);
        }
    }
    
    public void table_find()
    {
        Connection connection = Connector.connection();
        
        String SQL = "SELECT TITLE_OF_BOOK FROM BOOKS";
        
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

        jPanel1 = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        box = new javax.swing.JTextField();
        choose = new javax.swing.JComboBox<>();
        lable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new Interfaces.Table_Modify.Table();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        author = new javax.swing.JTextField();
        bid = new javax.swing.JTextField();
        owner = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        rdate = new javax.swing.JTextField();
        cat = new javax.swing.JTextField();
        url = new javax.swing.JTextField();
        section = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1280, 668));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 30)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/zoom.gif"))); // NOI18N
        jLabel4.setText("FIND BOOKS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 261, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 410, 10));

        box.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        box.setBorder(null);
        box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                boxKeyReleased(evt);
            }
        });
        jPanel1.add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 64, 400, 40));

        choose.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        choose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Find By Name", "Find By Author", "Find By ID", "Find By Session" }));
        choose.setBorder(null);
        choose.setFocusable(false);
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });
        jPanel1.add(choose, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 83, 180, 30));

        lable.setBackground(new java.awt.Color(255, 255, 255));
        lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/333-loader-4.gif"))); // NOI18N
        lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lableMouseClicked(evt);
            }
        });
        jPanel1.add(lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 73, -1, 40));

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

    jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 660, 500));

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
    jLabel2.setText("Author : ");

    jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
    jLabel3.setText("Book ID :");

    jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
    jLabel5.setText("Related Section :");

    jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
    jLabel6.setText("Current Owner : ");

    jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
    jLabel7.setText("Book Name :");

    jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
    jLabel8.setText("Book Catogary  :");

    jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
    jLabel9.setText("Return Date :");

    jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
    jLabel10.setText("Book Link : ");

    author.setEditable(false);
    author.setBackground(new java.awt.Color(255, 255, 255));
    author.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
    author.setBorder(null);

    bid.setEditable(false);
    bid.setBackground(new java.awt.Color(255, 255, 255));
    bid.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
    bid.setBorder(null);

    owner.setEditable(false);
    owner.setBackground(new java.awt.Color(255, 255, 255));
    owner.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
    owner.setBorder(null);

    name.setEditable(false);
    name.setBackground(new java.awt.Color(255, 255, 255));
    name.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
    name.setBorder(null);

    rdate.setEditable(false);
    rdate.setBackground(new java.awt.Color(255, 255, 255));
    rdate.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
    rdate.setBorder(null);

    cat.setEditable(false);
    cat.setBackground(new java.awt.Color(255, 255, 255));
    cat.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
    cat.setBorder(null);
    cat.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            catActionPerformed(evt);
        }
    });

    url.setEditable(false);
    url.setBackground(new java.awt.Color(255, 255, 255));
    url.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
    url.setBorder(null);
    url.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            urlActionPerformed(evt);
        }
    });

    section.setEditable(false);
    section.setBackground(new java.awt.Color(255, 255, 255));
    section.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
    section.setBorder(null);
    section.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            sectionActionPerformed(evt);
        }
    });

    jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

    jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

    jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

    jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

    jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

    jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

    jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

    jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(10, 10, 10)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addComponent(jSeparator7)
                .addComponent(jSeparator5)
                .addComponent(jSeparator4)
                .addComponent(jSeparator3)
                .addComponent(jSeparator2)
                .addComponent(jSeparator1)
                .addComponent(bid, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addComponent(author)
                .addComponent(section, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addComponent(cat, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addComponent(url, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addComponent(owner, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addComponent(rdate, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addComponent(jSeparator6))
            .addGap(160, 160, 160))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(1, 1, 1)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(1, 1, 1)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addComponent(name))
            .addGap(2, 2, 2)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(author))
            .addGap(2, 2, 2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(section))
            .addGap(1, 1, 1)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addComponent(cat))
            .addGap(1, 1, 1)
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(1, 1, 1)
            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(owner, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(1, 1, 1)
            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(2, 2, 2)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rdate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(1, 1, 1)
            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 590, 500));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit_property_30px.png"))); // NOI18N
    jLabel1.setToolTipText("Edit Selected Book");
    jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel1MouseClicked(evt);
        }
    });
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 50, 50));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 660));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseActionPerformed

    private void boxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxKeyReleased

        if(box.getText().trim().isEmpty())
        {
            table_load();
            
            lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/333-loader-4.gif")));
        }

        row_empty();
        
        if(choose.getSelectedItem().equals("Find By Author"))
        {
           String SQL= "SELECT BOOK_ID,TITLE_OF_BOOK,AUTHOR_NAME,ISBN FROM BOOKS WHERE AUTHOR_NAME LIKE '"+box.getText()+"%';";
            
            data_load(SQL);
        }
        else if(choose.getSelectedItem().equals("Find By ID"))
        {
            String SQL= "SELECT BOOK_ID,TITLE_OF_BOOK,AUTHOR_NAME,ISBN FROM BOOKS WHERE BOOK_ID = '"+box.getText()+"';";
            
            data_load(SQL);
        }
        else if(choose.getSelectedItem().equals("Find By Name"))
        {
            String SQL= "SELECT BOOK_ID,TITLE_OF_BOOK,AUTHOR_NAME,ISBN FROM BOOKS WHERE TITLE_OF_BOOK LIKE '"+box.getText()+"%';";
            
            data_load(SQL);
        }
        else if(choose.getSelectedItem().equals("Find By Session"))
        {
            String SQL= "SELECT BOOK_ID,TITLE_OF_BOOK,AUTHOR_NAME,ISBN FROM BOOKS WHERE SECTION = '"+box.getText()+"';";
            
            data_load(SQL);
        }
    }//GEN-LAST:event_boxKeyReleased

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
    private void sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionActionPerformed

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catActionPerformed

    private void urlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
        row_empty();
        
        int row = table.getSelectedRow();
        
        String ID = table.getValueAt(row,0).toString();
        
        System.out.println(ID);
        
        bid.setText(ID);
        
        book_data_load(ID);
    }//GEN-LAST:event_tableMouseClicked

    private void lableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableMouseClicked
        
        table_load();
    }//GEN-LAST:event_lableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        int status = 0;
        
        if(owner.getText().trim().isEmpty())
        {
            status = 1;
        }
        else
        {
            status = 0;
        }
        if(bid.getText().trim().isEmpty())
        {
             JOptionPane.showMessageDialog(null,"Please Select A Book Before Edit It");
        }
        else
        {
            Edit_Books edit = new Edit_Books(bid.getText(),status);
        
            //edit.install_id(bid.getText());
        
            edit.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    public void book_data_load(String ID)
    {
        Connection connection =  Connector.connection();
        
        Integer book_id = Integer.valueOf(ID);
        
        String SQL= "SELECT * FROM BOOKS WHERE BOOK_ID = '"+book_id+"';";     
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                name.setText(rs.getString("TITLE_OF_BOOK"));
                                
                author.setText(rs.getString("AUTHOR_NAME"));
                                
                cat.setText(rs.getString("CATEGORY"));
                
                section.setText(rs.getString("SECTION"));
                                
                url.setText(rs.getString("BOOK_LINK"));
                
                String Book_id = rs.getString("BOOK_ID");
                
                lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/approve.gif")));
                
                load_lendData(Book_id);
            }
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
    public void load_lendData(String book_id)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LEND_TABLE WHERE BOOK_ID = '"+book_id+"';";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            Integer ID = 0;
            
            while(rs.next())
            {

               ID = Integer.valueOf(rs.getString("USER_ID"));
                    
               rdate.setText(rs.getString("DUE_DATE"));

               load_userData(ID);
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
                        
            rdate.setText("");
        }
    }
    
    public void load_userData(int id)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LIBRARY_USER WHERE USER_ID = "+id+";";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            Integer ID = 0;
            
            while(rs.next())
            {                
                owner.setText(rs.getString("USER_NAME"));
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
           
            rdate.setText("");
        }
    }
    
    public void row_empty()
    {
        name.setText("");
                                
        author.setText("");
                                
        cat.setText("");
                
        section.setText("");
                                
        url.setText("");
        
        owner.setText("");
        
        rdate.setText("");
        
        bid.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField box;
    private javax.swing.JTextField cat;
    private javax.swing.JComboBox<String> choose;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lable;
    private javax.swing.JTextField name;
    private javax.swing.JTextField owner;
    private javax.swing.JTextField rdate;
    private javax.swing.JTextField section;
    private javax.swing.JTable table;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
