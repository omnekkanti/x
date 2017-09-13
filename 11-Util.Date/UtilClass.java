import static java.lang.System.*;
import java.util.*;

class UtilClass{
	public static void main(String[] x)
	{
		int a =100;
		double r = 150;
		Date d = new Date();// Date class is in util package
		//printf(d);cant print objects
		out.printf(""+d);
		out.printf("%n%tD%n",d);
		out.printf("%tB/%td/%tY%n",d,d,d);//each converter needs to have its own source
		out.printf(""+100);
		//out.printf(100);wont work
		//out.printf(r); cant print primitives or objects. only striings are allowed
		
	}
}