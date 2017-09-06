import static java.lang.System.*;		
class Test4
{
	public static void main(String[] x)throws Exception
	{
		int y=9;
		String s=null;// null is considered as intialization for reference types
		String u="";
		out.println(y);
		out.print(s);//empty string doesnot even take space while printing
		out.print(u);out.println(y);
		out.println("Enter Anything");
		while( (y=System.in.read())!=13)
		{
			char om = (char)y;
			u = u+om;
		}
		out.println("start");
		out.print(u);//when we hit "enter" crlf is inserted in the line and first character it reads is 13 and control doesnt execute a single statement in loop and prints whatever is in str, here it is empty string and it wont even take space
		out.println("end");
		out.println(System.getProperty("line.seperator"));//prints null
		String cx = "Your Input";// space is a character too in string
		out.println(cx.length());
		int dert = cx.charAt(9);
		out.println(dert);
		out.println("First letter: "+ cx.charAt(0));
		out.println("last letter: "+ cx.charAt(9));
		out.println("Your Input");
		for(int i = 0; i < u.length(); i++)
		{
			out.println((int)u.charAt(i) + " " + u.charAt(i));
                }
		out.println("end");
	}
}