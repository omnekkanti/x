import static java.lang.System.*;
import java.io.*;
import static java.lang.Integer.*;
import static java.lang.Float.*;

class Bf2 
{
	public static void main(String ti[]) throws Exception
	{
	
	BufferedReader x = new BufferedReader(new InputStreamReader(in));// creates a buffering character-input stream with default size
	out.println("Enter int values");
	int a = parseInt(x.readLine());// buffers all of the input from the source
	int b = parseInt(x.readLine());// reads data from the buffer now 
	int c = a+b;
	out.println("Sum of Entered int values: "+c);
	out.println("Enter Float values");
	float f = parseFloat(x.readLine());
	float g = parseFloat(x.readLine());
	float h = f+g;
	out.println("Sum of Entered float values: "+h);
	}
}