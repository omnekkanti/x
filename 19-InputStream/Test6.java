		
import static java.lang.System.*;		

class Test6
{
	public static void main(String[] x)throws Exception
	{

		char c = 65535;
		out.println(c);
		char d = 13;
		out.print("printing cr");
		out.print(d);//returns the statement to the begining of line and overides the text
		out.println("printed cr");
		int rem = 65569;
		char dur = (char)rem;//cuts off extra bits and calualtes the decimal, stotes the corresponding value
		out.println("printing 65539 thru int datatype:"+dur);
		char cer = (char)65569;//cycles thru the range from the begining after 65535
		out.println("printing 65539 thru char datatype:"+cer);
		int pur = 5242913;
		char bur =(char)pur;//within 0 to 65535 for value does not need an explicit typecast even it is of bigger datatype. when the value is more, it uses more than 2 bytes to store number and char explicit type cast cuts off the extrabits and covert it into char.
		out.print(bur);
	
	}
}