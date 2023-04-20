package superkeyword.assingment1;

import java.util.Scanner;

public class Result extends Addition
{
	public Result(int num1,int num2)
		{
		number1=num1;
		number2=num2;
		}
	public void check()
		{
		int sum;
		sum=super.operation();
		System.out.println(" The addition result : "+sum);
		
		if(sum%10 ==0)
			{
			System.out.println(" The addition result is divisible by 10 ");
			}
		else
			{
			System.out.println(" The addition result is not divisible by 10 ");
			}
		}
	public static void main(String[] args) 
		{
		Scanner s=new Scanner(System.in);
		System.out.print(" Enter number1 : ");
		int numr1=s.nextInt();
		System.out.print(" Enter number2 : ");
		int numr2=s.nextInt();
		
		Result obj=new Result(numr1,numr2);
		obj.check();
		}
}
