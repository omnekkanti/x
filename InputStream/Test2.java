import static java.lang.System.*;		
class Test2
{
	/** unicode characters(null-0,space-32) will be printed as a space in java char datatype, nonprinting will have questionmark in box and other characters are printed as questionmark*/
	public static void main(String[] x)throws Exception
	{
		char x16 = 0;//null
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
		char x13 =(char)128;		 //'\u20ac';euro
		out.print("128:\t");
		out.println(x13);
		char x14 = 3000;
		out.print("3000:\t");
		out.println(x14);
		char x15 = 65000;
		out.print("65000:\t");
		out.println(x15);
	}
}