package corejava2;

public class Test3 {

	public static void main(String[] args) {
		
		String x= "ram";
		String Reverse="";
		int y=x.length();
		System.out.println(y);
		for(int i=x.length()-1;i>=0;i--)
		{
			Reverse=Reverse+x.charAt(i);
		}
		System.out.println(Reverse);
	}

}
