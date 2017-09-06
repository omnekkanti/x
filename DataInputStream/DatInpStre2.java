import static java.lang.System.*;
import java.io.*;

class DataInputStream2 
 {

   
    public static void main(String[] args)throws Exception
 	{
		DataInputStream x = new DataInputStream(in); in is a byte-input stream(gives byte as input)
		out.println("Enter something");
		String output = x.readLine();// this method abstracts following commented code
		/* while((r = in.read()) >= 0) 
		{
			char ch =(char)r;//literals does not need typecasting but int variables does. It assumes that there gonna be dataloss as it does not rember the value stored in the r while checking the syntax of this statement;
			//char ch = 127;
			//char ch = 128; printing question mark which is 63
			//char ch = 3000; printing question mark which is 63
			//char ch = 65000; printing question mark which is 63
			str = str + ch;//String.valueOf() will be used internally

			if(r == 10) 
				break; 
			
		} */
		
		out.println("You entered this:/t"+ output);			
	}	
 }
