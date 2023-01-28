package corejava1;
public class Test19 {

	public int x;
	public float y;
	public char z;
	public boolean w;
	public String s;
	
	public Test19(int a)
	{
		x=a;
		z='Q';
		s="kalam";
	}
	
	public Test19(String a)
	{
		x=20;
		z='Q';
		s=a;
	}
	
	public Test19(int a , String b)
	{
		x=a;
		z='Q';
		s=b;
	}
	
	public Test19(String a , int b)
	{
		x=b;
		z='Q';
		s=a;
	}
}
