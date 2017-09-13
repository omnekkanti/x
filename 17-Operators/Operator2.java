import static java.lang.System.*;

class Operator2
{
	public static void main(String x[])
	{
		// Relational operators instanceof, !=, == . they return boolean and operate on variables
		int a = 112;
		int b = 122;
		out.println(a!= b);
		out.println(a == b);
		// conditional operators are &&, ||, ?:, !(logical complement)they operate on conditions
		int age =20;
		String desig1 = null;
		if (age>30 && desig1.equals("Programmer"));//short circuit behavior of logical operator
		out.println("Senior programmer");
		if (age<30||desig1.equals("Programmer"));// supposed to throw null pointer exception which means using null to point, which does not allow update on an object.
		out.println("Junior programmer");
		String desig2 = "Programmer";//auto boxing
		if(!desig2.equals("Admin"))
		out.println("Invalid User error: You are not an Admin");
		// Shortcut operators
		out.println(a++);// a value will be used as it is for the current purposes i.e in the statement. It could be assignment and incremented after usage in the statement
		out.println(++a);// a value will be increased in the statement before it could be assigned i.e used in the statement
		int p = 13;
		int q = 14;
		int r=p++;
		out.println(r);
		int s=++p;
		out.println(s);
		//bitwise operators exclusiveor(^), negation(~), leftshift(<<), rightshift(>>), zerofill rightshift(>>>) operators
		int first = 10;
		int second = 4;
		out.println("first:\t"+ first);
		out.println("second:\t"+ second);
		out.println("10&4:\t"+(first&second));
		out.println("10|4:\t"+(first|second));
		out.println("10^4:\t"+(first^second));// exclusive or bitwise
		out.println("~10:\t"+(~first));//1's compliment
		out.println("10<<2:\t"+(first<<2));// moves the digits 2 places to the left while keeping the sign bit untouched and the empty bits on the right are filled with value in the sign bit
		out.println("10>>2:\t"+(first>>2));// moves the digits 2 places to the right while keeping the sign bit untouched and the empty bits on the left are filled with value in the sign bit 
		out.println("10>>>2:\t"+(first>>>2));// irrespective of value in the sign bit, the first bit is filled with 0. that is why it is called zerofill operator and the operation is similar to rightshift operator
		//out.println("10<<<2:\t"+(first<<<2)); there is no such operator it reads until << and reads <2 as a number says wrong input type
		//Unary, Binary , Ternary OPerators
	}
}