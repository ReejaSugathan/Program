package abstraction.assmnt;
import java.util.Scanner;

public class FullTimeEmployee extends Employee 
{
	final int P_HOURS=8;
	
	public FullTimeEmployee(String fname,int fid)
		{
		name=fname;
		id=fid;
		}
	public void calculateSalary(float pay) 
		{
		salary=pay*P_HOURS;
		type="PERMANENT EMPLOYEE";
		hours=P_HOURS;	
		}
public static void main(String[] args)
	{
	String ename;
	int eid,option;
	float esal;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("1.PERMANENT EMPLOYEE");
	System.out.println("2.CONTRACTOR EMPLOYEE");
	System.out.print(" \n SELECT THE OPTION :  ");
	option=sc.nextInt();
	System.out.print(" ENTER EMPLOYEE NAME : ");
	sc.nextLine();
	ename=sc.nextLine();
	System.out.print(" ENTER EMPLOYEE ID : ");
	eid=sc.nextInt();
	System.out.print(" ENTER EMPLOYEE SALARY/HOURS: ");
	esal=sc.nextFloat();
	if(option==1)
		{
		FullTimeEmployee full=new FullTimeEmployee(ename,eid);
		full.calculateSalary(esal);
		System.out.println("\n EMPLOYEE DETAILS ");
		full.print();
		}
	else
		{
		Contractor con=new Contractor(ename,eid);
		con.calculateSalary(esal);
		System.out.println("\n EMPLOYEE DETAILS ");
		con.print();
		}
	}
}
