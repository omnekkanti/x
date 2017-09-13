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
		long l = 200;
		long m = (byte)34;
		long n = (short)45;
		out.println(l);
		out.println(m);
		out.println(n);
		long p = 45l,q = 34L; //l & L are needed as jvm thinks of a number as a integer by default. in this case it is not a problem if we do not use l & L as long is bigger than int and implicit typecasting kicks in.
		float t=45.89f,v=34.67F;// f & F are needed as jvm thinks of a number with decimal portion as a double value by default
		double r = 23.98d;
		double s = 24.67D;
		float se = (float)34.567;//explicit is needed when a bigger datatype is being assigned to smaller datatype to acknowledge the data loss that occurs from loosing the part of the bit representation
		out.println(p);
		out.println(q);
		out.println(r);
		out.println(s);
		out.println(t);
		out.println(v);
		boolean fr = true;//only lowercase is accepted.if you use uppercase it looks for a variable named TRUE
		String fg = null;//only lowercase is accepted. if you use uppercase it looks for a variable which is constant
	}
}