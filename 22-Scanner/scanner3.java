import static java.lang.System.*;
//import java.io.*;for streams
import java.util.*;//for scanner class

class Scanner3
 {
	public static void main(String[] args)throws Exception
 	{
		float f1 = 10f;
		float f2 = 10f/100;
		float f3 = 10/20f;
		out.println(f1); 
		out.println(f2);
		out.println(f3);
		Scanner s = new Scanner(System.in);
		float sales, target, bonus;
		out.println("Enter sales");
		sales = s.nextFloat();
		out.println("Enter Target");
		target = s.nextFloat();
		if (sales>=target)
		{
		out.println("performance is satisfactory");
		bonus = (sales-target)*10/100f;
		out.println("bonus: "+bonus);
		}
		else
		{
		out.println("performance is unsatisfactory");
		bonus=0f;
		out.println("bonus: "+bonus);
		}
	}
}
		