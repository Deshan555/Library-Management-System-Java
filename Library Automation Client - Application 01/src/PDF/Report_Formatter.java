package PDF;

import java.io.*;

import java.time.LocalDate;

public class Report_Formatter
{
    public static void Report_Generate(String member_id,String book_id,String fines,String Payment_id,String note,String clue) throws IOException
    {
        String file_name = "index.html";

        LocalDate localDate = LocalDate.now();

        String date = String.valueOf(localDate);

        String format = "<html>\n" +
                "    <head>\n" +
                "        <title>SLTC</title>\n" +
                "    </head>\n" +
                "\n" +
                "    <body>\n" +
                "        <div align='center'>\n" +
                "            <img src = \"img/logo.png\" alt = \"logo header\"><br/>\n" +
                "         </div>\n" +
                "\n" +
                "         <h1 style=\"font-family: 'Courier New', Courier, monospace; font-weight:500; font-size: 40PX; text-align: center; font-display:inherit;\">\n" +
                "            <ul>BOOK REPAIR REPORT</ul> \n" +
                "        </h1>\n" +
                "    </body>\n" +
                "\n" +
                "    <body>\n" +
                "        <p style=\"text-align: center; font-family: 'Courier New', Courier, monospace; font-size: medium;\"> \n" +
                "            Membership ID : "+member_id+"<br><br>\n" +
                "\n" +
                "            Book ID : "+book_id+"<br><br>\n" +
                "\n" +
                "            Payment ID : "+Payment_id+"<br><br>\n" +
                "\n" +
                "            Book Repairing Fines : "+fines+"<br><br>\n" +
                "\n" +
                "            Date : "+date+"<br><br>\n" +
                "\n" +
                "            Note : "+note+"<br><br>\n" +
                "\n" +
                "            Clue Image : <br><br> <img src = '"+clue+"' alt = \"clue_image\" style=\"align-items: center;\">\n" +
                "        </p>\n" +
                "        \n" +
                "    </body>\n" +
                "\n" +
                "    <footer style=\"text-align: center; font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;\">\n" +
                "        <br><br><br><br>That PDF Automatically Genarated By SBB \n" +
                "    </footer>\n" +
                "</html>";

        FileOutputStream details = new FileOutputStream(file_name);

        PrintWriter file = new PrintWriter(details);

        BufferedWriter store = new BufferedWriter(file);

        store.write(format);

        store.newLine();

        store.close();

        file.close();
        
        HtmlToPDF.Reporter(Payment_id);

        System.out.print("Data Successfully Entered To "+file_name+"\n");

        String message = "Data Successfully Entered To "+file_name;

    }
}
