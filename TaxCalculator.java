package Thrusday_Lab;

public class TaxCalculator extends EmployDetails {

	 double taxAmount;
	 //Declaring Exceptions using throws keyword
	public  double CalculateTax() throws CountryNotValicException,InvalidEmployNameException,NotEligibalForTaxException
	{
		Accept();
		//check employe name is valid or not and throw exception
		if(name == null || name.isEmpty())
		{
			throw new InvalidEmployNameException();
		}
		//check nationality and throw Exception
		if(!isIndian)
		{
			throw new CountryNotValicException();
		}
		else
		{
			//tax calculation using if-else statements
			if(empsal >= 100000)
			{
				taxAmount = empsal * 8/100;
			}
			else if (empsal >= 50000 && empsal < 100000)
			{
				taxAmount = empsal * 6/100;
			}
			else if(empsal >= 30000 && empsal < 50000)
			{
				 taxAmount = empsal * 5/100;
			}
			else if(empsal >= 10000 && empsal < 30000)
			{
				 taxAmount =empsal * 4/100;
			}
			else
			{
				throw new NotEligibalForTaxException();
			}
		}
		return taxAmount;
		
	}
}
