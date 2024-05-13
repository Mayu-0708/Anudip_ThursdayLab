package Thrusday_Lab;

//Service_Details class extends carUser class
class Service_Details extends CarUser
{
	String bill="";
	int choice,price;
	public char inn_yesno,yesno;
	
	@Override
	void services() {
		
		do
		{
			System.out.println("***** Available Services *****");
			System.out.println("1:Basic Problems\n2:Engine Problem\n3:Other");
			System.out.println("Enter services you want :  ");
			choice=sc.nextInt();
			switch(choice) 
			{
				case 1:
					basicProblem();
					break;
				case 2:
					engineProblem();
					break;
				case 3:
					other();
					break;
				default:
					System.out.println("Invalid Service Selection...");
			}
			System.out.println("Do you want more Main services(y/n): ");
			yesno=sc.next().charAt(0);
		}while(yesno=='y' || yesno=='Y');
		
	}
	
	public void basicProblem()
	{
		do
		{
			System.out.println("***** Basic Services Car *****");
			System.out.println("1:Overheating\n2:Dead Battery\n3:Flat Tires\n4:issues starting the car");
			System.out.println("Enter services you want: ");
			choice=sc.nextInt();
			switch(choice) 
			{
				case 1:
					System.out.println("Your Engine Overheating issue is solved");
					setPrice(500+getPrice());
					bill+="\nOverheating\t\t\t500Rs";
					break;
				case 2:
					System.out.println("Your battery issue is solved");
					setPrice(1000+getPrice());
					bill+="\nDead Battery\t\t\t1000Rs";
					break;
				case 3:
					System.out.println("Your Flat Tires issue is solved");
					setPrice(700+getPrice());
					bill+="\nFlat Tires\t\t\t700Rs.";
					break;
				case 4:
					System.out.println("Your car starting issue is solved");
					setPrice(800+getPrice());
					bill+="\nissues starting the car\t\t800Rs.";
					break;
				default:
					System.out.println("Please select valid service");
			}
			System.out.println("Do you have any basic services(y/n): ");
			inn_yesno=sc.next().charAt(0);
		}while(inn_yesno=='y' || inn_yesno=='Y');	
		
	}

	public void other()
	{
		do
		{
			System.out.println("***** Other Services Car *****");
			System.out.println("1:Car Wash\n2:Car Paint");
			System.out.println("Enter services you want: ");
			choice=sc.nextInt();
			switch(choice) 
			{
				case 1:
					System.out.println("Your car is washed");
					setPrice(500+getPrice());
					bill+="\nCar Wash\t\t\t500Rs.";
					break;
				case 2:
					System.out.println("Your car color is successfully modified");
					setPrice(1500+getPrice());
					bill+="\nCar Paint\t\t\t1500Rs.";
					break;
				default:
					System.out.println("Please select valid service");
			}
			System.out.println("Do you have any other services(y/n): ");
			inn_yesno=sc.next().charAt(0);
		}while(inn_yesno=='y' || inn_yesno=='Y');	
		
	}
	
	public void engineProblem()
	{
		do
		{
			System.out.println("***** Engine Services Car *****");
			System.out.println("1:Fail Fuel Pump\n2:Flude Filter\n3:Break Fail\n4:Lubrication issue\n5:AC Problem");
			System.out.println("Enter services you want: ");
			choice=sc.nextInt();
			switch(choice) 
			{
				case 1:
					System.out.println("Your Fail Fuel Pump issue is solved");
					setPrice(2000+getPrice());
					bill+="\nFail Fuel Pump\t\t2000Rs.";
					break;
				case 2:
					System.out.println("Your Flude Filter issue is solved");
					setPrice(3000+getPrice());
					bill+="\nFlude Filter\t\t\t3000Rs.";
					break;
				case 3:
					System.out.println("Your car break is repaired");
					setPrice(1000+getPrice());
					bill+="\nLubrication issue\t\t1000Rs.";
					break;
				case 4:
					System.out.println("Your Lubrication issue is solved");
					setPrice(1500+getPrice());
					bill+="Break Fail\t\t\t1500";
					break;
				case 5:
					System.out.println("Your car AC is repaired");
					setPrice(5000+getPrice());
					bill+="\nAC Problem\t\t\t5000Rs.";
					break;
				default:
					System.out.println("Please select valid service");
			}
			System.out.println("Do you have any engine sevices(y/n): ");
			inn_yesno=sc.next().charAt(0);
		}while(inn_yesno=='y' || inn_yesno=='Y');	
		
	}
	
	private void setPrice(int pr) {
		 price=pr;
		
	}

	private int getPrice() {
		return price;
	}
}