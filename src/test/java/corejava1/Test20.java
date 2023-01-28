package corejava1;
public class Test20 {
	public static void main(String[] args) {
		// Error default constructor won't come directly due to existance  of our constructors
		//Test19 obj = new Test19(); 
		
		Test19 obj = new Test19(11);
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		System.out.println(obj.w);
		System.out.println(obj.s);
	
		Test19 obj1 = new Test19("ram");
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(obj1.z);
		System.out.println(obj1.w);
		System.out.println(obj1.s);
		
		Test19 obj2 = new Test19(100,"ram");
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		System.out.println(obj2.z);
		System.out.println(obj2.w);
		System.out.println(obj2.s);
		
		Test19 obj3 = new Test19("ram",200);
		System.out.println(obj3.x);
		System.out.println(obj3.y);
		System.out.println(obj3.z);
		System.out.println(obj3.w);
		System.out.println(obj3.s);
	}
}
