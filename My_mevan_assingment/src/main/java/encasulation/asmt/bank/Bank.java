package encasulation.asmt.bank;

public class Bank 
{
	private String name;
	private int pin1;
	private int pin2;
	private int pin3;
	public String getName() {
		return name;
	}
	public int getPin1() {
		return pin1;
	}
	public int getPin2() {
		return pin2;
	}
	public int getPin3() {
		return pin3;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPin1(int pin1) {
		this.pin1 = pin1;
	}
	public void setPin2(int pin2) {
		this.pin2 = pin2;
	}
	public void setPin3(int pin3) {
		this.pin3 = pin3;
	}
	public void validation(int pin)
	{
		if(pin == getPin1())
			{
			System.out.println(" WELCOME "+getName());
			}
		else if(pin == getPin2())
			{
			System.out.println(" WELCOME "+getName());
			}
		else if(pin == getPin3())
			{
			System.out.println("  WELCOME "+getName());
			}
		else
			{
			System.out.println(" INVALID PIN");
			}
	}
}
