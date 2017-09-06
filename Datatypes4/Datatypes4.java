import static java.lang.System.*;

class Om
{
	/** All non-printable unicode characters(null,space) will be printed as a space in java char datatype*/
	public static void main(String[] x)
	{
		char c = '\u0000'; // or '\u0000'-null & '\u0020'-space are printing the same space in java.
	        //   In java we can give unicode value in shorthand directly for char dataype.
		char ch1 = 97;//converts it into utf-16 bit representation & stores it.
		out.println(ch1);
		char ch2 = 'a';//calculates the utf-16 bit represenation & stores it.
		out.println(ch2);
		//char ch3 = (char)1100001; possible lossy conversion as integer of 4 bytes is being converted into char of 2 bytes
		char ch3 = 0b1100001;//binary will be converted into decimal and then its corresponding UTF-16 bit representation is fetched
		out.println(ch3);
		int x1 = 0b1100001;//binary will be converted into decimal and then it is assigned
		out.println("int:"+ x1);
		char ch4 = 0141; //octal will be converted into decimal and then its corresponding UTF-16 bit representation is assigned
		out.println(ch4);
		String d = "s";// 's' is not working becoz it returns a unicode value directly not the reference value 
		out.println("start of null character");
		out.print(c);
		out.println("end of null character");
		char x2 = 0x0020;
		out.println("start of space character"); 
		out.print(x2);
		out.println("end of space character");
		char x3 = 0x0000;// a non-printable character: null with decimal value 0
		out.println("start of non-printable character null"); 
		out.print(x3);
		out.println("end of non-printable character null");
		char x4 = 0x007F;// a non-printable character: delete with decimal value 127. we are indirectly specifying the unicode 16 bit character encoding 
		out.println("start of non-printable character delete"); 
		out.print(x4);
		out.println("end of non-printable character delete");
		//char x5 = '\u0000000000010000';// they did not allow it in java may be becoz they thought that it is prone to error
		/*char x6 = 0000H;// java language doesnt use this notation for hexadecimal number, it uses 0x prefix
		out.println("x6:"+x6);
		char x7 = 1100001B;// java language doesnt use this notation for binary number, it uses 0b prefix
		out.println("x7:"+x7);
		out.println("start of non-printable character space"); 
		out.print(x5);
		out.println("end of non-printable character space");*/
		//char x6 = 0x0000000000010000; not working
		//char x8 = 65537; possible lossy conversion from int to char
		char x9 = 65535;
		out.println("65535:\t"+x9);
		char x10 = 128;
		out.println("128:\t"+x10);
		char x11 = 3000;
		out.println("3000:\t"+x11);
		char x12 = 127;
		out.print("127:\t");
		out.println(x12);
		String s12 = ""+x12;
		out.println("127 concatenated with string:\t"+s12);
		String s13 = ""+x11;
		out.println("3000 concatenated with string:\t"+s13);
		/* prefix \\u(if you dont use \ infornt of backslash u it throws error) tells jvm that the following digits represent unicode and it could be in shorthand. single quotes tell the jvm to covert it into a utf-16 bit representation. in this case we are giving a short hand representation of utf-16 bit represntation using hexadecimal digits which in turn represent 4 binary digits. If we give decimal value or a binary number or octal number or hexadecimal number or a character using single quotes. ultimately utf-16 bit representaion will be stored in the memory for that variable */
	}
}