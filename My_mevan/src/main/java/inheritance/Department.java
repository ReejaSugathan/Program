package inheritance;

public class Department
{
	String deptName;
	public void input(String name)
	{
		deptName=name;
		//System.out.println(" DEPARTMENT NAME: "+deptName);
	}
	public static void main(String[] arg)
	{
		Department obj1=new Department();
	
		obj1.input("ELECTRONICS");
	}
}