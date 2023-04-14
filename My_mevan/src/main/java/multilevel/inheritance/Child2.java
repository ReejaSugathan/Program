package multilevel.inheritance;

public class Child2 extends Intermediate
{

	public void childmethod()
	{	
	System.out.println("CHILD CLASS METHOD");
	}

	public static void main(String[] args) 
	{
		System.out.println("CHILD2 CLASS OBJECT ");
			Child2 obj=new Child2();	
			obj.childmethod();
			obj.intermediatemethod();
			obj.parentmethode();
		System.out.println();
		
		System.out.println("INTERMEDIATE CLASS OBJECT ");
			Intermediate obj1=new Intermediate();	
			obj1.intermediatemethod();
			obj1.parentmethode();
		System.out.println();
		
		System.out.println("PARENT CLASS OBJECT ");
			Parent obj2=new Parent();
			obj2.parentmethode();
	}

}

