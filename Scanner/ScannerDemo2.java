import static java.lang.System.*;
//import java.io.*;for streams
import java.util.*;//for scanner class

class ScannerDemo2
 {
	public static void main(String[] args)throws Exception
 	{
		int eno;
		float salary;
		boolean ruManager;
		String name,name2, empty=null,empty2="";
		Scanner s = new Scanner(System.in);
		out.println("Enter Your Employee number: ");	
		eno = s.nextInt();//The next() and hasNext() methods and their primitive-type companion methods (such as nextInt() and hasNextInt()) first skip any input that matches the delimiter pattern, and then attempt to return the next token.
		out.println("Enter Your salary: ");	
		salary = s.nextFloat();// so the newline character is not an default delimiter(space) but reading stops there at \n and scanner goes to next input line
		out.print("Are you a manager:");	
		ruManager = s.nextBoolean();
		out.println("Enter Your name:");	
		/*name = s.next();//Finds and returns the next complete token from this scanner. A complete token is preceded and followed by input that matches the delimiter pattern*/
		name2 = s.nextLine();//reading everything after previous token including delimiter(space) until newline char
/* Advances this scanner past the current line and returns the input that was skipped. This method returns the rest of the current line, excluding any line separator at the end. The position is set to the beginning of the next line.
Since this method continues to search through the input looking for a line separator, it may buffer all of the input searching for the line to skip if no line separators are present.*/
		out.println("Employee Details: ");	
		out.println("Employee Number: " + eno);
		out.println("Employee Salary in dollars: " + salary);
		out.println("Manager: " + ruManager);
		//out.println("Employee name : "+ name);
		//out.println("Employee name2: "+ name2);
		out.print("Employee name2:"+ name2);//as nothing is there between last token and newline character, nothing is read empty string is returned by the method and it doesnt occupy space. also scanner moves to next line after that read
		out.print("What?");
		out.print(empty);//null is printed
		out.print(empty2);//does not occupy space empty string
		out.print("end!");
	}
}
		