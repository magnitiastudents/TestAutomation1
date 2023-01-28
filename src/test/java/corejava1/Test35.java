package corejava1;
import static corejava1.Test33.*;

public class Test35
{	
	public static void main(String[] args) {
		//calling non-static method by using object of that class
		Test33 obj =new Test33();
		obj.method1();
		//calling static method by using static import statement
		method2();	
	}
}
