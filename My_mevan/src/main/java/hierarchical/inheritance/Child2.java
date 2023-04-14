package hierarchical.inheritance;

public class Child2 extends Parent {

	public void child2method() 
	{
		System.out.println("CHILD2 class method");
	
	}
	public static void main(String[] args)
	{
		Child2 obj2=new Child2();
		obj2.child2method();
		obj2.parentmethod();
	}

}
