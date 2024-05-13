package Thrusday_Lab;
//Define user defined Exceptions 

@SuppressWarnings("serial")
class CountryNotValicException extends Exception
{
	//Exception for country not valid
	public CountryNotValicException()
	{
		super("The employee should be an Indian citizen for calculating tax");
	}
}

@SuppressWarnings("serial")
class InvalidEmployNameException extends Exception
{
	//Exception for Invalid Employee name
	public InvalidEmployNameException()
	{
		super("The employee name cannot be empty");
	}
}

@SuppressWarnings("serial")
class NotEligibalForTaxException extends Exception 
{
	//Exception for Not Eligibal for Tax
	public NotEligibalForTaxException()
	{
		super("The employee does not need to pay tax");
	}
}
