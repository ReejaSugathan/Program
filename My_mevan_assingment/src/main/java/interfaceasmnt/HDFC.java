package interfaceasmnt;
import java.util.*;

public class HDFC implements RBI 
{	
	double MaturityAmount,totalInvested,interest;
	
	public void recurringDeposit(float amt, float duration) 
	{
	MaturityAmount=amt*duration+amt*((duration*(duration+1))/2)*(RATE/100)*(1/12.0);
	totalInvested=amt*duration;			
	interest=MaturityAmount-totalInvested;
	}
	public void print()
		{
		System.out.println(" THE INTEREST RATE : "+RATE);
		System.out.println(" TOTAL INVESTED AMOUNT : "+totalInvested);
		System.out.println(" TOTAL INTEREST : "+interest);
		System.out.println(" AFTER METURITY YOUR AMOUNT IS  "+MaturityAmount);
		}
	public static void main(String[] args)
		{
		float pamt, duration;
		  Scanner s = new Scanner(System.in);
		  System.out.print(" ENTER MONTHLY INSTALLMENT : ");
		  pamt = s.nextInt();
		  System.out.print(" ENTER TIME DURATION IN MONTHS : ");
		  duration = s.nextInt();
		 
		  HDFC rd=new HDFC();
		  rd.recurringDeposit(pamt, duration);
		  rd.print();
		}
}
