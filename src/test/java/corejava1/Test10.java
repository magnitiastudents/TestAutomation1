package corejava1;

public class Test10
{		
		// properties
	
		private int x;          // for current class only
		protected int y;		// for child classes
		int z;					// (default) for package level
		public int w;			// for project level
		
		public void method()
		{
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(w);
		}
	

}
