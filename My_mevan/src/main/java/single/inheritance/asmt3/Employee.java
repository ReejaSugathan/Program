package single.inheritance.asmt3;

public class Employee extends Company
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
		public void display()
			{
			System.out.println(" NAME: "+empName);
			System.out.println(" ID : "+empId);
			System.out.println(" SALARY: "+empsalary);
			System.out.println(" COMPANY NAME: "+cmpName);
			System.out.println(" COMPANY DEPARTMENT : "+cmpDept);
			}

}
