package corejava1;

public class Test31 {
	public static int count=0; //object level
	public Test31() {
		count++; // incrementing
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		//create objects
		Test31 obj= new Test31();
		Test31 obj1= new Test31();
		Test31 obj2= new Test31();
	}
}
