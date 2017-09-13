import static java.lang.System.*;

class Test{

	public static void main(String x[])
	{
		String y = "";//doesnt even take space
		String z = null;//prints null as if it is a string.
		String q; //it is empty not null or emptystring or anyreference
		String r;
		r = z+y;//you cannot use it as a operand in a string statement if it has nothing stored in memory 
		out.print("start");
		//out.print(q);doesnt compile
		out.print(r);
		out.println("end");
		
		Object o = null;
		out.print("start");
		out.print(o);
		out.println("end");
		int i =23;
		String as ="[p,q,";
		String par = "\b]";	
		out.println(as+par);// "[p,q,\b]"
	}
}