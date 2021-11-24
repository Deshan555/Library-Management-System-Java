/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Background.get_localDate;
import My_SQL.Connector;
import My_SQL.Tax_Operations;
import My_SQL.total_fund;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;


/**
 *
 * @author Jayashanka Deshan
 */
public class Statics extends javax.swing.JInternalFrame {

    Integer value;
     
    public Statics() 
    {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
        
        get_data data = new get_data();
        
        data.start();
        
        Timer timer;
        
        ActionListener actionListener = new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Date date = new Date();
                
                DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
                
                String time = timeFormat.format(date);
                
                timeFormat = new SimpleDateFormat("dd MMMM yyyy");
                
                today.setText(timeFormat.format(date));
                
                DateFormat get_status = new SimpleDateFormat("HH");
                
                String status = get_status.format(date);
                
                value = Integer.valueOf(status);
                
                 if((value>=00)&&(value<13))
                {                    
                    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sunrise_80px.png")));
                }
                if((value>=13)&&(value<18))
                {
                    //System.out.print("Evening");
                    
                    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sunset_80px.png")));
                }
                if((value>=18)&&(value<=24))
                {
                    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/night_80px.png")));
                }
                
                time_zone.setText(time);
                
            }
        };
        
        timer = new Timer(1000, actionListener);
        
        timer.setInitialDelay(0);
        
        timer.start();
        
        today_data();
        
        count_4.setText("LKR. "+total_fund.fund());
        
        count_3.setText("LKR. "+Tax_Operations.total_count());
    }
    
 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        count_0 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        count_1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        count_2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        count_3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        count_4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        time_zone = new javax.swing.JLabel();
        today = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        view = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1280, 668));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 30)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animations/153-bar-chart-growth-outline.gif"))); // NOI18N
        jLabel4.setText("DASHBOARD");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/books_45px.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 150, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(" TOTAL BOOKS");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 140, 30));

        count_0.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        count_0.setForeground(new java.awt.Color(51, 51, 51));
        count_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count_0.setText("00000");
        count_0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(count_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 140, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Panel.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, -1, 101));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 240, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/read_online_45px.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 150, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TOTAL READERS");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 160, 30));

        count_1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        count_1.setForeground(new java.awt.Color(51, 51, 51));
        count_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count_1.setText("00000");
        count_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(count_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 140, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Panel.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 101));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 11, 240, 120));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopping_cart_45px.png"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 40));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 150, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("LENDED BOOKS");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 140, 30));

        count_2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        count_2.setForeground(new java.awt.Color(51, 51, 51));
        count_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count_2.setText("00000");
        count_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(count_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 140, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Panel.png"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 101));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 11, 240, 120));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/card_payment_40px.png"))); // NOI18N
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 40));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 150, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PENDING FINES");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 150, 30));

        count_3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        count_3.setForeground(new java.awt.Color(51, 51, 51));
        count_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count_3.setText("00000");
        count_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.add(count_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 140, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Panel.png"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 101));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 11, 240, 120));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/capital_45px.png"))); // NOI18N
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 40));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 150, -1));

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("TOTAL FINES");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 140, 30));

        count_4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        count_4.setForeground(new java.awt.Color(51, 51, 51));
        count_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count_4.setText("00000");
        count_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.add(count_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 140, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Panel.png"))); // NOI18N
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 101));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 11, 240, 120));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time_zone.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        time_zone.setForeground(new java.awt.Color(51, 51, 51));
        time_zone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time_zone.setText("06:45:45 A.M");
        jPanel1.add(time_zone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 460, 90));

        today.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        today.setForeground(new java.awt.Color(51, 51, 51));
        today.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        today.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar_1_50px.png"))); // NOI18N
        today.setText("2021 October 15");
        jPanel1.add(today, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 460, 60));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/night_80px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 40, 450, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Time.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 410));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 460, 410));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        view.setEditable(false);
        view.setColumns(20);
        view.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        view.setRows(5);
        view.setBorder(null);
        jScrollPane1.setViewportView(view);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 710, 360));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fiber_smart_record_30px.png"))); // NOI18N
        jLabel5.setText("TODAY RECORDS : ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public class get_data implements Runnable
    {
        private final Thread thread;
        
        public get_data()
        {
            thread = new Thread(this);
        }

        @Override
        public void run()
        {
        take_count count = new take_count();
        
        count_0.setText(count.get_RowCount("BOOKS","BOOK_ID"));
        
        count_1.setText(count.get_RowCount("LIBRARY_USER","USER_ID"));
        
        count_2.setText(count.get_RowCount("LEND_TABLE","LEND_ID"));   
        }
        
        public void start()
        {
            thread.start();
        }
        
    }
     
     
    public static void today_data()
    {
        String SQL = "SELECT * FROM LEND_TABLE WHERE ISSUE_DATE = '"+get_localDate.LocalDate()+"';";
        
        Connection connection =  Connector.connection();
        
        int record = 1;
         
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
               String user_id = rs.getString("USER_ID");
               
               String book_id = rs.getString("BOOK_ID");
               
               String lend_id = rs.getString("LEND_ID");
               
               view.append("Record Number : "+record+"\n"+user_id+" Lend -> Book ID : "+book_id+"["+lend_id+"]\n\n");
               
               record = record + 1;
            }  
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel count_0;
    private javax.swing.JLabel count_1;
    private javax.swing.JLabel count_2;
    private javax.swing.JLabel count_3;
    private javax.swing.JLabel count_4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel time_zone;
    private javax.swing.JLabel today;
    private static javax.swing.JTextArea view;
    // End of variables declaration//GEN-END:variables
}
