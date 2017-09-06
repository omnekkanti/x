import static java.lang.System.*;

public class Test

{
	static int p1 ;
	public static void main(String[] y)
	{
		final int localvar;
		int x = 0b1111111;
		int as = 0x7F;
		int z = 0177;
		byte [] tyu = new byte[3];
		out.println(tyu);	
		out.println(x);
		out.println(as);
		out.println(z);
		char c = 0x61;//coefficients of powers of 16 are allowed too in addition to 4 hex digits that represents the underlying 16 bit representation
		//char d = \\u;not working illegal unicode escape
		char p = '?';
		char q = '@';
		char r = '!';
		double f = 22.34d;
		double g = 33.33D;
		float h = 22.23f;
		float j = 22.23F;
		float k = 12.345e3f;
		localvar=34;
		out.println(c); 
		//out.println(d);
		out.println(p); 
		out.println(q);
		out.println(r);
		out.println(f); 
		out.println(g);
		out.println(h);
		out.println(j); 
		out.println(k);
		out.println("static property:"+ p1);// it is like initializing one property for all objects before hand. default will be assigned during class definition loading
		out.println(localvar);
		/* \u0000 is not allowed in here*/
	}
}