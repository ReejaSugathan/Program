package discount.method.overridding.assingment;

public class Offseason {
float total,disc,bal;
	public void discount()
	{
		disc=(total*15)/100;
		bal=total-disc;
		System.out.println(" YOU HAVE 15% DISCOUNT AMOUNT IS (15%) : "+disc);
		System.out.println(" YOUR FINAL PAYMENT AMOUNT IS : "+bal);
	}

}
