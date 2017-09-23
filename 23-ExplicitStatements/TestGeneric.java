import static java.lang.System.*;

class TestGeneric{

	public static void main(String x[])
	{
		Generic t1 = new Generic<>(67,87);
 		/*warning: [rawtypes] found raw type: Generic
                Generic t1 = new Generic<>(67,87);
                ^
 		missing type arguments for generic class Generic<x,y>
  		where x,y are type-variables:
    		x extends Object declared in class Generic
    		y extends Object declared in class Generic*/
		t1 = new Generic<>(45.5,45.5);//when we dont specify anything through type inference, explicit cast the types are infered deppending on the values in the constructor
		out.println(t1.om);
		out.println(t1.om.getClass().getName());//java.lang.Double ani vastundi output
		out.println(t1.prakash);
		out.println(t1.prakash.getClass().getName());//java.lang.Double ani vastundi output
		Generic<Number,Object> ob2 = new Generic<>(90,26.45);  
		ob2 = new Generic<>(90.89,true);//anything of child type can be stored. comes from inheritence
		out.println(ob2.om);
		out.println(ob2.om.getClass().getName());
		out.println(ob2.prakash);
		out.println(ob2.prakash.getClass().getName());
		/*Generic<Number,Object> ob3 = new Generic<Integer,Double>(90,26.45);
		error: incompatible types: Generic<Integer,Double> cannot be converted to Generic<Number,Object>
                Generic<Number,Object> ob3 = new Generic<Integer,Double>(90,26.45);
                                             ^
1 error*/ 
		// it seems like explicit typing takes precedence over type inference
	      /*Generic <> om = new Generic<Integer,Double>(23,23.4);
		error: illegal start of type
                Generic <> om = new Generic<Integer,Double>(23,23.4);
                         ^
1 error*/ 
		//it expects the type immediately after first angle bracket.
		/*Generic<Number,Object> ob3 = new Generic<Integer,Double>(90.34,26.45);
		error: incompatible types: double cannot be converted to Integer
                Generic<Number,Object> ob3 = new Generic<Integer,Double>(90.34,26.45);
                                                                         ^
		Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error*/
		/*Generic<Number,Object> ob3 = new Generic<Integer,Double>((int)90.98,26.45);
		error: incompatible types: Generic<Integer,Double> cannot be converted to Generic<Number,Object>
                Generic<Number,Object> ob3 = new Generic<Integer,Double>((int)90.98,26.45);
                                             ^
1 error*/
		out.println("printing the plain version of generic class");
		Generic om2 = new Generic(43,35.6);// it infers the type from actual values when we dont do it using two methods(type inference & explicit typing)
		out.println(om2.om);
		out.println(om2.om.getClass().getName());// printed java.lang.Integer
		out.println(om2.prakash);
		out.println(om2.prakash.getClass().getName());// pinted java.lang.Double
		out.println("printing the plain version of generic class without arguements in constructor");
		Generic om3 = new Generic();
		out.println(om3.om);
		out.println(om3.om.getClass().getName());// printed java.lang.Integer
		out.println(om3.prakash);
		out.println(om3.prakash.getClass().getName());// pinted java.lang.Double
	}
}