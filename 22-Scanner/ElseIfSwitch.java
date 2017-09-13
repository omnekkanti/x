import static java.lang.System.*;
//import java.io.*;for streams
import java.util.*;//for scanner class

class ScannerDemo2
 {
	public static void main(String[] args)throws Exception
 	{ 
		Scanner s = new Scanner(System.in);
		out.println("enter option(1 to 3)");
		out.println("1.green");
		out.println("2.yellow");
		out.println("3.red");
		int option = s.nextInt();
		if(option==1)
		{
			out.println("go");
		}
		else if(option==2)
		{
			out.println("be prepared to stop");
		}
		else if(option==3)
		{
			out.println("be prepared to stop");
		}
		else{ out.println("wrong input");}
		
	 }
 }

class ScannerDemo3
 {
	public static void main(String[] args)throws Exception
 	{ 
		Scanner s = new Scanner(System.in);
		out.println("enter option(1 to 3)");
		out.println("1.green");
		out.println("2.yellow");
		out.println("3.red");
		int option = s.nextInt();
		if(option==1)
		{
			out.println("go");
		}
		if(option==2)// executes every statementt even if condition is met. we use it when conditions are not mutually exclusive
		{
			out.println("be prepared to stop");
		}
		if(option==3)
		{
			out.println("be prepared to stop");
		}
		if(option>3){ out.println("wrong input");}
		
	 }
 }

class ScannerDemo4
 {
	public static void main(String[] args)throws Exception
 	{ 
		Scanner s = new Scanner(System.in);
		out.println("enter option(1 to 3)");
		out.println("1.green");
		out.println("2.yellow");
		out.println("3.red");
		int option = s.nextInt();//does not read space as it is a delimiter pattern. ignores the space before token even if you push it to next line using newline character.
		switch(option)//cursor jumps depending on situation and executes all cases if there is no break statement
		
		{	
			case 1:
			{
			out.println("go");
			break;// explicit control or unconditional statements.
			}//braces for case block are optional.braces does not retain the execution to block for case
		
			case 2:
			{
		// executes every statement from here even if condition is not met. we use it when conditions are not mutually exclusive
			out.println("be prepared to stop");
			break;// braces does not retain the execution to block for case
			}
		
			case 3:
			{
			out.println("stop");
			break;// braces does not retain the execution to block for case
			}
		
			default: { out.println("wrong input");}//runs when option does not match any case
		}
		
	 }
 }