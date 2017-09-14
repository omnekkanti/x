import static java.lang.System.*;
//Program is not a class with main method. It is a file with supporting classes in it. that is why it is okay to have multiple classes in the file with main methods
class First{
public static void main(String args[])
	{
		out.println("First main method");
	}
}

class Second{
	public static void main(String args[])
	{
		out.println("Second main method");
	}
}

class Third{
	public static void main(String args[])
	{
		out.println("Third main method");
		String[] x = new String[0];// no memory allocation after the referenced location
		String y[]=null;
		out.println(y);
		String z[];
		//out.println(z);even null is a value to print , is z is not storing anything there will be an error
		First.main(x);
		Second.main(x);
	}
}