import static java.lang.System.*;

public class Conversions
{
	public static void main(String x[])
	{
	int a = 100;
	int b=a;// identity conversion, simply using the variable instead of actual value while creating a new variable
	String one = ""+a;// string conversion. Wrapper class's object is created and toString() method is called on all the primitive types for conversion and the string objects are directly added by creating a new string object. 
	out.println(one);
	String is = String.valueOf(100);//this is the method called inside out.println It acts like print() method on top of moving cursor to next line. print method is the method which actually calls the String.valueOf on the arguement and gets the string representation from it and convert it into bytes according to platforms default character encoding and prints them by accessing byte by byte.
	out.println(is);//here print(String arg) method is called which just converts the characters of string into bytes according to platforms default character encoding and prints them by acessing byte by byte.
	String bs = String.valueOf(100.50);// Double.toString() method converts it into string
	out.println(bs);// each character in string is converted into bytes according to default character encoding and printed
	String cs = String.valueOf(true);// simply condition is checked and literal is returned (return b ? "true" : "false";)
	out.println(cs);
	int ds[] = {10,20,30,40,50};
	out.println(ds);//just prints the address [I@15db9742 stored
	String es[] = {"","","","",""};
	out.println(es);//just prints the address [Ljava.lang.String;@6d06d69c stored
	int fs[] = {10,20,30,40,50};
	String gs = new String(fs,1,1);
	out.println(gs);
	byte hs[] = {10,20,30,40,50};
	String ks = String.valueOf(hs);//toString() is called as hs is an object reference
	out.println(ks);
	String js = new String(hs);
	out.println(js);
	byte ls[] = {65,10,97,10,48,10,127,49,32,50};
	String ms = new String(ls);// it prints  when it can tmake sense out of 7 bits it see in the each element. It works for ascii characters becoz first 7 bits in unicode are same as ascii bit values. 
	out.println("line feed as seperator\n"+ms);
	byte os[] = {65,13,97,13,48,13,127,49,32,50};
	String ps = new String(ls);
	out.println("carraige return as seperator\n"+ps);
	byte rs[] = {0,13,1,13,2,13,127,13,-128,13,4,13,5};
	String ts = new String(rs);
	out.println("carraige return as seperator, trying to print control characters or non-printing characters\n"+ts);
	}
}