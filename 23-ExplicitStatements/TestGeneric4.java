import static java.lang.System.*;

class TestGeneric4<p,q>{

	public static void main(String x[])
	{
		Generic<p,q> om1 = new Generic<>("String",24);
		out.println(om1.om);
		out.println(om1.prakash);
		out.println(om1.om.getClass().getName());
		out.println(om1.prakash.getClass().getName());

		Generic<String, Integer> om2 = new Generic<>("om",224);
		//om2 = new Generic<>(22.4,"OM");
		om2 = new Generic<>("prakash",255);
		
		Generic om3 = new Generic<>("om", "prakash");
		om3 = new Generic<>(224,22.4);	
	}
}