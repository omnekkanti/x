//import java.lang.*;
import static java.lang.System.*;

class FirstProgram
{
	public static void main(String args[])
	{
	out.println("Welcome to java");
	out.println(args);
	/*out.println(args[0]);
	out.println(args[1]);
	out.println(args[2]);*/
	//java creates a single dimensional array of size zero if we dont pass in any arguements and args[0] puts us in out of boundary in the memory location
	String[] x;
	//out.println(x); not working as nothing is stored in reference variable.
	String[] y = new String[3];
	// String y = new String[0] will throw error at y[0]
	out.println(y);
	out.println(y[0]);
	out.println(y[1]);
	out.println(y[2]);
	//out.println(y[3]);array out of bounds exception as that spot does not exist in memory
	}
}
		