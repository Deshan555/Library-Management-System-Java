/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Work_Space;

import Background.Bugs;
import Background.Cache_Writer;
import Interfaces.Notification_Windows.Not_Found;
import static Interfaces.Work_Space.Compact_Design.payment_button;
import static Interfaces.Work_Space.Compact_Design.rbook_button;
import static Interfaces.home.pane;
import My_SQL.Card_Validation;
import My_SQL.Connector;
import My_SQL.Tax_Operations;
import java.awt.Color;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jayashanka Deshan
 */
public class Verify_User extends javax.swing.JInternalFrame {

    /**
     * Creates new form Verify_User
     */
    public Verify_User()
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        disable();
        
        all_disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        get_id = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        lable = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        index = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        slot_1 = new javax.swing.JLabel();
        slot_2 = new javax.swing.JLabel();
        utax = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1290, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/verified_account_35px.png"))); // NOI18N
        jLabel1.setText("VERIFY USER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 259, -1));

        get_id.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        get_id.setBorder(null);
        get_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                get_idActionPerformed(evt);
            }
        });
        get_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                get_idKeyReleased(evt);
            }
        });
        getContentPane().add(get_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 351, 39));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 102, -1, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel10.setText("LENDING HISTORY");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

        display.setEditable(false);
        display.setColumns(20);
        display.setRows(5);
        jScrollPane2.setViewportView(display);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 102, -1, 460));

        lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/333-loader-4.gif"))); // NOI18N
        getContentPane().add(lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, 39));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 350, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("School and Class :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 275, 212, 46));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Card Holder Name : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 212, 46));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("SLTC Index : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 212, 46));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Card Status :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 212, 46));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel9.setText("E - Mail Address :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 212, 46));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Fines Under Your Account : ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 338, 240, 46));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 62, 318, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 127, 318, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 192, 318, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 257, 318, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 322, 318, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 385, 318, 10));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked_30px.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 341, -1, 39));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked_30px.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 28, -1, 39));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked_30px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 148, -1, 39));

        user.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 15, 318, 46));

        index.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel1.add(index, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 78, 318, 48));

        status.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 148, 317, 43));

        slot_1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel1.add(slot_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 210, 318, 46));

        slot_2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel1.add(slot_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 275, 318, 46));

        utax.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel1.add(utax, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 338, 317, 46));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Panal_2.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 630, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void get_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_get_idKeyReleased

        if(get_id.getText().trim().isEmpty())
        {
            lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/333-loader-4.gif")));
        }
        else
        {
            lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/35-edit-outline.gif")));
        }

        data_load(Integer.valueOf(get_id.getText()));

        int length = get_id.getText().length();

        System.out.println(length);

        if(length == 10)
        {
            get_id.setEditable(false);
            
            get_id.setBackground(Color.WHITE);
            
            lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear_symbol_35px.png")));
            
            int validation = Card_Validation.validation_card(Integer.valueOf(get_id.getText()));
            
            if(validation == 0)
            {
                new Not_Found().setVisible(true);
                
                pane.removeAll();
      
                Compact_Design design = new Compact_Design();
      
                pane.add(design).setVisible(true);
            }
            else
            {
                try
                {
                    Cache_Writer.add_data(get_id.getText(),"temp_user.dat");
                }
                catch(IOException ERROR)
                {
                    Bugs.exceptions(String.valueOf(ERROR));
                }
            }

        }
        
        int condition = Tax_Operations.validation_tax(Integer.valueOf(get_id.getText()));
        
        if(condition == 1)
        {
            jLabel13.setVisible(true);

            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked_30px.png")));
            
            utax.setText("You Are Clear");
  
        }
        else
        {
            jLabel13.setVisible(true);

            utax.setText(Tax_Operations.tax_count(Integer.valueOf(get_id.getText())));
            
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel_30px.png")));
        }
    }//GEN-LAST:event_get_idKeyReleased

    private void get_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_get_idActionPerformed
 
    }//GEN-LAST:event_get_idActionPerformed

    
    public void data_load(int ID)
    {
        int count = 0;
        
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LIBRARY_USER WHERE USER_ID = '"+ID+"'";
 
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                user.setText(rs.getString("USER_NAME"));
                
                index.setText(rs.getString("SLTC_INDEX"));
                
                slot_1.setText(rs.getString("EMAIL_ADDRESS"));
                
                slot_2.setText(rs.getString("SCHOOL"));
                
             //   load_lending_table(Integer.valueOf(get_id.getText()));
                
             //   MAIL = rs.getString("EMAIL_ADDRESS");
                
                count = count + 1;
            }
        }
        catch(Exception ERROR)
        {
             System.out.println("ERROR MESSAGE : "+ERROR);
        }
        
        status();

        history();        
    }
 

    // That Code help To Display Ledned Items Before
    
    public void history()
    {
        Connection connection = Connector.connection();
        
         Integer ID = Integer.valueOf(get_id.getText());
        
        String SQL = "SELECT * FROM RETURN_TABLE WHERE USER_ID = '"+ID+"'";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
               String books =  rs.getString("BOOK_ID");
               
               Integer book_id = Integer.valueOf(books);
               
               book_data_load(book_id);
               
            }
        }
        catch(NumberFormatException | SQLException ERROR)
        {
            System.out.println(ERROR);
        }
    }
    
    public void book_data_load(int ID)
    {
      
        Connection connection = Connector.connection();
        
        String SQL = "SELECT * FROM BOOKS WHERE BOOK_ID = '"+ID+"'";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                display.append("BOOK NAME : "+rs.getString("TITLE_OF_BOOK")+"\n");
                
                display.append("AUTHOR NAME : "+rs.getString("AUTHOR_NAME")+"\n");
                
                display.append("\n\n");
            }
        }
        catch(SQLException ERROR)
        {
            System.out.println("ERROR : "+ERROR);
        }
    }
    
    
    public void status()
    {
        Integer ID = Integer.valueOf(get_id.getText());
        
        int value = Tax_Operations.validation_tax(ID);
        
        String count = take_count.get_RowCount(ID);
        
        Integer counts = Integer.valueOf(count);
        
        String fund = Tax_Operations.tax_count(ID);
        
        if(counts == 3)
        {
            status.setText("Card Temporary Unavailable");
            
            limited_functions_02();
            
        }
        else if((counts < 3) && (value == 1))
        {
            status.setText("Card Available");
            
            basic_functions();
        }
        else if(value == 0)
        {
            status.setText("You Have To Do Payment");
            
            utax.setText(fund);
            
            limited_functions_01();
        }
    }
    
    public void disable()
    {
        jLabel7.setVisible(false);
        
        jLabel2.setVisible(false);
        
        jLabel13.setVisible(false);
    }
    
    
    public void all_disable()
    {
        Compact_Design.rbook_button.setVisible(false);
        
        Compact_Design.payment_button.setVisible(false);
        
        Compact_Design.jLabel2.setVisible(false);
        
        Compact_Design.jSeparator2.setVisible(false);
        
        Compact_Design.jSeparator3.setVisible(false);
        
        Compact_Design.jSeparator4.setVisible(false);
    }
    
    
    public void basic_functions()
    {
        Compact_Design.rbook_button.setVisible(true);
         
        Compact_Design.jLabel2.setVisible(true);
         
        Compact_Design.jSeparator2.setVisible(true);
        
        Compact_Design.jSeparator3.setVisible(true);
    }
    
    
    public void limited_functions_01() // For payments
    {
         Compact_Design.payment_button.setVisible(true);
         
         Compact_Design.jSeparator4.setVisible(true);
         
         Compact_Design.rbook_button.setVisible(true);
         
         Compact_Design.jSeparator4.setVisible(true);
         
         Compact_Design.jLabel2.setVisible(false);
         
         Compact_Design.jSeparator2.setVisible(false);
    }
    
     public void limited_functions_02() // For limited books reached
    {
         Compact_Design.payment_button.setVisible(false);
         
         Compact_Design.jSeparator4.setVisible(false);
         
         Compact_Design.rbook_button.setVisible(true);
         
         Compact_Design.jSeparator4.setVisible(true);
         
         Compact_Design.jLabel2.setVisible(false);
         
         Compact_Design.jSeparator2.setVisible(false);
    }
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea display;
    private javax.swing.JTextField get_id;
    private javax.swing.JLabel index;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lable;
    private javax.swing.JLabel slot_1;
    private javax.swing.JLabel slot_2;
    private javax.swing.JLabel status;
    private javax.swing.JLabel user;
    private javax.swing.JLabel utax;
    // End of variables declaration//GEN-END:variables
}
