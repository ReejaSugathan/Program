package hierarchical.inheritance;

public class Child1 extends Parent {

	public void child1method() 
	{
		System.out.println("CHILD1 class method");
	
	}
	public static void main(String[] args)
	{
		Child1 obj1=new Child1();
		obj1.child1method();
		obj1.parentmethod();
	}

}
