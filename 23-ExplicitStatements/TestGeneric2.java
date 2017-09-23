import static java.lang.System.*;

class TestGeneric2{

	public static void main(String x[])
	{
		//Generic om2 = new Generic(43,35.6); it infers the type from actual values when we dont do it using two methods(type inference & explicit typing)
		// when constructor is not active, got the following error
		/*error: constructor Generic in class Generic<x,y> cannot be applied to given types;
                Generic om2 = new Generic(43,35.6);
                              ^
  required: no arguments
  found: int,double
  reason: actual and formal argument lists differ in length*/
		// when constructor is active, got the following warning
		/*warning: [unchecked] unchecked call to Generic(x,y) constructor as a member of the raw type Generic
                Generic om2 = new Generic(43,35.6);
                              ^*/
		Generic om3 = new Generic();// Generic class now has only default constructor
		out.println(om3.om);// printed null when there was only default constructor in Generic class. as refrence types default to null
		out.println(om3.prakash);// printed null when there was only default constructor in Generic class. as refrence types default to null during object ceration
/*14*/		out.println(om3.om.getClass().getName());// printed java.lang.Integer. when constructor is active. other wise getting null pointer exception when there was only default constructor
		/*Exception in thread "main" java.lang.NullPointerException
        	at TestGeneric2.main(TestGeneric2.java:14)*/
		out.println(om3.prakash.getClass().getName());// pinted java.lang.Double. when constructor is active.other wise getting null pointer exception when there was only default constructor
	}
}