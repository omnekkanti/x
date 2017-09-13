import static java.lang.System.*;		
class Test3
{
	/** All non-printable unicode characters(null-0,space-32) will be printed as a space in java char datatype*/
	public static void main(String[] x)throws Exception
	{
		//int om = 2147483648; checks if number fits in the variable during compilation.not working as it cant fit it in error: integer too large
		//char c =(int)65536; error: incompatible types: possible lossy conversion from int to char
		char d = 65535;//why question mark
		out.println(d);
		char f = 128;//why question mark
		out.println(f);
		int xi = 65536;
		char e =(char) xi;// error: incompatible types: possible lossy conversion from int to char ,char e =xi . here it assumes that int variable comes with value greater than what can be stored in 2 bytes.ie if i store 65536, it will need the 65536 combination to represent it right. It does not remeber the variable value from prior statement. syntactical check is at statement level. 
		out.print("char e: "+ e);
		char g = 127;//why question mark
		out.println(g);
		byte ls[] = {65,10,97,10,48,10,127,49,10,0,50,32,100};
		String ms = new String(ls);// it prints  when it can tmake sense out of 7 bits it see in the each element. It works for ascii characters becoz first 7 bits in unicode are same as ascii bit values. 
		out.println("line feed as seperator\n"+ms);
		//byte os[] = {65,65,65,65,13,97,13,48,13,127,49,13,0,50,32,100};
		byte os[]={65,65,13,97,13,98};
		String ps = new String(os);
		out.println("carraige return as seperator\n"+ps);
		byte rs[] = {0,10,1,10,2,10,127,10,-128,10,5};
		String ts = new String(rs);
		out.println("line feed as seperator, trying to print control characters or non-printing characters");
		out.println(ts);
	}
}

