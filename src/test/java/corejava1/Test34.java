package corejava1;
public class Test34
{	
	public static void main(String[] args) {
		//calling non-static method by using object of that class
		Test33 obj =new Test33();
		obj.method1();
		//calling static method by using corresponding class name
		//obj.method2();
		Test33.method2();
		
		
	}
}
