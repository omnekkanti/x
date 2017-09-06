import static java.lang.System.*;

class One{}
interface Inf1{}
enum Colors{}
@interface MyAnn{}

class Main
{
	public static void main(String[] x)
	{
		One o1=null;
		Inf1 i1=null;
		Colors c=null;
		MyAnn ma=null;
		out.println(o1);
		out.println(i1);
		out.println(c);
		out.println(ma);
	}

}