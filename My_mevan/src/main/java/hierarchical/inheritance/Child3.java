package hierarchical.inheritance;

public class Child3 extends Parent {

	public void child3method() 
	{
		System.out.println("CHILD3 class method");
	
	}
	public static void main(String[] args)
	{
		Child3 obj3=new Child3();
		obj3.child3method();
		obj3.parentmethod();
	}
}
