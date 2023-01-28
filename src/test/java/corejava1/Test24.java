package corejava1;
public class Test24
{
		int x; //propeties
		public Test24() //Constructor method
		{
			x=10;
		}
		public void display() // general methods
		{
			System.out.println(x);
		}
	public static void main(String[] args)
	{
		Test24 obj= new Test24();
		obj.display();
	}
}
