package vehicle.multilevel.inheritance.asmt4;

import java.util.Scanner;

public class Car extends Vehicle 
{
String model,brand;
	
	public void carType() 
		   {
			Scanner s=new Scanner(System.in);
			System.out.println("CAR Brand:");
			brand=s.nextLine();
			System.out.println("CAR Model:");
			model=s.nextLine();
		   }

}
