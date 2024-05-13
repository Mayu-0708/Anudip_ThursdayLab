package Thrusday_Lab;

class Bill_Details extends Service_Details
{
	char choice1;
	public void billDetails()
	{
		System.out.println("************** BILL ***************");
		System.out.println("______________________________________________________");
		System.out.println("Customer Name: "+name);
		System.out.println("______________________________________________________");
		System.out.println("Services\t\t\tCost");
		System.out.println("______________________________________________________");
		System.out.println(bill);
		System.out.println("______________________________________________________");
		System.out.println("Total Bill \t\t\t"+price+" Rs.\n");
	}
	public void paymentDetail()
	{
		int min=0000,max=9999,otp,get_otp;
		otp=(int)(Math.random()*(max-min+1)+min);
		
		System.out.println("You need to pay the ammount choose following option: ");
		System.out.println("1:Cash\n2:Online");
		choice=sc.nextInt();
		if(choice==1)
			System.out.println("Amount is Successfully paid");
		else if(choice==2)
		{
			System.out.println("A]PhonePe\nB]Google Pay\nC]Paytm");
			choice1=sc.next().charAt(0);
			if(choice1=='A')
			{
				System.out.println("your OTP is "+otp);
				System.out.println("Enter your otp : ");
				get_otp=sc.nextInt();
				if(get_otp==otp)
					System.out.println("Amount is Successfully paid");
				else
					System.out.println("invalid otp");
			}
			else if(choice1=='B')
			{
				System.out.println("your OTP is "+otp);
				System.out.println("Enter your otp: ");
				get_otp=sc.nextInt();
				if(get_otp==otp)
					System.out.println("Amount is Successfully paid");
				else
					System.out.println("invalid otp");
			}
			else if(choice1=='C')
			{
				System.out.println("your OTP is "+otp);
				System.out.println("Enter your otp: ");
				get_otp=sc.nextInt();
				if(get_otp==otp)
					System.out.println("Amount is Successfully paid");
				else
					System.out.println("invalid otp");
			}
			else
				System.out.println("This transcation is not available");
		}
		else
			System.out.println("This transcation is not available");
		System.out.println("Thanks for Visit......");
	}
}