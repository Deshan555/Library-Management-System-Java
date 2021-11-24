package PDF;


import Background.Bugs;

import Background.Config;

import com.itextpdf.html2pdf.HtmlConverter;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class HtmlToPDF 
{
    private static final String ORIG = "index.html";
    
    public static void Reporter(String Report)
    {
        LocalDate localDate = LocalDate.now();
        
        String date = String.valueOf(localDate);
        
        String path = Config.get_properties("pdf_path");
        
        String file_name = path+Report+"_"+String.valueOf(date)+".pdf";
        
        File htmlSource = new File(ORIG);
        
        File pdfDest = new File(file_name);
        
        try
        {
            HtmlConverter.convertToPdf(new FileInputStream(htmlSource), new FileOutputStream(pdfDest));
            
            JOptionPane.showMessageDialog(null,"Damage Repair Report Save In The Below Directory\n"+pdfDest.getAbsolutePath()+"");
        }
        catch(Exception ERROR)
        {
            Bugs.exceptions(String.valueOf(ERROR));
            
            JOptionPane.showMessageDialog(null,"Error : "+ERROR);
        }
    }
    
    public static void main(String[] args)
    {
        Reporter("Report_Example");
    }
}

