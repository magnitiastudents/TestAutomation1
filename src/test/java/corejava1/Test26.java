package corejava1;
public class Test26
{
		//propeties
		public int rollno;
		public String name;
		public String college ="magnitia";
		//Constructor method
		public Test26(int x,String y) 
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
