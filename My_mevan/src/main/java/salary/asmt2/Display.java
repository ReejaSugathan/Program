package salary.asmt2;

import java.util.Scanner;

public class Display extends Calculate
{
	public void total()
	{
		float total;
		total=basicPay+hra-pf-deduction+bonus;
		System.out.println(" EMPLOYEE NAME : "+name);
		System.out.println(" BASIC PAY : "+basicPay);
		System.out.println(" TOTAL DEDUCTION : "+deduction);
		System.out.println(" BONUS : "+bonus);
		System.out.println(" HRA: "+hra);
		System.out.println(" PF : "+pf);
		System.out.println(" TOTAL SALARY : "+total);
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print(" EMPLOYEE NAME : ");
		String ename=s.nextLine();
		System.out.print(" BASIC PAY : ");
		float pay=s.nextFloat();
		System.out.print(" TOTAL DEDUCTION : ");
		float dedu=s.nextFloat();
		System.out.print(" BONUS : ");
		float bon=s.nextFloat();
		
		Display obj1=new Display();
		obj1.items(ename,pay,dedu,bon);
		obj1.calculation();
		System.out.println(" THE SALARY SLIP ");
		obj1.total();

	}

}
