
package Interfaces;

import Background.Bugs;
import Interfaces.Notification_Windows.Field;
import Interfaces.Notification_Windows.Book_add;
import Background.Cache_Reader;
import Background.Open_Url;
import static Interfaces.home.pane;
import My_SQL.Book_Validation;
import My_SQL.Connector;
import Online_Services.Push_Data;
import javax.swing.ButtonGroup;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import SQLite_03.Save_Category;
import com.sbix.jnotify.NPosition;
import com.sbix.jnotify.NoticeType;
import com.sbix.jnotify.NoticeWindow;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class add_books extends javax.swing.JInternalFrame {

    int value = 0;
     
    public add_books() throws FileNotFoundException 
    {
        
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        ButtonGroup group = new ButtonGroup();
      
        group.add(box_1);
      
        group.add(box_2);
        
        Cache_Reader obj = new Cache_Reader();
        
        String admin_name = obj.reader("Current_admin.dat");
        
        by.setText(admin_name);
        
        load_category();
                       
    }
    
    public void load_category()
    {
        ArrayList<String> data = new ArrayList<String>();
        
        data.clear();
        
        data = Save_Category .load_data();
        
        int size = data.size();
        
        categories.removeAllItems();
        
        for(int i = 0;i < size;i++)
        {
            categories.addItem(data.get(i));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        web = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        book_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        author_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        by = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        categories = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        box_2 = new javax.swing.JRadioButton();
        box_1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1280, 668));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 0, 30)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/49-plus-circle-outline (1).gif"))); // NOI18N
        jLabel16.setText("ADD BOOKS");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 250, -1));

        jTextField1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 69, 350, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Book Price :");

        web.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        web.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Book Name :");

        book_name.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        book_name.setBorder(null);
        book_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                book_nameKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Author Name  :");

        author_name.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        author_name.setBorder(null);
        author_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author_nameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setText("ISBN Number :");

        isbn.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        isbn.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Book Link :");

        by.setEditable(false);
        by.setBackground(new java.awt.Color(255, 255, 255));
        by.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        by.setBorder(null);
        by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Issue By :");

        price.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        price.setBorder(null);
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Related Section :");

        jTextField9.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField9.setBorder(null);

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(book_name, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(author_name, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator3)
                            .addComponent(web, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5)
                            .addComponent(by, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(jSeparator6)
                            .addComponent(jSeparator7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8)
                            .addComponent(jTextField9))))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(author_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(web, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 128, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Category :");

        categories.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        categories.setBorder(null);
        categories.setFocusable(false);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_35px.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel13.setText("Permissions :");

        box_2.setBackground(new java.awt.Color(255, 255, 255));
        box_2.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        box_2.setText("Can't Be Lend");
        box_2.setFocusable(false);
        box_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_2ActionPerformed(evt);
            }
        });

        box_1.setBackground(new java.awt.Color(255, 255, 255));
        box_1.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        box_1.setText("Can Be Lend");
        box_1.setFocusable(false);
        box_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_35px.png"))); // NOI18N
        jLabel9.setText("VIEW MORE");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_35px.png"))); // NOI18N
        jLabel14.setText("ADD TO LIBRARY");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(categories, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(box_1)
                        .addGap(53, 53, 53)
                        .addComponent(box_2)
                        .addContainerGap(175, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(categories, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(290, 290, 290))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, 500));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/333-loader-4.gif"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 73, 68, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 112, 360, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_byActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        
        new add_cat().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void box_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_2ActionPerformed

    private void box_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
        Integer book_id = Integer.valueOf(jTextField1.getText());
        
        int value = Book_Validation.validation_card(book_id);
        
        if(value == 1)
        {
            jTextField1.setText("");
            
            new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"That Book Id Alrady Used By Another Book In Library!!",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
           
        }
        
        
        // Another action
        
        if(jTextField1.getText().length() == 10)
        {
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear_symbol_35px.png")));
            
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void author_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_author_nameActionPerformed
        
        
    }//GEN-LAST:event_author_nameActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
       
        
    }//GEN-LAST:event_priceActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       
       String search = book_name.getText();
       
       search = search.replaceAll("\\s","");
       
        try 
        {
            Open_Url.visit("https://www.google.com/search?q="+search);
        } 
        catch (IOException ex)
        {
            Logger.getLogger(add_books.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    
    public void all_clear() throws FileNotFoundException
    {
        pane.removeAll();
        
        add_books screen_02 = null;
        try 
        {
            screen_02 = new add_books();
        }
        catch (FileNotFoundException ex)
        {
            Bugs.exceptions(String.valueOf(ex));
        }
        
        pane.add(screen_02).setVisible(true);
    }
    
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        
        int choice = JOptionPane.showConfirmDialog(null,"Do You Want To Add This Book ");
        
        if(choice == 0)
        {
             Cloud_Sync sync = new Cloud_Sync();
             
             sync.start();
        }
       
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        if(jTextField1.getText().length() == 10)
        {
            try 
            {
                all_clear();
            } 
            catch(FileNotFoundException ex)
            {
                Logger.getLogger(add_books.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void book_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_book_nameKeyReleased
        
    }//GEN-LAST:event_book_nameKeyReleased
    
    public void data_validation()
    {
        int book_id = 0;
        
        int author = 0;
        
        int web_ = 0;
        
        int isbn_ = 0;
        
        int price_ = 0;
        
        int box_ = 0;
        
        int section = 0;
        
        
        if(book_name.getText().trim().isEmpty())
        {
            book_id = 0;
        }
        else
        {
            book_id = 1;
        }
        
        
        if(author_name.getText().trim().isEmpty())
        {
            author = 0;
        }
        else
        {
            author = 1;
        }
        
        
        if(web.getText().trim().isEmpty())
        {
            web_ = 0;
        }
        else
        {
            web_ = 1;
        }
        
        if(isbn.getText().trim().isEmpty())
        {
            isbn_ = 0;
        }
        else
        {
            isbn_ = 1;
        }
        
        if(price.getText().trim().isEmpty())
        {
            price_ = 0;
        }
        else
        {
            price_ = 1;
        }
        
        if(jTextField9.getText().isEmpty())
        {
            section = 0;
        }
        else
        {
            section = 1;
        }

        if(box_1.isSelected() || box_2.isSelected())
        {
            box_ = 1;
        }
        else
        {
            box_ = 0;
        }
        
        if(box_ == 1 && section == 1 && price_ == 1 && isbn_ == 1 && web_ == 1 && author == 1 && book_id == 1)
        {
            value = 1;
        }
        else
        {
            value = 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author_name;
    private javax.swing.JTextField book_name;
    private javax.swing.JRadioButton box_1;
    private javax.swing.JRadioButton box_2;
    private javax.swing.JTextField by;
    public static javax.swing.JComboBox<String> categories;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField price;
    private javax.swing.JTextField web;
    // End of variables declaration//GEN-END:variables



public class Cloud_Sync implements Runnable
{
    private final Thread thread;
    
    public Cloud_Sync()
    {
        thread = new Thread(this);
    }

        @Override
        public void run() 
        {
        Integer book_id = Integer.valueOf(jTextField1.getText());
        
        String bookn = book_name.getText();
        
        String author = author_name.getText();
        
        String link = web.getText();
        
        String ISBN = isbn.getText();
        
        String Price = price.getText();
                
        Integer issue_by = Integer.valueOf(by.getText());
        
        String section = jTextField9.getText();
                
        String cat = (String) categories.getSelectedItem();
        
        int permission = 0;
        
        if(box_1.isSelected())
        {
            permission = 1;
        }
        else
        {
            permission = 0;
        }
        
        data_validation();
        
        if(value == 1)
        {
            String SQL = "INSERT INTO BOOKS VALUES("+book_id+",'"+bookn+"','"+author+"','"+ISBN+"','"+link+"','"+cat+"',"+section+",'"+permission+"','"+Price+"',"+issue_by+");";
        
        Connection conn =  Connector.connection();
        
         try
            {
  
                Push_Data.Hard_Copies(book_id,book_name.getText(),author,ISBN, bookn, cat, section,permission, Price);
                
                PreparedStatement preparedStatement = conn.prepareStatement(SQL);

                preparedStatement.executeUpdate();
                
                new Book_add().setVisible(true);
                
            try 
            {
                all_clear();
            }
            catch (FileNotFoundException ex)
            {
                Bugs.exceptions(String.valueOf(ex));
            }
                
            }
         catch(SQLException ERROR)
         {
             new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"SQL ERROR : "+ERROR,NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
             
             Bugs.exceptions(String.valueOf(ERROR));
         }
        }
        else
        {
            new Field().setVisible(true);
        }

    }
    
    public void start()
    {
        thread.start();
    }
    
    
}














}
