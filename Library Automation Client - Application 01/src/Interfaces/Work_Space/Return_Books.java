/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Work_Space;

import Background.Admin_Logs;
import Background.Cache_Reader;
import static Background.time_management.time_management;
import E_Mail.email_thread_common;
import Interfaces.Notification_Windows.Check_Box;
import Interfaces.Notification_Windows.Sql_error;
import Interfaces.Notification_Windows.done1;
import static Interfaces.Work_Space.Compact_Design.wrorkpane;
import My_SQL.Connector;
import My_SQL.Tax_Operations;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jayashanka Deshan
 */
public class Return_Books extends javax.swing.JInternalFrame {
    
    int Student_ID = 0;
    
     ArrayList<String> book = new ArrayList<String>();
     
    String Author = null;
    
    String MAIL = null;
    
    int tax_money = 0;
        
    ArrayList<String> get_total = new ArrayList<String>();
    
    String due_date;
    
    int statusV = 0; // 0 mean pending
    
    int tax_value = 0;
    
    int payment = 0;
    
    String mail_address = null;
    
    String member_name = null;
    
    public Return_Books()
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
            System.out.println("ERROR : "+ERROR);
        }
        
        reset_all();
        
        data_load(Student_ID);
    }
   
    // That method use for load data
    
    public void data_load(int ID)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LIBRARY_USER WHERE USER_ID = '"+ID+"'";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {   
                index.setText(rs.getString("SLTC_INDEX"));
                
                mail_address = rs.getString("EMAIL_ADDRESS");
                
                member_name = rs.getString("USER_NAME");
                
            }
        }
        catch(Exception ERROR)
        {
          System.out.println("ERROR : "+ERROR);  
        }
        
        load_lending_table();
        
        status();
        
       // tax_found();
    }
    
    
    public void status()
    {
        int ID = Student_ID;
        
        int value = Tax_Operations.validation_tax(ID);
        
        String count = take_count.get_RowCount(ID);
        
        Integer counts = Integer.valueOf(count);
        
        String fund = Tax_Operations.tax_count(ID);
        
        if(counts == 3)
        {
            status.setText("Card Temporary Unavailable");
            
            function_disable.limited_functions_02();
            
        }
        else if((counts < 3) && (value == 1))
        {
            status.setText("Card Available");
            
            function_disable.basic_functions();
        }
        else if(value == 0)
        {
            status.setText("You Have To Do Payment");
            
            tax_slot.setText(fund);
            
            function_disable.limited_functions_01();           
        }
        
        book_nameLoad();  
    }
    
    public void function_disable()
    {
        Compact_Design.jLabel2.setVisible(false);
        
        Compact_Design.jSeparator2.setVisible(false);
    }
    
    


//That method check if the card available 
    
     public void load_lending_table()
    {
        int ID = Student_ID;
        
        book.clear();
        
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LEND_TABLE WHERE USER_ID = '"+ID+"'";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                rs.getString("BOOK_ID");
                
                book.add(rs.getString("BOOK_ID")); 
                
                System.out.println(rs.getString("BOOK_ID"));
              
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
        
            System.out.println(book);
            
            book_nameLoad();      
    }
     
     
     // That method return names of books and assign them to slots
    
    public void book_nameLoad()
    {
        Connection connection =  Connector.connection();
        
        int array_size = book.size();
        
        if(array_size == 1)
        {
            String SQL = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book.get(0)+"'; ";
            
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
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
            
            
        }
        if(array_size == 2)
        {
        String SQL = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book.get(0)+"'; ";
        
        String SQL_02 = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book.get(1)+"'; ";
        
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
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL_02);
            
            while(rs.next())
            {

                slot_4.setText(rs.getString("TITLE_OF_BOOK"));
                
                System.out.println(rs.getString("TITLE_OF_BOOK"));
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }        
                
        }
        
        if(array_size == 3)
        {
        String SQL = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book.get(0)+"'; ";
        
        String SQL_02 = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book.get(1)+"'; ";
         
        String SQL_03 = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+book.get(2)+"'; ";
        
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
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL_02);
            
            while(rs.next())
            {

                slot_4.setText(rs.getString("TITLE_OF_BOOK"));
                
                System.out.println(rs.getString("TITLE_OF_BOOK"));
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
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
            System.out.println(ERROR);
        }
        
        }  
    }
    
    
     // Get availablity of tax 
    
    public void tax_found()
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM RETURN_TABLE WHERE USER_ID ='"+Student_ID+"' AND STATUS = 0 ; ";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
                        
            if(!rs.next())
            {
                System.out.print("RESULT SET UNAVAILABLE!!");
                
                tax_slot.setText("0");
            }
            else
            {
                System.out.print("RESULT SET AVAILABLE!!");
                
                tax_count(); // if tax avalable process previous tax value
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
    }
    
    
    // Get Count of pervious tax value
    
    public void tax_count()
    {
        Connection connection =  Connector.connection();
        
        //String SQL = "SELECT * FROM RETURN_TABLE WHERE ;
        
        String SQL = "SELECT SUM(TAX) FROM RETURN_TABLE WHERE USER_ID ='"+Student_ID+"' AND STATUS = 0 ; ";
        
        int sum = 0;
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
               sum = rs.getInt("SUM(TAX)");
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
        
        System.out.println(sum);
        
        tax_slot.setText(String.valueOf(sum));
    }
    
    
    
    public void load_lendingDETAILS()
    {
        Connection connection =  Connector.connection();
        
        Integer ID = Student_ID;
        
        String SQL = "SELECT * FROM LEND_TABLE WHERE BOOK_ID = '"+Integer.valueOf(book_index.getText())+"' AND USER_ID = '"+ID+"' ";
        
        int count = 1;
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            if(!rs.next())
            {
                System.out.println("Result Set Is Empty");
                
                 select_book.setText("That Book Not Under Your Account");
            }
            else
            {
                System.out.println("Result Set Not Empty");
                
                while(rs.next())
                {
                    rs.getString("ISSUE_DATE");
                    
                    rs.getString("DUE_DATE");
                    
                    time.setText(rs.getString("ISSUE_DATE")+" - "+rs.getString("DUE_DATE"));
                    
                    System.out.println(rs.getString("ISSUE_DATE"));
                }
                
                name_Load();
                
                time_load();
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
    }
    
    // That method return book name
    
    public void name_Load()
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM BOOKS WHERE BOOK_ID ='"+Integer.valueOf(book_index.getText())+"'; ";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                select_book.setText(rs.getString("TITLE_OF_BOOK"));
                
                System.out.println(rs.getString("TITLE_OF_BOOK"));
                
                pointer();
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
        
    }

    
    // That method return lending date and due date from the lending table
    
   public void time_load()
    {
        Connection connection =  Connector.connection();
        
        Integer ID = Student_ID;
        
        String SQL = "SELECT * FROM LEND_TABLE WHERE BOOK_ID = '"+Integer.valueOf(book_index.getText())+"' AND USER_ID = '"+ID+"' ";
        
        int count = 1;
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
                while(rs.next())
                {
                    rs.getString("ISSUE_DATE");
                    
                    due_date = rs.getString("DUE_DATE");
                    
                    time.setText(rs.getString("ISSUE_DATE")+" To "+rs.getString("DUE_DATE"));
                    
                    System.out.println(rs.getString("ISSUE_DATE"));
                }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
        
        tax_counter();
    }
   
   
   public void tax_counter()
    {
        int days = time_management(due_date);
        
        if(days == 0)
        {
            tax_book.setText("No Tax For That Book");
            
            r_days.setText("No More Days Left");
            
            statusV = 1;
            
           // tax_book_2.setText(tax_slot.getText());
        }
        else if(days > 0)
        {
            tax_book.setText("No Tax For That Book");
            
            r_days.setText(days+" Days Available");
            
            statusV = 1;
            
          //  tax_book_2.setText(tax_slot.getText());
        }
        else if(days < 0)
        {
            int real_value = Math.abs(days);
            
            tax_value = real_value * 50;
            
            tax_book.setText(tax_value+".00");
            
            r_days.setText(real_value+" Days Late");
            
            int total_tax = tax_value + Integer.valueOf(tax_slot.getText());
            
            System.out.println("Total Tax : "+total_tax);
            
            tax_slot.setText(String.valueOf(total_tax));
 
            statusV = 0;
            
            function_disable.limited_functions_01();
        }
    }
   
   
   public void pointer()
   {
       String book_name = select_book.getText();
       
       if(slot_1.getText().equals(book_name))
       {
           icon_2.setVisible(true);
       }
        if(slot_4.getText().equals(book_name))
        {
            icon_3.setVisible(true);
        }
        if(slot_3.getText().equals(book_name))
        {
             icon_4.setVisible(true);
        }
   }
   
   
   public void reset_all()
   {
       icon_2.setVisible(false);
       
       icon_3.setVisible(false);
                
       icon_4.setVisible(false);
       
       book_index.setText("");
       
       book_index.setEditable(true);
       
       select_book.setText("");
       
       time.setText("");
       
       r_days.setText("");
       
       tax_book.setText("");
       
       lable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/333-loader-4.gif")));
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        book_index = new javax.swing.JTextField();
        lable_2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        icon_3 = new javax.swing.JLabel();
        icon_2 = new javax.swing.JLabel();
        icon_4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        index = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        slot_1 = new javax.swing.JLabel();
        slot_4 = new javax.swing.JLabel();
        slot_3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbox = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        ttax = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        select_book = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        r_days = new javax.swing.JLabel();
        tax_book = new javax.swing.JLabel();
        tax_slot = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1290, 600));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/assignment_return_35px.png"))); // NOI18N
        jLabel1.setText("RETRUN BOOKS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        book_index.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        book_index.setForeground(new java.awt.Color(102, 102, 102));
        book_index.setBorder(null);
        book_index.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                book_indexFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                book_indexFocusLost(evt);
            }
        });
        book_index.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_indexActionPerformed(evt);
            }
        });
        book_index.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                book_indexKeyReleased(evt);
            }
        });
        jPanel1.add(book_index, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 190, 50));

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

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Book Slot 02 : ");
        panel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, 212, 46));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel12.setText("SLTC Index : ");
        panel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 212, 46));

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel13.setText("Card Status :");
        panel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 212, 46));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel14.setText("Book Slot 01 : ");
        panel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, 212, 46));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 69, 318, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 134, 318, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 202, 318, 10));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 265, 318, 10));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 329, 318, 10));

        icon_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pin_30px.png"))); // NOI18N
        panel1.add(icon_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 221, -1, 43));

        icon_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pin_30px.png"))); // NOI18N
        panel1.add(icon_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 158, -1, 43));

        icon_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pin_30px.png"))); // NOI18N
        panel1.add(icon_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 285, -1, 43));

        jLabel23.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel23.setText("Book Slot 03 :");
        panel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 282, 212, 46));

        index.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        panel1.add(index, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 20, 318, 46));

        status.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        panel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 87, 320, 46));

        slot_1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        panel1.add(slot_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 320, 41));

        slot_4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        panel1.add(slot_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 218, 320, 46));

        slot_3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        panel1.add(slot_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 282, 320, 46));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Panal_3.png"))); // NOI18N
        panel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 360));

        cbox.setBackground(new java.awt.Color(255, 255, 255));
        cbox.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        cbox.setText("User Return Selected Book ");
        cbox.setFocusable(false);
        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo_32px.png"))); // NOI18N
        jLabel29.setText("RETURN BOOK ");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        ttax.setBackground(new java.awt.Color(255, 255, 255));
        ttax.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel16.setText("Total Tax Value :");
        ttax.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 286, 212, 46));

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel17.setText("Selected Book Name : ");
        ttax.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 27, 212, 46));

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel18.setText("Valid Time Period  :");
        ttax.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 212, 46));

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel20.setText("Remaining Dates :");
        ttax.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, 212, 46));

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel22.setText("Tax For Selected Book :");
        ttax.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, 212, 46));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        ttax.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 74, 318, 10));

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        ttax.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 139, 318, 10));

        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        ttax.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 204, 318, 10));

        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        ttax.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 269, 318, 10));

        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        ttax.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 333, 318, 10));

        select_book.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        ttax.add(select_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 27, 320, 46));

        time.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        ttax.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 92, 320, 46));

        r_days.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        ttax.add(r_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 157, 320, 46));

        tax_book.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        ttax.add(tax_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 226, 320, 42));

        tax_slot.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        ttax.add(tax_slot, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 286, 320, 46));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/System_Panal_3.png"))); // NOI18N
        ttax.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ttax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(cbox)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel29)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    

    private void book_indexFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_book_indexFocusGained

    }//GEN-LAST:event_book_indexFocusGained

    private void book_indexFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_book_indexFocusLost

    }//GEN-LAST:event_book_indexFocusLost

    private void book_indexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_indexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_indexActionPerformed
   
    private void book_indexKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_book_indexKeyReleased
        
        if(book_index.getText().trim().isEmpty())
        {
            lable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/333-loader-4.gif")));
        }
        else if(book_index.getText().length() == 10)
        {
            load_lendingDETAILS();
            
            lable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear_symbol_35px.png")));
            
            book_index.setEditable(false);
            
            book_index.setBackground(Color.WHITE);
        }
        else
        {
            lable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/zoom.gif")));    
        }
        
    }//GEN-LAST:event_book_indexKeyReleased
   
    private void lable_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable_2MouseClicked
        
        if(book_index.getText().length() == 10)
        {            
            lable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear_symbol_35px.png")));
            
            reset_all();
        }
    }//GEN-LAST:event_lable_2MouseClicked

    
    public void update()
    {
           
        if(cbox.isSelected())
        {
            Random rand = new Random();

            int random_id = rand.nextInt(99999);

            String ID_ = String.valueOf(random_id);
        
            String return_id = "RE-"+ID_;
            
            Connection connection =  Connector.connection();
            
            Integer ID = Integer.valueOf(Student_ID);
        
            String SQL = "DELETE FROM LEND_TABLE WHERE BOOK_ID = '"+Integer.valueOf(book_index.getText())+"' AND USER_ID = '"+ID+"';";
            
            String SQL_2 = "INSERT INTO RETURN_TABLE (RETURN_ID,BOOK_ID,USER_ID,TAX,STATUS) VALUES ('"+return_id+"','"+Integer.valueOf(book_index.getText())+"','"+ID+"','"+tax_value+"','"+statusV+"');";
            
            try
            {
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        
                preparedStatement.execute();
                
                PreparedStatement preparedStatement_03 = connection.prepareStatement(SQL_2);
                
                preparedStatement_03.execute();
                
                String template = "<h>\n" +
"    <p><pre>\n" +
"\n" +
"        You Just Return BOOK :"+select_book.getText()+" AND YOU HAVE TO PAY LKR."+tax_book.getText()+" FOR LATE BOOK RETURN FUND.\n" +
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
                        
                email_thread_common thread = new  email_thread_common(mail_address,member_name,"Book Return Notification",template,Student_ID);
                
                thread.start();
                
                 Admin_Logs.write("RETURN Book["+select_book.getText()+"] From User");
                
                done1 box = new done1();
            
                box.setVisible(true);
                
                wrorkpane.removeAll();

                Return_Books book_barrow = new  Return_Books();
         
                wrorkpane.add(book_barrow).setVisible(true);

            }
            catch(Exception Error)
            {
                System.out.println("SQL ERROR : "+Error);
                
                Sql_error error = new Sql_error();
                
                error.setVisible(true);
            }
        }
        else
        {
            Check_Box box = new Check_Box();
            
            box.setVisible(true);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxActionPerformed

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
          
        update();
    }//GEN-LAST:event_jLabel29MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField book_index;
    private javax.swing.JCheckBox cbox;
    private javax.swing.JLabel icon_2;
    private javax.swing.JLabel icon_3;
    private javax.swing.JLabel icon_4;
    private javax.swing.JLabel index;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lable_2;
    private javax.swing.JPanel panel1;
    private javax.swing.JLabel r_days;
    private javax.swing.JLabel select_book;
    private javax.swing.JLabel slot_1;
    private javax.swing.JLabel slot_3;
    private javax.swing.JLabel slot_4;
    private javax.swing.JLabel status;
    private javax.swing.JLabel tax_book;
    private javax.swing.JLabel tax_slot;
    private javax.swing.JLabel time;
    private javax.swing.JPanel ttax;
    // End of variables declaration//GEN-END:variables




}
