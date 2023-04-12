package mevanprm;
public class Employee 
{
	String empName;
	int empId;
	float empsalary;
	public Employee(String name,int id,float salary) 
		{
		empName=name;
		empId=id;
		empsalary=salary;
		}
	public float salary1()
		{
		float dobsalary;
		dobsalary=2*empsalary;
		return dobsalary;
		}
	public void display()
		{
		System.out.println(" Employee1");
		System.out.println(" NAME: "+empName);
		System.out.println(" ID : "+empId);
		System.out.println(" SALARY: "+empsalary);
		}

	public static void main(String[] args)
		{
		float doubleSalary;
		Employee obj1=new Employee("REEJA",50,10000f);
		obj1.display();
		doubleSalary=obj1.salary1();
		System.out.println(" DOUBLE SALARY: "+doubleSalary);
		
		}
	
}
