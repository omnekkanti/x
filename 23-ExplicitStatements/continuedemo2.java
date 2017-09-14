import static java.lang.System.*;

class ContinueDemo2{

	public static void main(String x[])
	{
		int i=1,j;
		
		loop1: while (i<=3)
		{
			int k=0;
			out.println(i+": ");
			loop2: for(j=1;j<=5;j++)//j does not have to be a variable local to for loop
			{
				out.println("\t"+j);
				out.println("\t"+k);
				if(j==3)
				{
					i++;
					continue loop1;
				}
			}
			i++;
		}
		//out.println("\t"+k); k scope is only inwards
	}
}