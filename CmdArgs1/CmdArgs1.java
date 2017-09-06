import java.lang.*;// default package dooes not have to be imported
import static java.lang.System.*;

class CmdArgs1
{
	public static void main(String args[])
	{
		if(args.length == 3)
		{
		 out.println(args[0]);
		 out.println(args[1]);	
		 out.println(args[2]);
		}
		out.println("Enter 3 arguments");
		out.println(System.in);// not printing InputStream class
		out.println(out);// object of child class of output stream, which is PrintStream 
		out.println(err);// object of child class of output stream, which is PrintStream 
		out.println(args.length);
		out.println("Command line arguements......\n------------");
		for(int i=0;i<args.length;i++)
		{
		out.println(args[i]);
		}
	}
}