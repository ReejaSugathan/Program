package vehicle.multilevel.inheritance.asmt4;

public class Display extends Car 
{

	public static void main(String[] args)
	{
		Display obj=new Display();
		obj.vehicleType();
		obj.carType();
		
		System.out.println("Vehicle Type: "+obj.type);
		System.out.println("CAR Brand: "+obj.brand);
		System.out.println("CAR Model: "+obj.model);

	}

}
