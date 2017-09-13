import static java.lang.System.*;		

class Test5
{
	public static void main(String[] x)throws Exception
	{
		out.println("start");		
		int r;//local variable should be intialized before you use it in code
		while((r = in.read())>0)
		{
		char us = (char)r;
		//if(r!=10 )
		//{
		out.print("first marker");
		out.print(us);//Hitting enter insersts crlf together in windows. when in.read loads 13 from cr into r and prints it, cursor goes to the fromt and changes mode into overide when printing. It prints loads ten and then printing 10 puts the cursor in next line 
		out.println("second marker");
		//}
		if(r==10)
		break;
		}
		out.println("end");

	}
}