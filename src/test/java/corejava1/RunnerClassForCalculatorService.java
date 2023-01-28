package corejava1;

public class RunnerClassForCalculatorService {

	public static void main(String[] args) {
		// create CalculatorService object
		CalculatorService obj = new CalculatorService();
		//call /invoke/access instance method
		int result = obj.add(20, 30);
		System.out.println(result);
		
		//call /invoke/access instance method
		double res = obj.calculateRateOfInterest(300000.25, 2, 11.5);
		System.out.println(res);
	}
}
