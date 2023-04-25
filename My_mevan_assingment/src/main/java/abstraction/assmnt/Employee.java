package abstraction.assmnt;

public abstract class Employee 
{
	float salary,hours;
	String name,type;
	int id;
	
	public abstract void calculateSalary(float pay);
	public void print()
	{
	System.out.println("EMPLOYEE NAME  : "+name);
	System.out.println("EMPLOYEE ID    : "+id);
	System.out.println("EMPLOYEE TYPE  : "+type);
	System.out.println("WORKING HOURS/DAY:  "+hours);
	System.out.println("SALARY/DAY     : "+salary);
	}
}
