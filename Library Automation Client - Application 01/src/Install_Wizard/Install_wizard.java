
package Install_Wizard;

import Background.Bugs;
import javax.swing.ImageIcon;

public class Install_wizard extends javax.swing.JFrame {

    public Install_wizard()
    {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/Images/rocket_100px.png")).getImage());
        
        install_wiz.removeAll();
        
        icon screen = new icon();
        
        install_wiz.add(screen).setVisible(true);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        install_wiz = new javax.swing.JDesktopPane();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Installation Wizard");
        setResizable(false);

        javax.swing.GroupLayout install_wizLayout = new javax.swing.GroupLayout(install_wiz);
        install_wiz.setLayout(install_wizLayout);
        install_wizLayout.setHorizontalGroup(
            install_wizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 989, Short.MAX_VALUE)
        );
        install_wizLayout.setVerticalGroup(
            install_wizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(install_wiz, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(install_wiz, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) 
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
        }

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Install_wizard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane install_wiz;
    private javax.swing.JInternalFrame jInternalFrame1;
    // End of variables declaration//GEN-END:variables
}
