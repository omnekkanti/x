import static java.lang.System.*;


class Test
 {
	public static void main(String[] args)throws Exception
 	{ 
		out.println("Start of Main");
		java.util.Scanner s = new java.util.Scanner(in);
		int [] c = {1,2};
    		out.println(c.length);
		int [] x = {1,2,3,4,5,6,7,8,9,10};
		int looking = s.nextInt();
		
		for(int i=0; i<x.length;i++)
		{
			if(x[i]==looking)
			{
				out.println("found the number at index: " + i);
				break;//unlabeled break is for loops and switch statement. it breaks from inner loop
			}
			else if(i==x.length-1) {//space is needed between else and if. otherwise it throws error
			    out.println("number not found in the array"); }
		}

		out.println("End of Main");
	  }
 }