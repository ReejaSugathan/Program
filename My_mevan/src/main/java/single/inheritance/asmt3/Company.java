package single.inheritance.asmt3;

public class Company 
{
	static String cmpName="OBSQURA";
	static String cmpDept="SOFTWARE TESTING";
	
	public static void main(String[] args)
	{
		Employee obj1=new Employee("REEJA",50,10000f);
		Employee obj2=new Employee("REJY",20,12000f);
		
		System.out.println(" EMPLOYEE 1");
		obj1.display();
		
		System.out.println();
		System.out.println(" EMPLOYEE 2");
		obj2.display();
	}
}
