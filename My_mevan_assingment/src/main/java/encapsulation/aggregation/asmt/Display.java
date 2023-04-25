package encapsulation.aggregation.asmt;
import java.util.Scanner;
public class Display {

	public static void main(String[] args) 
		{
		String name,home,city;
		int roll,hnum,pin;
		
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER STUDENT NAME: ");
		name=s.nextLine();
		System.out.print("ENTER STUDENT ROLL No.: ");
		roll=s.nextInt();
		System.out.print("ENTER HOUSE NAME : ");
		s.nextLine();
		home=s.nextLine();
		System.out.print("ENTER HOUSE No.: ");
		hnum=s.nextInt();
		System.out.print("ENTER CITY: ");
		s.nextLine();
		city=s.nextLine();
		System.out.print("ENTER PIN No.: ");
		pin=s.nextInt();
		
		Student stdobj=new Student();
			stdobj.setName(name);
			stdobj.setRoll(roll);
			
		Address addobj=new Address();
			addobj.setHname(home);
			addobj.setNum(hnum);
			addobj.setCity(city);
			addobj.setPin(pin);
			addobj.setStd(stdobj);     // has-a relation
			addobj.print();
		}
	}

