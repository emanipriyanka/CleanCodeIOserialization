package simpleinterest.simpleinterest_compoundinterest;

public class Calculation {
	public float simple_interest(int principle_amount,float rate,int time)
	{
		return ((principle_amount*time*rate)/100);
	}
	public double compound_interest(int principle_amount,float rate,int time,int number_of_times)
	{
		return ((principle_amount)*Math.pow(1+(rate/number_of_times),(number_of_times*time)));
	}
}
