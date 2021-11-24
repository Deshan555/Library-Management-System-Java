package Interfaces;

import Interfaces.Notification_Windows.Update;
import Background.Bugs;

import Background.Domain_Validator;

import Interfaces.Notification_Windows.Block_Delete_1;

import Interfaces.Notification_Windows.Delete_member;

import Interfaces.Notification_Windows.duplicate_found;

import My_SQL.Connector;

import My_SQL.Tax_Operations;

import My_SQL.User_Validation;
import Online_Services.Connect_Online;

import java.awt.Color;

import java.awt.Toolkit;

import java.awt.event.WindowEvent;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class Update_Users extends javax.swing.JFrame 
{

    String student_index = null;
    
    public Update_Users(String selection) 
    {
        initComponents();
        
        mail.setForeground(Color.GRAY);
        
        number.setForeground(Color.GRAY);
        
        this.student_index = selection;
        
        member_data(student_index);
        
        setIconImage(new ImageIcon(getClass().getResource("/Images/male_user_50px.png")).getImage());
    }

    // User Define Functions
    
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
                
                number.setText(rs.getString("MOBILE_NUMBER"));
                
                nic.setText(rs.getString("NIC"));    
            }
        }
        catch(SQLException ERROR)
        {
             Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
    // Code for update user data
    
    public void data_update()
    {
        int uid = Integer.valueOf(student_index);
        
        String SQL = "UPDATE library_user SET EMAIL_ADDRESS = '"+mail.getText()+"',MOBILE_NUMBER = '"+number.getText()+"' WHERE USER_ID = "+uid+";";
        
        Connection connection =  Connector.connection();
        
        Connection conn = Connect_Online.Online();
        
        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.executeUpdate();
           
           PreparedStatement preparedStatement_2 = conn.prepareStatement(SQL);

           preparedStatement_2.executeUpdate();
           
           new Update().setVisible(true);
           
        }
        catch(SQLException ERROR)
        {
             JOptionPane.showMessageDialog(null,"SQL ERROR : \n"+ERROR);
             
             Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
    
    // Code for remove user
    
    public void cascade_delete()
    {
        int uid = Integer.valueOf(student_index);
        
        Connection connection = Connector.connection();
        
        Connection conn = Connect_Online.Online();
        
        String SQL_1 = "DELETE FROM E_MAIL WHERE SEND_TO = "+uid+";";
        
        String SQL_2 = "DELETE FROM RETURN_TABLE WHERE USER_ID = "+uid+";";
        
        String SQL_3 = "DELETE FROM library_user WHERE USER_ID = "+uid+";";
        
        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL_1);

           preparedStatement.executeUpdate();
           
        }
        catch(SQLException ERROR)
        {
            JOptionPane.showMessageDialog(null,"SQL ERROR : \n"+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }

        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL_2);

           preparedStatement.executeUpdate();
        }
        catch(SQLException ERROR)
        {
            JOptionPane.showMessageDialog(null,"SQL ERROR : \n"+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }

        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL_3);

           preparedStatement.executeUpdate();
           
           PreparedStatement preparedStatement_1 = conn.prepareStatement(SQL_3);

           preparedStatement_1.executeUpdate();
           
           new Delete_member().setVisible(true);
        }
        catch(SQLException ERROR)
        {
            JOptionPane.showMessageDialog(null,"SQL ERROR : \n"+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        } 
 
    }
    
    
    // Check user status
    
    public void check_conditions()
    {
        int condition_one = Tax_Operations.validation_tax(Integer.valueOf(student_index)); // 1
        
        int condition_two = condition_02(); // 1
        
        if(condition_one == 1 && condition_two == 1)
        {
            cascade_delete();
            
            Members.table_load();
        }
        else
        {
            new Block_Delete_1().setVisible(true);
        }
    }
    
    
    // Check condition 02 in the tables
    
    public int condition_02()
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM LEND_TABLE WHERE USER_ID = "+Integer.valueOf(student_index)+"";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
                    
            if(!rs.next())
            {                
                return 1;
            }
            else
            {                
                return 0;
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
            
            return 0;
        }
    }
    
    // Close Window
    
    public void close()
    {
        WindowEvent new_event;
        
        new_event = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(new_event);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        index = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        rclass = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update User");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel1.setText("UPDATE INFO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 194, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("User Name : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, 210, 44));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setText("User ID : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, 210, 44));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setText("SLTC Index : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 210, 44));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Mobile Number : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 477, 210, 44));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel7.setText("NIC Number : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 279, 210, 44));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel8.setText("E-Mail Address : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 411, 210, 44));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Batch And School : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 345, 210, 44));

        name.setEditable(false);
        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        name.setBorder(null);
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 82, 326, 44));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        id.setBorder(null);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 148, 326, 44));

        number.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        number.setBorder(null);
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberKeyReleased(evt);
            }
        });
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 478, 326, 44));

        index.setEditable(false);
        index.setBackground(new java.awt.Color(255, 255, 255));
        index.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        index.setBorder(null);
        getContentPane().add(index, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 214, 326, 44));

        nic.setEditable(false);
        nic.setBackground(new java.awt.Color(255, 255, 255));
        nic.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        nic.setBorder(null);
        getContentPane().add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 280, 326, 44));

        rclass.setEditable(false);
        rclass.setBackground(new java.awt.Color(255, 255, 255));
        rclass.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        rclass.setBorder(null);
        getContentPane().add(rclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 346, 326, 44));

        mail.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        mail.setBorder(null);
        mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailKeyReleased(evt);
            }
        });
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 412, 326, 44));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 127, 326, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 193, 326, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 259, 326, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 325, 326, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 391, 326, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 457, 326, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 523, 326, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 81, -1, 441));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update_user_30px.png"))); // NOI18N
        jLabel10.setText("UPDATE DETAILS");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 180, 223, 50));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove_tag_30px.png"))); // NOI18N
        jLabel11.setText("REMOVE USER");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 260, 223, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SQL_Setting.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 320, 440));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close_window_30px.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background_01.png"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
        int choice = JOptionPane.showConfirmDialog(null,"Do You Really Want to Update That Data");
        
        if(choice == 0)
        {
            data_update();
            
            Members.table_load();
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void mailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailKeyReleased
        
        //That fields help to validate data
                
        if(mail.getText().matches("^[a-zA-Z0-9.@]*$") && (Domain_Validator.Matcher(mail.getText()) == 1))
        {
            mail.setForeground(Color.GRAY);
            
            int get_value = User_Validation.validation_EMAIL(mail.getText());
            
            if(get_value == 1)
            {
                duplicate_found found = new duplicate_found();
           
                found.setVisible(true);
            
                mail.setText("");
            }
        }
        else
        {
            mail.setForeground(Color.RED);
        }
    }//GEN-LAST:event_mailKeyReleased

    private void numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyReleased
        
        //That Fields help to validate Mobile Number
                
        if(number.getText().matches("^[0-9]*$") && number.getText().length()== 10)
        {
            number.setForeground(Color.GRAY);
            
            int get_value = User_Validation.validation_number(Integer.valueOf(number.getText()));
            
            if(get_value == 1)
            {
                duplicate_found found = new duplicate_found();
                
                found.setVisible(true);
            
                number.setText("");
            }
        }
        else
        {
            number.setForeground(Color.RED);
        }
    }//GEN-LAST:event_numberKeyReleased

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
        int choice = JOptionPane.showConfirmDialog(null,"Do You Really Want to Remove That Book\nIt Can't Be Undone");
        
        if(choice == 0)
        {
            check_conditions();
        }
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        
        close();
    }//GEN-LAST:event_jLabel13MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JTextField index;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField number;
    private javax.swing.JTextField rclass;
    // End of variables declaration//GEN-END:variables
}
