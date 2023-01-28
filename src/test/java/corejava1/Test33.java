package corejava1;

public class Test33
{
	//properties (or)data members
	public int x;		//non-static
	public static int y=20; //static with initialization
	//constructor to initialize non-static properties
	public Test33()
	{
		x=10;
	}
	//general methods
	public void method1() // non-static to access both static and non-static properties
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void method2() // static method to access static properties only
	{
		//System.out.println(x);
		System.out.println(y);
	}	
}
