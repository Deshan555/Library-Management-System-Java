/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Work_Space;

import Background.Admin_Logs;
import Background.Bugs;
import Background.Cache_Reader;
import E_Mail.email_thread;
import E_Mail.email_thread_common;
import Interfaces.Notification_Windows.Check_Box;
import Interfaces.Notification_Windows.Lending_Fail;
import Interfaces.Notification_Windows.done;
import My_SQL.Connector;
import com.sbix.jnotify.NPosition;
import com.sbix.jnotify.NoticeType;
import com.sbix.jnotify.NoticeWindow;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jayashanka Deshan
 */
public class Barrow_Books extends javax.swing.JInternalFrame {

    /**
     * Creates new form Verify_User
     */
    
    int Student_ID = 0;
    
    ArrayList<String> book_index = new ArrayList<String>();
     
    String mail_address = null;
    
    String user_name = null;
    
    String rules = "<h>\n" +
"    <p><pre>\n" +
"        \n" +
"        Book Care Rules:\n" +
"\n" +
"        1. Keep books clean; make sure hands are clean before touching.\n" +
"\n" +
"        2. Keep books in a safe place away from babies, pets, food, and liquids.\n" +
"\n" +
"        3. Turn pages carefully from the corner and use a bookmark to mark your place. Never write or draw in a\n" +
"        book or ear mark pages.\n" +
"\n" +
"        4. When you are not reading your library books, keep them in your backpack or in your Lecture Hall in Campus.\n" +
"    </pre></p>\n" +
"</h>";
    
    public Barrow_Books()
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        try
        {
            Student_ID = Integer.valueOf(Cache_Reader.reader("temp_user.dat"));
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
        
        data_load(Student_ID);
        
        field_clear();
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        index = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        slot_1 = new javax.swing.JLabel();
        slot_2 = new javax.swing.JLabel();
        slot_3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        lable_04 = new javax.swing.JLabel();
        b_name = new javax.swing.JLabel();
        today = new javax.swing.JLabel();
        r_date = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        llable = new javax.swing.JLabel();
        box_02 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        book_id = new javax.swing.JTextField();
        lable_2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1290, 600));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_and_pencil_35px.png"))); // NOI18N
        jLabel1.setText("LENDING BOOKS");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Lending Slot 02 :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 224, 212, 46));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("SLTC Index : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, 212, 46));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Card Status :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, 212, 46));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Lending Slot 01 :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 212, 46));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Lending Slot 03 :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 289, 212, 46));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 76, 318, 10));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 141, 318, 10));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 206, 318, 10));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 271, 318, 10));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 336, 318, 10));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked_30px.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 37, -1, 39));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked_30px.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 97, -1, 39));

        index.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel2.add(index, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 27, 318, 48));

        status.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 97, 317, 43));

        slot_1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel2.add(slot_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 159, 318, 46));

        slot_2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel2.add(slot_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 224, 318, 46));

        slot_3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel2.add(slot_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 289, 318, 46));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Panal_3.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel15.setText("Book Name : ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 26, 182, 44));

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel17.setText("Return Date : ");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 154, 182, 44));

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel19.setText("Leanding Date : ");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 88, 182, 44));

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 71, 318, 10));

        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 133, 318, 10));

        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 199, 318, 10));

        lable_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checked_30px.png"))); // NOI18N
        jPanel3.add(lable_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, 39));

        b_name.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel3.add(b_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 26, 318, 44));

        today.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel3.add(today, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 88, 318, 44));

        r_date.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jPanel3.add(r_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 159, 318, 39));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Panal_4.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 240));

        llable.setBackground(new java.awt.Color(255, 255, 255));
        llable.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        llable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_35px.png"))); // NOI18N
        llable.setText("Issue Book");
        llable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llableMouseClicked(evt);
            }
        });

        box_02.setBackground(new java.awt.Color(255, 255, 255));
        box_02.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        box_02.setText("Issue Book To User");
        box_02.setBorder(null);
        box_02.setFocusable(false);
        box_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_02ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        book_id.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        book_id.setForeground(new java.awt.Color(102, 102, 102));
        book_id.setText("Enter Book ID");
        book_id.setBorder(null);
        book_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                book_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                book_idFocusLost(evt);
            }
        });
        book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_idActionPerformed(evt);
            }
        });
        book_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                book_idKeyReleased(evt);
            }
        });
        jPanel1.add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 190, 50));

        lable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/333-loader-4.gif"))); // NOI18N
        lable_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lable_2MouseClicked(evt);
            }
        });
        jPanel1.add(lable_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 50, 50));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("BOOK ID :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Panal_5.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(box_02, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(llable, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(llable, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_02, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_02ActionPerformed

    private void llableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llableMouseClicked

        Connection connection = Connector.connection();

        Random rand = new Random();

        int random_id = rand.nextInt(99999);

        String ID = String.valueOf(random_id);

        String Lend_id = "BB-LEND-"+ID;

        String return_date = r_date.getText();

        String today_ = today.getText();

        Integer BID = Integer.valueOf(book_id.getText());

        String SQL = "INSERT INTO LEND_TABLE (LEND_ID,ISSUE_DATE,DUE_DATE,USER_ID,BOOK_ID) VALUES ('"+Lend_id+"','"+today_+"','"+return_date+"','"+Student_ID+"','"+BID+"')";

        if(box_02.isSelected())
        {
            try
            {
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);

                preparedStatement.executeUpdate();
                
                String template = "<body>\n" +
"    <p><pre>\n" +
"        <h4>You Just Barrow Fallowing Book.</h4><br>\n" +
"\n" +
"        <h4>BOOK NAME : "+b_name.getText()+"</h4><br>\n" +
"\n" +
"        <h4>LENDING DATE : "+today.getText()+" </h4><br>\n" +
"\n" +
"        <h4>DUE DATE : "+r_date.getText()+"</h4><br>\n" +
"\n" +
"        <h4>BOOK ID : "+book_id.getText()+"</h4><br>\n" +
"\n" +
"        <h5>\n" +
"            \n"+
"        </h5>\n" +
"   </pre></p>\n" +
"</body>"+rules;
                
                 email_thread_common thread = new  email_thread_common(mail_address,user_name,"Book Lending Notification",template,Student_ID);
                
                thread.start();

                done Done = new done();
                
                Admin_Logs.write("ISSUE Book["+book_id.getText()+"] To User");

                Done.setVisible(true);

                field_clear();

                data_load(Student_ID);

            }
            catch(SQLException ERROR)
            {
                Bugs.exceptions(String.valueOf(ERROR));

                Lending_Fail fail = new Lending_Fail();

                fail.setVisible(true);
            }
        }
        else
        {
            Check_Box box = new Check_Box();

            box.setVisible(true);
        }
    }//GEN-LAST:event_llableMouseClicked

    
   // Data Load Method
    
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
                user_name = rs.getString("USER_NAME");
                
                index.setText(rs.getString("SLTC_INDEX"));
                
                load_lending_table(Student_ID);
                
                mail_address = rs.getString("EMAIL_ADDRESS");
                
                count = count + 1;
   
            }
        }
        catch(SQLException ERROR)
        {
             Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
    public void load_lending_table(int ID)
    {
        book_index.clear();
        
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LEND_TABLE WHERE USER_ID = '"+ID+"'";
        
        int count = 0;
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                rs.getString("BOOK_ID");
                
                book_index.add(rs.getString("BOOK_ID")); 
                                
                count = count + 1;
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
        
        if(count < 3)
        {            
            status.setText("Card Available");
            
            function_disable.basic_functions();
        }
        else
        {           
            status.setText("Card Temporary Unvailable");
            
            today.setText("Card Temporary Unvailable");
            
            book_id.setEditable(false);
            
            book_id.setText("Card Unvailable");
            
            b_name.setText("Card Temporary Unvailable");
            
            r_date.setText("Card Temporary Unvailable");
            
            lable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel_30px.png")));
            
            jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel_30px.png")));
                        
            box_02.setVisible(false);
                        
            llable.setVisible(false);
            
            function_disable.limited_functions_02(); 
            
           // jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel_30px.png")));
        }
                    
            book_nameLoad();      
    }
    
    
    // Book Name Load : That function load book names in your account
    
    
    public void book_nameLoad()
    {
        Connection connection =  Connector.connection();
        
        int array_size = book_index.size();
        
        if(array_size == 1)
        {
            String SQL = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book_index.get(0)+"'; ";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                slot_1.setText(rs.getString("TITLE_OF_BOOK"));
                
                System.out.println(rs.getString("TITLE_OF_BOOK"));
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
            
            
        }
        if(array_size == 2)
        {
        String SQL = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book_index.get(0)+"'; ";
        
        String SQL_02 = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book_index.get(1)+"'; ";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                slot_1.setText(rs.getString("TITLE_OF_BOOK"));
                
                System.out.println(rs.getString("TITLE_OF_BOOK"));
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL_02);
            
            while(rs.next())
            {

                slot_2.setText(rs.getString("TITLE_OF_BOOK"));
                
                System.out.println(rs.getString("TITLE_OF_BOOK"));
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }        
                
        }
        
        if(array_size == 3)
        {
        String SQL = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book_index.get(0)+"'; ";
        
        String SQL_02 = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book_index.get(1)+"'; ";
         
        String SQL_03 = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book_index.get(2)+"'; ";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                slot_1.setText(rs.getString("TITLE_OF_BOOK"));
                
                System.out.println(rs.getString("TITLE_OF_BOOK"));
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL_02);
            
            while(rs.next())
            {

                slot_2.setText(rs.getString("TITLE_OF_BOOK"));
                
                System.out.println(rs.getString("TITLE_OF_BOOK"));
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }        
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL_03);
            
            while(rs.next())
            {
                slot_3.setText(rs.getString("TITLE_OF_BOOK"));
                                
                System.out.println(rs.getString("TITLE_OF_BOOK"));
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
        
        }    
    }
    
    

    private void book_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_book_idFocusGained

        if(book_id.getText().equals("Enter Book ID"))
        {
            book_id.setText("");

            book_id.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_book_idFocusGained

    private void book_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_book_idFocusLost

        if(book_id.getText().equals(""))
        {
            book_id.setText("Enter Book ID");

            book_id.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_book_idFocusLost

    private void book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_idActionPerformed

    
    
    
    
    // Key Relesed Event For Book ID holder
    
    private void book_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_book_idKeyReleased

        if(book_id.getText().trim().isEmpty())
        {
            lable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/333-loader-4.gif")));
        }
        else if(book_id.getText().length() < 10)
        {
            lable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/zoom.gif")));
        }
        else
        {
            lable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear_symbol_35px.png")));
            
            book_id.setEditable(false);
            
            book_id.setBackground(Color.WHITE);
            
            book_data_load(Integer.valueOf(book_id.getText()));
        }
    }//GEN-LAST:event_book_idKeyReleased

    
    
    // That function can recognize is book available and that book name
    
    public void book_data_load(int ID)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM BOOKS WHERE BOOK_ID = '"+ID+"'";
        
        int count = 0;
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                b_name.setText(rs.getString("TITLE_OF_BOOK"));
                
                count = count + 1;
            }
        }
        catch(SQLException ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
            
             new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"ERROR : \n"+ERROR,NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
        }
            if(count == 1)
            {
                lable_04.setVisible(true);
                
                System.out.println("Count " + count);
                
                date_management(14); // 14 DAYS Available for reading
            }
            else
            {
                b_name.setText("Book Not Found");
                
                lable_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel_30px.png")));
            }
    }
    
    
    
    
    // That function handle dates 
    
     public void date_management(int days)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        
        today.setText(String.valueOf(localDate));

        localDate = LocalDate.now().plusDays(days);

        System.out.println(localDate);
        
        r_date.setText(String.valueOf(localDate));
    }
    
    
    
    private void lable_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_2MouseClicked
       
         field_clear();
    }//GEN-LAST:event_lable_2MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b_name;
    private javax.swing.JTextField book_id;
    private javax.swing.JCheckBox box_02;
    private javax.swing.JLabel index;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JLabel lable_04;
    private javax.swing.JLabel lable_2;
    private javax.swing.JLabel llable;
    private javax.swing.JLabel r_date;
    private javax.swing.JLabel slot_1;
    private javax.swing.JLabel slot_2;
    private javax.swing.JLabel slot_3;
    private javax.swing.JLabel status;
    private javax.swing.JLabel today;
    // End of variables declaration//GEN-END:variables

// That Method clear all fields in the section
    
 public void field_clear()
    {
        book_id.setText("");
                    
        b_name.setText("");
                    
        today.setText("");
                    
        r_date.setText("");
        
        book_id.setEditable(true);
        
        lable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/333-loader-4.gif")));
        
        box_02.setSelected(false);
        
        lable_04.setVisible(false);
    }


}
