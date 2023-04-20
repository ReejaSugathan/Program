package encasulation.asmt.user;

import java.util.Scanner;

import encasulation.asmt.bank.Bank;

public class User {

	public static void main(String[] args)
			{
				String name;
				int upin;
				
				Bank obj=new Bank();
				obj.setPin1(1001);
				obj.setPin2(1234);
				obj.setPin3(1212);
				
				Scanner s=new Scanner(System.in);
				System.out.print(" ENTER YOUR NAME : ");
				name=s.nextLine();
				obj.setName(name);
				System.out.print(" ENTER YOUR PIN : ");
				upin=s.nextInt();
				
				obj.validation(upin);

			}

}