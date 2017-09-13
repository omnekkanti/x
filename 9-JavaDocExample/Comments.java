// Doesnt have to compile to generate documentation using javadoc command. Also it documents only public and protected classes without any documentation comments.

import static java.lang.System.*;
/** Class One has 2 properties and one method called display*/
class One
{
	/**properties are of integre type*/
	int a,b;
	/**display method displays the state of the object*/
	public void display()
	{
		out.println("one class display");
		out.println("a:\t"+a);
		out.println("b:\t"+b);
	}
}

/** Class Comments has main method()*/
class Comments
{
	/**This is the starting point of the program.It creates an object of class One and prints it*/
	public static void main(String[] x)
	{
		One oo = new One();
		out.println(oo);
	}
}