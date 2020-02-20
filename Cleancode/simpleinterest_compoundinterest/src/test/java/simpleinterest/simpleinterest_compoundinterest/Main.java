package simpleinterest.simpleinterest_compoundinterest;
import java.util.Scanner;
public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,principle_amount,time,no_of_times;
		float rate;
		System.out.println("Enter your choice simple interest or compound interest 1 or 2");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		Calculation c=new Calculation();
		switch(ch)
		{
		case 1:System.out.println("Enter priciple amount");
			   principle_amount=sc.nextInt();
			   System.out.println("Enter how many years");
			   time=sc.nextInt();
			   System.out.println("Enter rate of interest");
			   rate=sc.nextFloat();
			   System.out.println(c.simple_interest(principle_amount,rate,time));
			   break;
		case 2:System.out.println("Enter principle amount");
			   principle_amount=sc.nextInt();
			   System.out.println("Enter rate of interest");
			   rate=sc.nextFloat();
			   System.out.println("Enter how many years");
			   time=sc.nextInt();
			   System.out.println("Enter number of times in a year do you want to pay");
			   no_of_times=sc.nextInt();
			   System.out.println(c.compound_interest(principle_amount,rate,time,no_of_times));
		}

	}

}
