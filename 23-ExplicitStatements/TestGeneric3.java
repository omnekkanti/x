import static java.lang.System.*;

class TestGeneric3{

	public static void main(String x[])
	{
//constructor is active
		//Generic om3 = new Generic();
 		/*error: constructor Generic in class Generic<x,y> cannot be applied to given types;
                Generic om3 = new Generic();
                              ^
 		required: Object,Object
  		found: no arguments
 		reason: actual and formal argument lists differ in length*/
		Generic om3 = new Generic("ORCL",32.07);//called as unchecked constructor call becoz types are not specified through generics
		/*warning: [unchecked] unchecked call to Generic(x,y) as a member of the raw type Generic
                Generic om3 = new Generic("ORCL",32.07);
                              ^*/
		out.println(om3.om);
		out.println(om3.prakash);
		out.println(om3.om.getClass().getName()); //java.lang.String
		out.println(om3.prakash.getClass().getName()); //java.lang.Double

//Generic Arrays:
		out.println("Generic Arrays case:1");
		Generic[] ui = new Generic[10];// can store different objects(meaning with attributes of different types) like shown below
		ui[0] = new Generic<>("String",23);
		ui[1] = new Generic<>(23.45,23);
		ui[2] = new Generic<String,String>("String","Full");
		ui[3] = new Generic<Double,Boolean>(23.45,true);
		out.println(ui[0].om.getClass().getName());
		out.println(ui[0].prakash.getClass().getName());
		out.println(ui[1].om.getClass().getName());
		out.println(ui[1].prakash.getClass().getName());
		out.println(ui[2].om.getClass().getName());
		out.println(ui[2].prakash.getClass().getName());
		out.println(ui[3].om.getClass().getName());
		out.println(ui[3].prakash.getClass().getName());
		
		out.println("Generic Arrays case:2");
		Generic<String,Double>[] oi = new Generic[10];
		oi[0] = new Generic<>("String",23.45);//has to be string,double
		oi[1] = new Generic<>("",23.45);//has to be string, double
		out.println(oi[0].om.getClass().getName());
		out.println(oi[0].prakash.getClass().getName());
		out.println(oi[1].om.getClass().getName());
		out.println(oi[1].prakash.getClass().getName());
		//No-NO's
	/*	Generic<String,String> pi = new Generic<>[7];
		error: cannot create array with '<>'
                Generic<String,String> pi = new Generic<>[7];
                                                       ^     */
	/*	Generic<String,String> zi = new Generic<String,String>[7];
		error: generic array creation
                Generic<String,String> zi = new Generic<String,String>[7];
                                            ^ */
		Generic ti = new Generic<String,String>[7];
 	}

}