/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Background.Bugs;
import Background.Config;
import Background.get_localDate;
import My_SQL.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jayashanka Deshan
 */
public class Time_Line extends javax.swing.JInternalFrame {

    String sdate = null;
            
    public Time_Line()
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        sdate = get_localDate.LocalDate();
        
        clear();
        
        load_Lendings();
        
        load_Payments();
        
        load_Mail();
        
    }

    
    public void load_Lendings()
    {
        String sql = "SELECT * FROM LEND_TABLE WHERE ISSUE_DATE = '"+sdate+"';";
        
        Connection connection =  Connector.connection();
                
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            int record = 1;
            
            while(rs.next())
            {
                jTextArea2.append("Record ID : "+record+"\n");
                
                jTextArea2.append("Lending ID : "+rs.getString("LEND_ID")+"\n");
                
                jTextArea2.append("Issue Date : "+rs.getString("ISSUE_DATE")+"\n");
                
                jTextArea2.append("Due Date : "+rs.getString("DUE_DATE")+"\n");
                
                jTextArea2.append("User ID : "+rs.getString("USER_ID")+"\n");
                
                jTextArea2.append("Book ID : "+rs.getString("BOOK_ID")+"\n\n");
                
                record = record + 1; 
            }
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
    
    public void clear()
    {
        jTextArea5.setText("");
        
        jTextArea2.setText("");
        
        jTextArea6.setText("");
    }
    
    public void load_Payments()
    {
        String sql = "SELECT * FROM PROFIT WHERE DATE = '"+sdate+"';";
        
        Connection connection =  Connector.connection();
                
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
             
            int record = 1;
            
            while(rs.next())
            {
                jTextArea5.append("Record ID : "+record+"\n");
                
                jTextArea5.append("Bill ID : "+rs.getString("BILL_ID")+"\n");
                
                jTextArea5.append("Paid By : "+rs.getString("SLTC_INDEX")+"\n");
                
                jTextArea5.append("Recipt Number : "+rs.getString("RECIPT_NUMBER")+"\n");
                
                jTextArea5.append("Date : "+rs.getString("DATE")+"\n");
                
                jTextArea5.append("Discription : "+rs.getString("DISCRIPTION")+"\n");
                
                jTextArea5.append("Value : LKR "+rs.getString("VALUE")+".00\n");
                
                jTextArea5.append("Counter ID : "+rs.getString("COUNTER_ID")+"\n\n");
                
                record = record + 1; 
            }
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }
    }
    
    
    public void load_Mail()
    {
        String sql = "SELECT * FROM E_MAIL WHERE TIME = '"+sdate+"';";
        
        Connection connection =  Connector.connection();
                
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
             
            int record = 1;
            
            while(rs.next())
            {
                jTextArea6.append("Record ID : "+record+"\n");
                
                jTextArea6.append("Mail ID : "+rs.getString("EMAIL_ID")+"\n");
                
                jTextArea6.append("Subject : "+rs.getString("SUBJECT")+"\n");
                
                jTextArea6.append("Date : "+rs.getString("TIME")+"\n");
                
                jTextArea6.append("Sent To : "+rs.getString("SEND_TO")+"\n\n");
                             
                record = record + 1; 
            }
        }
        catch(Exception ERROR)
        {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1280, 668));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 30)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/12-layes-outline.gif"))); // NOI18N
        jLabel3.setText("TIME LINE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFocusable(false);
        date.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/details_30px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(114, 114, 114)
                .addComponent(jLabel4)
                .addGap(298, 298, 298))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1278, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        jScrollPane5.setBorder(null);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setBorder(null);

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1250, 470));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/timeline_28px.png"))); // NOI18N
        jLabel6.setText("PAYMENTS ON THAT DAY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 390, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/timeline_28px.png"))); // NOI18N
        jLabel7.setText("SENT MAILS ON THAT DAY");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 390, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/timeline_28px.png"))); // NOI18N
        jLabel8.setText("LENDED BOOKS ON THAT DAY");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 390, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       
        Date get_date = date.getDate();
         
        DateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
        
        Date newdate = get_date;
        
        sdate = String.valueOf(date_format.format(newdate));
        
        clear();
        
        load_Lendings();
        
        load_Payments();
        
        load_Mail();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    // End of variables declaration//GEN-END:variables
}
