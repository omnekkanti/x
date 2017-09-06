import static java.lang.System.*;

class One
{
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bo;
	String str;
	/** Constructor with no body whether it is written by us or written by compiler it initializes the fields to their defaults*/
	One(){}// can't have non-acess modifiers like static final abstract, return type and should use the class name and could use acess modifiers
	public void display()
	{
		out.println("byte:"+b);
		out.println("short:"+s);
		out.println("int:"+i);
		out.println("long:"+l);
		out.println("float:"+f);
		out.println("double:"+d);
		out.print("char:"+c);
		out.println("boolean:"+bo);
		out.println("string:"+str);
	}
}

class Test
{
	public static void main(String[] x)
	{
		One o1 = new One();
		o1.display();
	}
}