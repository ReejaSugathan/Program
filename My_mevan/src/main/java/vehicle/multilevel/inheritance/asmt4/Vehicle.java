package vehicle.multilevel.inheritance.asmt4;

import java.util.Scanner;

public class Vehicle 
{
	String type;
	
	public void vehicleType() 
		   {
			Scanner s=new Scanner(System.in);
			System.out.println("Vehicle Type:");
			type=s.nextLine();
		   }

}
