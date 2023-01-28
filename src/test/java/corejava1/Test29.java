package corejava1;

public class Test29 {
	public static void main(String[] args) {
		//create objects to class
		Test28 obj= new Test28(101, "ram");
		Test28 obj1= new Test28(102, "koti");
		Test28 obj2= new Test28(103, "raja");
		//display values before change
		obj.display();
		obj1.display();
		obj2.display();
		//chnage college value
		Test28.college="Google";
		//display values after change
		obj.display();
		obj1.display();
		obj2.display();
	}
}
