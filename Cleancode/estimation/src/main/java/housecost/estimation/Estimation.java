package housecost.estimation;

public class Estimation {
	public float construction(int ch,int choice,float feet)
	{
		if(ch==1 && choice==1)
		{
			return(1900*feet);
		}
		else if(ch==1 && choice ==2)
		{
			return (2200*feet);
		}
		else if(ch==1 && choice==3)
		{
			return (2500*feet);
		}
		else if(ch==0 && choice==1)
		{
			return (1200*feet);
		}
		else if(ch==0 && choice==2)
		{
			return (1500*feet);
		}
		else if(ch==0 && choice==3)
		{
			return (1800*feet);
		}
		return 1;
	}
}
