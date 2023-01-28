package corejava1;

public class Test30 {
	public int count=0; //object level
	public Test30() {
		count++; // incrementing
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		//create objects
		Test30 obj= new Test30();
		Test30 obj1= new Test30();
		Test30 obj2= new Test30();
	}
}
