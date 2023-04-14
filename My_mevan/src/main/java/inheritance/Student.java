package inheritance;

public class Student extends Department{

	String stdName;
	int stdRoll;
	public void details(String name,int roll)
		{
		stdName=name;
		stdRoll=roll;
		}
	public void display()
		{
		System.out.println(" NAME: "+stdName);
		System.out.println(" ID : "+stdRoll);
		input("ELECTRONICS");
		System.out.println(" DEPARTMENT NAME: "+deptName);
		}
	public static void main(String[] arg)
		{
		Student obj=new Student();
		obj.details("REEJA",26);
		
		System.out.println(" STUDENT 1");
		obj.display();
		//obj.input("ELECTRONICS");  // input is department class methode
		
		}

}
