/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Work_Space;

/**
 *
 * @author whatd
 */
public class function_disable 
{
     public void all_disable()
    {
        Compact_Design.rbook_button.setVisible(false);
        
        Compact_Design.payment_button.setVisible(false);
        
        Compact_Design.jLabel2.setVisible(false);
        
        Compact_Design.jSeparator2.setVisible(false);
        
        Compact_Design.jSeparator3.setVisible(false);
        
        Compact_Design.jSeparator4.setVisible(false);
    }
    
    
    public static void basic_functions()
    {
        Compact_Design.rbook_button.setVisible(true);
         
        Compact_Design.jLabel2.setVisible(true);
         
        Compact_Design.jSeparator2.setVisible(true);
        
        Compact_Design.jSeparator3.setVisible(true);
    }
    
    
    public static void limited_functions_01() // For payments
    {
         Compact_Design.payment_button.setVisible(true);
         
         Compact_Design.jSeparator4.setVisible(true);
         
         Compact_Design.rbook_button.setVisible(true);
         
         Compact_Design.jSeparator4.setVisible(true);
         
         Compact_Design.jLabel2.setVisible(false);
         
         Compact_Design.jSeparator2.setVisible(false);
    }
    
     public static void limited_functions_02() // For limited books reached
    {
         Compact_Design.payment_button.setVisible(false);
         
         Compact_Design.jSeparator4.setVisible(false);
         
         Compact_Design.rbook_button.setVisible(true);
         
         Compact_Design.jSeparator4.setVisible(true);
         
         Compact_Design.jLabel2.setVisible(false);
         
         Compact_Design.jSeparator2.setVisible(false);
    }
    
}
