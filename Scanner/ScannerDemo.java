import static java.lang.System.*;
//import java.io.*;for streams
import java.util.*;//for scanner class

class ScannerDemo 
 {
	public static void main(String[] args)throws Exception
 	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		/*out.println("Enter input");
		out.println("Your input token1: "+ s.next());
		out.println("Your input token2: "+ s.next());
		out.println("Enter Your Student id:");	
		a= s.nextInt();
		out.println("Your Student id is: "+a);*/
		out.println("Enter value for a: ");
		a= s.nextInt();	
		out.println("Enter value for b: ");
		b= s.nextInt();
		c= a+b;
		out.println("Value of c: "+c);		
	}
 }