package encapsulation.aggregation.asmt;
public class Address 
{
		private	String hname;
		private	String city;
		private	int num;
		private	int pin;
		private	Student std;
		
	public String getHname() 
		{
			return hname;
		}
	public String getCity()
		{
			return city;
		}
	public int getNum()
		{
			return num;
		}
	public int getPin() 
		{
			return pin;
		}
	public Student getStd() 
		{
			return std;
		}
	public void setHname(String hname) 
		{
			this.hname = hname;
		}
	public void setCity(String city) 
		{
			this.city = city;
		}
	public void setNum(int num) 
		{
			this.num = num;
		}
	public void setPin(int pin) 
		{
			this.pin = pin;
		}
	public void setStd(Student std)
		{
			this.std = std;
		}
	public void print()
		{
			System.out.println(" \n STUDENT DETAILS ");
			System.out.println(" STUDENT NAME: "+std.getName());
			System.out.println(" ROLL.No.    : "+getStd().getRoll());
			System.out.println(" HOUSE NAME  : "+getHname());
			System.out.println(" HOUSE No.   : "+getNum());
			System.out.println(" CITY        : "+city);
			System.out.println(" PIN No.     : "+getPin());
		}
}
