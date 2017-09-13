import static java.lang.System.*;


class BreakDemo
 {
	public static void main(String[] args)throws Exception
 	{ 
		out.println("Start of Main");
		java.util.Scanner s = new java.util.Scanner(in);
		boolean b = s.nextBoolean();
		om:{
			out.println("Start of block om");
			prakash:{
					out.println("Start of block prakash");
					nekkanti:{
							out.println("start of block nekkanti");
							if(b)
							break prakash;//labeled break statement
					  	 }
					out.println("End of block prakash");
			         }
			out.println("End of block om");
		   }
		out.println("End of Main");
	  }
 }

/* unlabeled Break statements are for use only in loops & switch statements. if we try to use unlabeled break inside named block, it throws compiler error: break outside switch or loop. If we want to break out of the outter most for loop label it as name: for(int i=0,i<10,i++){} */ 

class BreakDemo3
 {
	public static void main(String[] args)throws Exception
 	{ 
		out.println("Start of Main");
		java.util.Scanner s = new java.util.Scanner(in);
		boolean b = s.nextBoolean();
		om:{
			out.println("Start of block om");
			prakash:{
					out.println("Start of block prakash");
					nekkanti:{
						    out.println("start of block nekkanti");
						    if(b)
						    break om;//unlabeled break statements can break the controlflow out of inner loop only.
					  	 }
					out.println("End of block prakash");
			         }
			out.println("End of block om");
		   }
		out.println("End of Main");
	  }
 }

class BreakUnlabeledDemo
 {
	public static void main(String[] args)throws Exception
 	{ 
		out.println("Start of Main");
		java.util.Scanner s = new java.util.Scanner(in);
		boolean b = s.nextBoolean();
		om:{
			out.println("Start of block om");
			prakash:{
					out.println("Start of block prakash");
					nekkanti:{
							out.println("start of block nekkanti");
							if(b)
							break nekkanti;//unlabeled break statement is only for use in switch and loops.
							out.println("end of block nekkanti");
					  	 }
					out.println("End of block prakash");
			         }
			out.println("End of block om");
		   }
		out.println("End of Main");
	  }
 }
