import static java.lang.System.*;

class InputStream1
{
	/** All non-printable unicode characters(null-0,space-32) will be printed as a space in java char datatype*/
	public static void main(String[] x)throws Exception
	{
		out.println("Enter Anything");
		int r;//dont have to intialize r as it is assigned something in the code
		//out.println(r); it does not work becoz im trying to use it without initializing
		String str;
		//out.println(str); https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		while((r = in.read()) >= 0) 
		{
			char ch =(char)r;//literals does not need typecasting but int variables does. It assumes that there gonna be dataloss as it does not rember the value stored in the r while checking the syntax of this statement;
			//char ch = 127;
			//char ch = 128; printing question mark which is 63
			//char ch = 3000; printing question mark which is 63
			//char ch = 65000; printing question mark which is 63
			str = str + ch;//String.valueOf() will be used internally

			if(r == 10) 
				break; 
			
		} 
		
		out.println(str);//when we hit "enter" crlf is inserted in the line and first character it reads is 13 and control doesnt execute a single statement in loop and prints whatever is in str, here it is not intialized so it throws error

		for(int i = 0; i < str.length(); i++)
		{
			out.println((int)str.charAt(i) + " " + str.charAt(i));
                }
		out.println("end");
		out.println(System.getProperty("line.seperator"));
		/*char x16 = 0;//null
		out.print("0:\t");
		out.println(x16);
		char x18 = 20;//
		out.print("20:\t");
		out.println(x18);
		char x17 = 32;//space
		out.print("32:\t");
		out.println(x17);			
		char x12 = 127;//delete
		out.print("127:\t");
		out.println(x12);
		char x13 = 128;//euro
		out.print("128:\t");
		out.println(x13);
		char x14 = 3000;
		out.print("3000:\t");
		out.println(x14);
		char x15 = 65000;
		out.print("65000:\t");
		out.println(x15);

		byte ls[] = {65,10,97,10,48,10,127,49,32,50};
		String ms = new String(ls);// it prints  when it can tmake sense out of 7 bits it see in the each element. It works for ascii characters becoz first 7 bits in unicode are same as ascii bit values. 
		out.println("line feed as seperator\n"+ms);
		byte os[] = {65,13,97,13,48,13,127,49,32,50};
		String ps = new String(ls);
		out.println("carraige return as seperator\n"+ps);
		byte rs[] = {0,13,1,13,2,13,127,13,-128,13,4,13,5};
		String ts = new String(rs);
		out.println("carraige return as seperator, trying to print control characters or non-printing characters\n"+ts);
		out.println(ts);*/
	}
}