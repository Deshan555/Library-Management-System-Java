/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Background.Bugs;
import Interfaces.Notification_Windows.Update;
import Interfaces.Notification_Windows.Delete;
import Interfaces.Notification_Windows.Block_Delete;
import My_SQL.Connector;
import Online_Services.Connect_Online;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author whatd
 */
public class Edit_Books extends javax.swing.JFrame {

    String book_id = null;
    
    int status = 0;
    
    public Edit_Books(String ID,int status) 
    {
        initComponents();
                
        book_id = ID;
        
        this.status = status;

        book_data_load(book_id);
    }
    
    
    
    public void install_id(String id)
    {
        this.book_id = id;
    }
    
    
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
                
                id.setText(rs.getString("BOOK_ID"));
                
                price.setText(rs.getString("BOOK_PRICE"));
                
                isbn.setText(rs.getString("ISBN"));
            }
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
    public void data_update()
    {
        String SQL = "UPDATE BOOKS SET SECTION = "+section.getText()+",BOOK_LINK = '"+url.getText()+"',Book_PRICE = "+price.getText()+" WHERE BOOK_ID = "+book_id+";";
        
        Connection connection =  Connector.connection();
        
        Connection conn = Connect_Online.Online();
        
        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.executeUpdate();
           
           PreparedStatement preparedStatement_1 = conn.prepareStatement(SQL);

           preparedStatement_1.executeUpdate();
           
           new Update().setVisible(true);
           
        }
        catch(SQLException ERROR)
        {
             JOptionPane.showMessageDialog(null,"SQL ERROR : \n"+ERROR);
             
             Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
    
    public void cascade_delete()
    {
        String SQL = "DELETE FROM BOOKS WHERE BOOK_ID = "+book_id+";";
        
        String SQL1 = "DELETE FROM lend_table WHERE BOOK_ID = "+book_id+";";
        
        String SQL2 = "DELETE FROM return_table WHERE BOOK_ID = "+book_id+";";
        
        Connection connection = Connector.connection();
        
        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL2);

           preparedStatement.executeUpdate();
           
        }
        catch(SQLException ERROR)
        {
            JOptionPane.showMessageDialog(null,"SQL ERROR : \n"+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }

        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL1);

           preparedStatement.executeUpdate();
        }
        catch(SQLException ERROR)
        {
            JOptionPane.showMessageDialog(null,"SQL ERROR : \n"+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        }

        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.executeUpdate();
           
           remove_book();
           
           new Delete().setVisible(true);
        }
        catch(SQLException ERROR)
        {
            JOptionPane.showMessageDialog(null,"SQL ERROR : \n"+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        } 
    }
    
    
    public void remove_book()
    {
        Connection conn = Connect_Online.Online();
        
        String SQL = "DELETE FROM BOOKS WHERE BOOK_ID = "+book_id+";";
        
        try
        {
           PreparedStatement preparedStatement = conn.prepareStatement(SQL);

           preparedStatement.executeUpdate();
           
        }
        catch(SQLException ERROR)
        {
            JOptionPane.showMessageDialog(null,"SQL ERROR : \n"+ERROR);
            
            Bugs.exceptions(String.valueOf(ERROR));
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        author = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        url = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        section = new javax.swing.JTextField();
        cat = new javax.swing.JTextField();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel1.setText("EDIT INFO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 182, 55));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Book Link : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 521, 167, 51));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Book Name : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, 167, 51));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Author Name : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 138, 167, 51));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Book ID : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, 167, 51));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel6.setText("ISBN Number :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 167, 51));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Book Price :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 331, 167, 51));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Section :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 397, 167, 51));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Category : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 455, 167, 51));

        author.setEditable(false);
        author.setBackground(new java.awt.Color(255, 255, 255));
        author.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        author.setBorder(null);
        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });
        getContentPane().add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 141, 352, 44));

        name.setEditable(false);
        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 75, 352, 44));

        url.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        url.setBorder(null);
        url.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlActionPerformed(evt);
            }
        });
        getContentPane().add(url, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 524, 352, 44));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        id.setBorder(null);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 207, 352, 44));

        isbn.setEditable(false);
        isbn.setBackground(new java.awt.Color(255, 255, 255));
        isbn.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        isbn.setBorder(null);
        isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnActionPerformed(evt);
            }
        });
        getContentPane().add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 273, 352, 44));

        price.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        price.setBorder(null);
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 334, 352, 44));

        section.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        section.setBorder(null);
        section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionActionPerformed(evt);
            }
        });
        getContentPane().add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 400, 352, 44));

        cat.setEditable(false);
        cat.setBackground(new java.awt.Color(255, 255, 255));
        cat.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        cat.setBorder(null);
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });
        getContentPane().add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 458, 352, 44));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 124, 352, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 190, 352, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 256, 352, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 322, 352, 5));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 383, 352, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 449, 352, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 507, 352, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 573, 352, 10));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/waste_30px.png"))); // NOI18N
        jLabel10.setText("REMOVE BOOK");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 200, 60));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/available_updates_30px.png"))); // NOI18N
        jLabel11.setText("UPDATE DETAILS");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 190, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close_window_30px.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background_01.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void urlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionActionPerformed

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        
        close();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
        int choice = JOptionPane.showConfirmDialog(null,"Do You Really Want to Update That Data");
        
        if(choice == 0)
        {
             data_update();
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
        int choice = JOptionPane.showConfirmDialog(null,"Do You Really Want to Remove That Book\nIt Can't Be Undone");
        
        if(choice == 0)
        {
            if(status == 1)
        {
            cascade_delete();
        }
        else
        {
           new Block_Delete().setVisible(true);
        }
        }
        
    }//GEN-LAST:event_jLabel10MouseClicked

   public void close()
    {
        WindowEvent new_event;
        
        new_event = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(new_event);
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author;
    private javax.swing.JTextField cat;
    private javax.swing.JTextField id;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField section;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
