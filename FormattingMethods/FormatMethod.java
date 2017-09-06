import static java.lang.System.*;

class FormatMethod{

//String[] x; works fine
//String[] x = new String[3];

	public static void main(String[] x)
	{
		int a =10;
		int b =56;
		int c =9834567;
		double d = 10.8987645678;
		float pi = 3.142435790f;
		out.printf("%9d%n",c);
		out.printf("%09d%n",c);
		out.printf("%,09d%n",c);
		//out.printf("%9,d%n",c);comma should come before number
		out.printf("%,+09d%n",c);//there should be number before d
		out.printf("%,09d%n",c);
		out.printf("%+,09d%n",c);//order between + and comma doesnt matter
		out.printf("%,09f%n",pi);// comma does not make sense with floating values
		out.println(", is not possible");
		out.printf("%-9f%n",pi);//negative sign is left justified and positive sign is for the signs
		out.println("left justified");
		out.printf("%+,14d%n",c);
		out.printf("%+,-14d%n",c);
		//out.printf("%+,-014d%n",c);padding with zeros doesnt work with left justification
		out.printf("%+,-14d\n",c);
		out.println("everything mixed");	
		out.printf("%+010f%n",pi);
		out.println("with padding");
		out.printf("%+10.3f%n",pi);
		out.println("with 3 digits after decimal");
		out.printf("%+.3f%n",pi);
		out.println("with 3 digits after decimal and no limits on the number of characters");
		out.printf("%9f%n",pi);//string will have empty spaces in the empty spots. if pi has no digits, it will fill it up with spaces
		out.println("not left justified");
		out.printf("%d+%d=%d%n",a,b,c);
		out.println("om");
		out.printf("%d+%d=%d%n",a,b,(a+b));
		out.println("om");
		out.printf("%d*%d=%d%n",a,b,(a*b));
		out.println("om");
		out.printf("%d+%d=%d%n",a,b,(a+b));
		out.println("om");
		/*out.printf("%d+%d=%d%n",d,d,(d+d));
		out.println("om"); does not work as %d replaces only int*/
		out.printf("%f+%f=%f%n",d,d,(d+d));
		out.println("om");
		/*out.printf("%f+%f=%f%n",a,b,(a+b));
		out.println("om"); does not work as %f replaces only floating values inside string*/
	}
}