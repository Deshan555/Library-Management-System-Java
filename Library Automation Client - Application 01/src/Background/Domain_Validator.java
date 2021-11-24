package Background;

public class Domain_Validator 
{
    public static int Matcher(String mail)
    {
        if (mail.matches("^\\S+@sltc.ac\\.lk$")) 
        {
            System.out.println("Match!");
            
            return 1;
        }
        
        return 0;
    }
}
 