import static java.lang.System.*; //  when we write java.lang.System.* without static, our expectaion is it would import both instance and static members and it would allow out.println usage but it is similar to java.lang.System in the sense it does not allow out.println usage. it makes sense becoz it is like saying i'll use the class by saying i am goona use all the members of the class.

class P{}// we can write class without any memebers inside it
class Q extends P{}
class R extends Q{
void display(){out.println("hi");}// we can write class without any fields in it.
}
class Operator
{
	public static void main(String[] x)
	{	
		float a = 10;
		float b = 20;
		out.println(a%b); // it is always an integer division i.e, only integers as quotient
		P o1 = new P();
		out.println(o1);
		Q o2 = new Q();
		R o3 = new R();
		if(o3 instanceof Q)// object means properties simply. as o3 has properties of class Q thru inheritance it is true
		out.println("Yes o3 is an instance of Q");
		else {
			out.println("No o3 is not an instance of Q");		
		     }
		if(o3 instanceof P)// it checks basically if the o3 has all the properties in p
		out.println("Yes o3 is an instance of P");
		else {
			out.println("No o3 is not an instance of P");		
		     }
		if(o2 instanceof P)
		out.println("Yes o2 is an instance of P");
		else {
			out.println("No o2 is not an instance of P");		
		     }
		if(o2 instanceof R)
		out.println("Yes o2 is an instance of R");
		else {
			out.println("No o2 is not an instance of R");// as o2 doesnot have all the properties of R		
		     }
		if(o1 instanceof Q)
		out.println("Yes o1 is an instance of Q");
		else {
			out.println("No o1 is not an instance of Q");// as o1 doesnot have all the properties of Q		
		     }
		if(o1 instanceof R)
		out.println("Yes o1 is an instance of R");
		else {
			out.println("No o1 is not an instance of R");// as o1 doesnot have all the properties of R		
		     }
		
		R object23 = null;
		//object23.display(); compiles fine but throws error while execution because method should be called on some address even if it is pointing to location with nothing in heap

	/*	Q object22;
		out.println(object22);reference variable must have something to print er: not intialized */
		Q object22 = null;
		out.println(object22);//it is fine with printing null and having null stored means initialized.
	}
}