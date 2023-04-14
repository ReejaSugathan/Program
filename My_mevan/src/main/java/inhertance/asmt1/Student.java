package inhertance.asmt1;

public class Student extends Department{

	String stdName;
	int stdRoll;
	float mtotal;
	public Student(String name,int roll,float mark,String dname,int did)
		{
		stdName=name;
		stdRoll=roll;
		mtotal=mark;
		deptName=dname;
		id=did;
		}
	public void display()
		{
		System.out.println(" NAME: "+stdName);
		System.out.println(" ROLL NO : "+stdRoll);
		System.out.println(" TOTAL MARK : "+mtotal);
		dptdisplay("ELECTRONICS");
		}
	public static void main(String[] arg)
		{
		Student obj=new Student("REEJA",25,300f,"Electronics",340);
		
		System.out.println(" STUDENT 1");
		obj.display();
		
		}

}
