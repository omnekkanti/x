import static java.lang.System.*;		

class DataInputStream1
{
	/** All non-printable unicode characters(null-0,space-32) will be printed as a space in java char datatype*/
	public static void main(String[] x)throws Exception
	{
		String si=null;// cant be used with out initialization. assigning null is considered as intialiazation.empty string does not take space
		out.println(si);
		char top = 65535;
		out.println("char@top: "+top);
		char bur =(char)1140916223;//within 0 to 65535 for value does not need an explicit typecast even it is of bigger datatype.
		out.println("char@top: "+bur);
		char c = (char)65569; // error: incompatible types: possible lossy conversion from int to char
     		System.out.print("om");System.out.print(c);System.out.println("om");
		out.println("System");
		int xi = 65569;//its looping through vhar values after 65535
		char e =(char) xi;
		System.out.print("om");out.print(e);System.out.print("om");
	}
}

/*
00000000000000001111111111111111 : 65535
00000000000000010000000000000000 : 65536
01000100000000001111111111111111 : 1140916223
*/