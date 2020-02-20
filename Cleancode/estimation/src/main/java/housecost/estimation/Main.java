package housecost.estimation;
import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		float area;
		int ch,choice;
		Estimation e=new Estimation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area ofhouse");
		area=sc.nextInt();
		System.out.println("Do you want automated house or not if yes enter 1 else 0");
		ch=sc.nextInt();
		System.out.println("1.Standard material 2.above standard material 3.high standard material");
		choice=sc.nextInt();
		if(ch==1)
		{
			if(choice==1)//automated and standard material
			{
				System.out.println(e.construction(ch,choice,area));
			}
			else if(choice==2)
			{
				System.out.println(e.construction(ch,choice,area));
			}
			else if(choice==3)
			{
				System.out.println(e.construction(ch,choice,area));
			}
		}
		else if(ch==0)
		{
			if(choice==1)//automated and standard material
			{
				System.out.println(e.construction(ch,choice,area));
			}
			else if(choice==2)
			{
				System.out.println(e.construction(ch,choice,area));
			}
			else if(choice==3)
			{
				System.out.println(e.construction(ch,choice,area));
			}
		}
	}

}
