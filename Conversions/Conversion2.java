import static java.lang.System.*;

class Conversion2
{
	public static void main(String v[])
	{
		//Widening Primitive Conversion. It is a java term for implicit type casting. whehn storing a smaller datatype in bigger datatype it works fine
		byte b = 78;
		short s = b;
		out.println(s);
		char c = 97;
		char d = ' ';
		char e = '0';
		int i = c;// decimal value of the character is stored i guess
		int i2 = d;// corresponding decimal value for the character is stored.
		int i3 = e;// corresponding decimal value for 0 is 48
		out.println(i);	
		out.println(i2);
		out.println(i3);			
		//Narrrowing Primitive conversion. It is a java term for explicit type casting. It is provided to store the bigger data types into smaller datatypes. But, it may cause data loss, it is still provided as a feature becoz sometimes the data originally might be of small data type. Ex: b is originally byte stored in short, we can store it back into byte type using explicit type casting.
		byte b2 = (byte)s;//short bit representation is converted into  byte representation before assigning it.
		out.println(b2);
		short s2 = 128;
		short s3 = 129;
		short s4 = 130;
		byte b3 = (byte)s2;
		byte b4 = (byte)s3;
		byte b5 = (byte)s4;
		out.println(b3);//printed as -128. It cycles throughs numbers 
		out.println(b4);//printed as -127. It cycles through byte range when we give a number out of scope 
		out.println(b5);//printed as -126
		/*int i4 =  2147483648; doesn't cycle through like with byte. throws an error
		out.println(i4);*/
		//Widening and narrowing primitive conversion (byte to char)
		byte b6 = 127;
		char f = (char)b6;// proof-char typecasting that b6 is in bigger dataype.
		out.println(f);
				
	}
}