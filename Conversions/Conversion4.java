import static java.lang.System.*;

class Conversion4
{
	public static void main(String v[])
	{
		//String Conversion: Coverting other data types into String is called String Conversion. It is done by String.valueOf()  static methods in string class. it is called in out.println too
	int i1 =100;
	String s = ""+i1;//Integer.toString() is called to convert it internally into a string
	String s1 = String.valueOf(true);
	String s2 = String.valueOf('c');//uses String Constructor with char as parameter internally
	char c[] = {'o','m'};	
	String s3 = String.valueOf(c);//internally uses String class constructor to create a string out of character array
	String s4 = new String(c);
	out.println("s:\t"+s);
	out.println("s1:\t"+s1);
	out.println("s2:\t"+s2);
	out.println("s3:\t"+s3);
	out.println("s4:\t"+s4);
	}
}