package corejava1;
public class Test28
{
		//propeties
		public int rollno;
		public String name;
		public static String college ="magnitia"; // common memory to all objects
		//Constructor method
		public Test28(int x,String y) 
		{
			rollno=x;
			name=y;
		}
		// general methods
		public void display() 
		{
			System.out.println(rollno + " " + name + " "+college );
		}
}
