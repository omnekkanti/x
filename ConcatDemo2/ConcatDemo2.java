import  static java.lang.System.*;

class ConcatDemo2
{
	public static void main(String args[])
	{
		String name = "om";
		int n = 48;
		String x = "new string\f"+name+"value is\r" + n;
		out.println("newer value:\t"+ x);
		System.out.println("newer value:\t"+ n);
		if(args.length==2)
		{
			int a,b;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			out.println(a+b);
		}
		out.println("om\nprakash\nnekkanti");
		out.println("om 05/17/1988");
		out.println("om 05\\17\\1988");
		out.println();
		out.print(true);//there must be an arguement
	}
}