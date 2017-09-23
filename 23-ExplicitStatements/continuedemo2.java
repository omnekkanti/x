import static java.lang.System.*;

class ContinueDemo2{

	public static void main(String x[])
	{
	/*	int i=1,j;
		
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
		//out.println("\t"+k); k scope is only inwards*/
		//Generic<String,Double> ob6 = new Generic<>(89,26.45);// as it cant store 89 in string which is determined by type inference, it throws error
		/*error: incompatible types: cannot infer type arguments for Generic<>
                Generic<String,Double> ob6 = new Generic<>(89,26.45);
                                                        ^
    		reason: inference variable x has incompatible bounds
      		equality constraints: String
      		lower bounds: Integer
  		where x is a type-variable:
    		x extends Object declared in class Generic*/

		Generic<String,Double> ob7 = new Generic<>("",26.45);//It relies on variable ob7 to determine the adctual types for generic variables
		ob7 = new Generic<>("e",90.00);
		
		
		
	}
}