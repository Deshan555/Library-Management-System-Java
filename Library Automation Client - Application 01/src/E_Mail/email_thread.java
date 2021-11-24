package E_Mail;

import Background.Bugs;

import Interfaces.Notification_Windows.Queue_Processing;

import My_SQL.Save_mailLog;

import SQLite_03.Load_Settings;

import Sound_Profiles.Profiles;

import com.email.durgesh.Email;

import com.sbix.jnotify.NPosition;

import com.sbix.jnotify.NoticeType;

import com.sbix.jnotify.NoticeWindow;

import java.io.FileNotFoundException;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import javazoom.jl.decoder.JavaLayerException;

public class email_thread extends Thread
{
    String reciver_name = null;
    
    String reciver_mail = null;
    
    String subject_ = null;
    
    String message_ = null; 
    
    int  index_ = 0;
    
    
    public email_thread(String reaciver,String name,String subject,String msg,int index)
    {
        reciver_name = name;
        
        reciver_mail = reaciver;
        
        subject_ = subject;
        
        message_ = msg;
        
        index_ = index;
    }
    
     public void run() 
     {
        Queue_Processing process = new Queue_Processing();
        
        try 
        {
            String message =  main_template(message_,subject_);
            
            String user_name = Load_Settings.load_settings("EMAIL");
            
            String password  = Load_Settings.load_settings("PASSWORD");
            
            Email email = new Email(user_name,password);
            
            email.setFrom(user_name,Load_Settings.load_settings("SENDER_NAME"));
            
            email.setSubject(subject_);
            
            email.setContent(message,"text/html");
            
            email.addRecipient(reciver_mail);
            
            try
            {
                String notification = "Wait Mail Sending to "+reciver_mail+" ..........";
                
                new NoticeWindow(NoticeType.DEFAULT_NOTIFICATION,notification,NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
                                
                email.send();
                
                notification = "Mail Sended to "+reciver_mail+" ..........";
                
                new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,notification,NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
                
                Save_mailLog.save_log(subject_,index_);
                
                Profiles.done();
                
                new Queue_Processing().setVisible(true);

            }
            catch (MessagingException ex)
            {
                try {
                    System.out.println(ex);
                    
                    new NoticeWindow(NoticeType.ERROR_NOTIFICATION,"Mail Sending Faild : "+ex,NoticeWindow.SHORT_DELAY,NPosition.CENTER);
                    
                    Profiles.fail();
                }
                catch (FileNotFoundException ex1)
                {
                    Bugs.exceptions(String.valueOf(ex1));
                }
                catch (JavaLayerException ex1)
                {
                   Bugs.exceptions(String.valueOf(ex1));
                }
            }
            catch (FileNotFoundException | JavaLayerException ex)
            {
                Bugs.exceptions(String.valueOf(ex));
            }
        } 
        catch (MessagingException | UnsupportedEncodingException ex) 
        {
            try 
            {
                Bugs.exceptions(String.valueOf(ex));
                
                Profiles.fail();
            }
            catch(FileNotFoundException | JavaLayerException ex1)
            {
                Bugs.exceptions(String.valueOf(ex1));
            }
        }
     }
     
     
    
     
    public static String main_template(String data,String subject)
    {
        String mail = ""
                + ""
                + "<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"  <head>\n" +
"    <meta charset=\"UTF-8\" />\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
"    <title>Document</title>\n" +
"    <style>\n" +
"     \n" +
"\n" +
"      * {\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"        border: 0;\n" +
"      }\n" +
"\n" +
"      body {\n" +
"        font-family: 'Courier New', monospace;\n" +
"        background-color: #d8dada;\n" +
"        font-size: 19px;\n" +
"        max-width: 800px;\n" +
"        margin: 0 auto;\n" +
"        padding: 3%;\n" +
"      }\n" +
"\n" +
"      img {\n" +
"        max-width: 100%;\n" +
"      }\n" +
"\n" +
"      header {\n" +
"        width: 98%;\n" +
"      }\n" +
"\n" +
"      #logo {\n" +
"        max-width: 500px;\n" +
"        margin: 3% 0 3% 3%;\n" +
"        float: left;\n" +
"      }\n" +
"\n" +
"      #wrapper {\n" +
"        background-color: #f0f6fb;\n" +
"      }\n" +
"\n" +
"      #social {\n" +
"        float: right;\n" +
"        margin: 3% 2% 4% 3%;\n" +
"        list-style-type: none;\n" +
"      }\n" +
"\n" +
"      #social > li {\n" +
"        display: inline;\n" +
"      }\n" +
"\n" +
"      #social > li > a > img {\n" +
"        max-width: 35px;\n" +
"      }\n" +
"\n" +
"      h1,\n" +
"      p {\n" +
"        margin: 3%;\n" +
"      }\n" +
"    \n" +
"\n" +
"      hr {\n" +
"        height: 1px;\n" +
"        background-color: #000000;\n" +
"        clear: both;\n" +
"        width: 96%;\n" +
"        margin: auto;\n" +
"      }\n" +
"\n" +
"      #contact {\n" +
"        text-align: center;\n" +
"        padding-bottom: 3%;\n" +
"        line-height: 16px;\n" +
"        font-size: 12px;\n" +
"        color: #000000;\n" +
"      }\n" +
"    </style>\n" +
"  </head>\n" +
"  <body>\n" +
"    <div id=\"wrapper\">\n" +
"      <header>\n" +
"        <div id=\"logo\">\n" +
"          <img\n" +
"            src=\"https://sltc.ac.lk/assets/images/logo-lg.png\"\n" +
"            alt=\"\"\n" +
"          />\n" +
"        </div>\n" +
"      </header>\n" +
"      <div id=\"banner\">\n" +
"        <img\n" +
"          src=\"https://i.ibb.co/g3LJ62r/Banner.png\" \n" +
"          alt=\"\"\n" +
"        />\n" +
"      </div>\n" +
"      <div class=\"one-col\">\n" +
"        <h1>"+subject+"</h1>\n" +
"\n" +
"        <p>\n" + data +
"        </p>\n" +
"\n" +
"        <hr />\n" +
"\n" +
"        <footer>\n" +
"          <p id=\"contact\">\n" +
"            +94 11 2100 500 / +94 71 1100 500 <br/>\n" +
"            info@sltc.ac.lk<br/>\n" +
"            Main Campus : Ingiriya Road, Padukka, Sri Lanka.<br/>\n" +
"            Colombo Campus : No 07, Hector Kobbakaduwa Mawatha, Colombo 07.<br/>\n" +
"            City Campus : Trace Expert City, Colombo 10 <br/>\n" +
"          </p>\n" +
"        </footer>\n" +
"      </div>\n" +
"    </div>\n" +
"  </body>\n" +
"</html>";
        
        return mail;
    }
}
    

