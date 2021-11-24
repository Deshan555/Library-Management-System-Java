package Background;

//Import the Java IO package for input/output
import java.io.*;

class Read
{
    public static void main(String args[]) throws IOException
    {
	//Initialize input/output stream
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	String  input = "";
	int charCount = 0;

	//Accept one character per iteration. Don't stop until a period is reached.
	//The condition for termination of the For loop is omitted so it will be infinite
	while (true)
	{
	    input += stdin.readLine();
	    charCount += input.length();
	    
	    if (input.charAt(charCount) == '.')
	    {
		System.out.println("You entered " + charCount + " characters.");
		break;
	    }
	}
    }
}