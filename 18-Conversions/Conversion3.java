import static java.lang.System.*;// introduced in JDK 1.5

class Base{}

class Child extends Base{}


class Conversion3
{
	public static void main(String v[])
	{
//These names are given from the perspective of how many properties does object have with respective to reference variable type properties. Upcasting and downcasting are from the perspective of inheritance

//Widening Reference Conversion (upcasting): It is named like that becoz we are trying to store object with more properties in reference type with less properties and trying to widen it...
	Base b = new Base();
	Child c = new Child();
	Base b1 = c;//wideninf reference(upcasting)
	out.println(b1);
	
//Narrowing Reference Conversion (downcasting): It is named like that becoz we are trying to store object with less properties in reference type with more properties. 
	//Child c1 = (Child)b; generating error during run time as object is of type base. This feature is there to store child object referenced by base class variable. Compiler checks
	Child c1 = (Child)b1;// compiler does not remeber previous statements where child object is assigned to b1> it needs to be casted
	out.println(c1);

//Boxing Conversions: in JDK 1.5 AutoBoxing and Boxing were introduced
	float f = 10.56f;
	Float F = new Float(f);//Boxing
	out.println(F);
	float f1 = F.floatValue();//Un-Boxing
	out.println(f1);
	Float F2 = 10.57f;//auto-boxing
	out.println(F2);
	float f2 = F2;//auto-unboxing
	out.println(f2);
	char cat = 0x41;
	out.println(cat);
	char dog = '\u0041';//  we can use coefficients of 16 powers as hex digits 
	out.println(dog);
	char cat2 =(char)0x10001;// possible lossy conversion from int to char as number is int by default.Here as integer is not in between range 0 to 65535 it cant find corresponding unicode character and displays question mark as it is not in the character mapping table. Java supports only 65,536 cahracters.
	out.println(cat2);
	char cat3 = 567;// Here we did not use any typecasting even if it is a narrowing primitive conversion. They agve that feature with char data type as there is one character corresponding to each value in range 0 to 65535. But int(2^32=4294967296 COMBINATIONS/2 = 2147483648 =ve and -ve integers) range is -2147483648 to 2147483647
	out.println(cat3);
//java.lang.Number has methods byteValue(), shortValue(), intValue(), longValue(), floatValue(), doubleValue() and all the wrapper classes inherit them
	Integer i1 = new Integer(100);
	byte b23 = i1.byteValue();
	out.println(b23);
	short s1 = i1.shortValue();
	out.println(s1);
	int i2 = i1.intValue();
	out.println(i2);
	long l1 = i1.longValue();
	out.println(l1);
	float f23 = i1.floatValue();
	out.println(f23);
	double d1 = i1.doubleValue();
	out.println(d1);
	}
}	