package corejava1;

public class CalculatorService
{
		public int add (int firstNum , int secondNum)
		{
						int result = firstNum + secondNum;
						return result;				
		}
		
		public double calculateRateOfInterest (double prinicipalamount , int time , double rateofInterest)
		{
		double res=	(prinicipalamount * time * rateofInterest)/100;
			return res;
		}
		
}
