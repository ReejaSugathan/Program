package inheritanceexp;

public class Child extends Parent
{

	public void childmethode()
	{
		
	System.out.println("CHILD CLASS METHOD");
	parentmethode();
	}

	public static void main(String[] args) 
	{
		Child obj=new Child();	
		obj.childmethode();
		//obj.parentmethode();
		//Parent obj1=new Parent();
		//obj1.parentmethode();
		

	}

}
