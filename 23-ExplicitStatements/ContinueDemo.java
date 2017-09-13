import static java.lang.System.*;


class ContinueDemo
 {
	public static boolean contains(int num)
    	{
		int x[] = {1,2,3,4,5,6,7,8,9,10};
       		boolean b = false;
       		for (int i=0; i<x.length;i++)
       		{
           		if (x[i]==num)
           		{
               		b= true;
			break;
               		//return b; accepting return only at first level
			}
           	}
		return b;
       	}
   
	public static void main(String[] args)throws Exception
 	{  
		out.println("calling static method contains");
		out.println(contains(6));
		out.println("static method called already");

		int x[]={1,2,3,4,5,6,7,8,9,10};

		for (int i=0; i<x.length; i++)
		{
			if(x[i]%3==0)
			continue;
			out.println("Number at index: "+i+"=>"+x[i]+" is not divisible by 3");
		}

		int[] y = new int[8];//all the spots are filled with default values
		
		for (int i=0; i<y.length; i++)
		{
			out.println("Number at index: "+i+"=>"+y[i]);
		}
		
		double[] z = new double[8];
		
		for (int i=0; i<z.length; i++)
		{
			out.println("Number at index: "+i+"=>"+z[i]);
		}
		
		boolean[] m = new boolean[8];
		
		for (int i=0; i<m.length; i++)
		{
			out.println("Number at index: "+i+"=>"+m[i]);
		}
		
	}
 }

 
 