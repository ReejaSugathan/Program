package discount.method.overridding.assingment;
import java.util.Scanner;

public class OnSeason extends Offseason 
{
	float p1,p2,p3;
	public  OnSeason(float n1,float n2,float n3)
		{
		p1=n1;
		p2=n2;
		p3=n3;
		}
	public void calculate(int num1)
		{
		total=p1+p2+p3;
		System.out.println(" YOUR TOTAL AMOUNT IS : "+total);
			if(num1==1)
			{
			super.discount();
			}
			else
			{
			discount();
			}
		}
	public void discount()
		{
		disc=(total*40)/100;
		bal=total-disc;
		System.out.println(" YOU HAVE 40% DISCOUNT AMOUNT IS : "+disc);
		System.out.println(" YOUR FINAL PAYMENT AMOUNT IS : "+bal);
		}
	public static void main(String[] args) 
	{
		float pdct1,pdct2,pdct3;
		int num;
		
		Scanner s=new Scanner(System.in);
		System.out.println(" 1.OFF SEASON ");
		System.out.println(" 2.ON SEASON ");
		System.out.print(" SELECT THE SEASON : ");
		num=s.nextInt();
		 
		System.out.print(" ENTER THE PRODUCT1 PRICE : ");
		pdct1=s.nextFloat();
		System.out.print(" ENTER THE PRODUCT2 PRICE : ");
		pdct2=s.nextFloat();
		System.out.print(" ENTER THE PRODUCT3 PRICE : ");
		pdct3=s.nextFloat();
		
		OnSeason obj=new OnSeason(pdct1, pdct2, pdct3);
		obj.calculate(num);
		//obj.discount();
	}
	

}
