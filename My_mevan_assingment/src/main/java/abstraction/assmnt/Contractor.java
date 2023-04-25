package abstraction.assmnt;
import java.util.*;
public class Contractor extends Employee
{
	public Contractor(String cname,int cid)
		{
		name=cname;
		id=cid;
		}
	public void calculateSalary(float pay)
		{
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER WORKING HOURS :  ");
		hours=s.nextFloat();		
		salary=pay*hours;
		type="CONTRACTOR EMPLOYEE";
		}
}
