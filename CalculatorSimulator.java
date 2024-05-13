package Thrusday_Lab;

/*
 * Q1 ."Develop  a  class  named  “TaxCalculator“ with a method named calculateTax with the following method parameters,

            VariableName   Data Type
             empName        String
           isIndian        boolean
            empSal        double

         This method should return a double taxAmount.
         The business logic for calculating the tax  is as follows, this has to be implemented inside the method,
          If the employee is not a Indian
         The calculator should throw a CountryNotValidException
          If the employee name is null or empty
        The calculator should throw a EmployeeNameInvalidException
       If  empSal is greater than one lakh and isIndian true
       taxAmount =empSal *8/100
       Otherwise  If  empSal  is between 50K and 1lakh and isIndian true
       taxAmount =empSal *6/100
       Otherwise  If  empSal  is between 30 and 50 Thousand  and isIndian true
       taxAmount =empSal *5/100
       Otherwise  If  empSal  is between 10 and 30 Thousand  and isIndian true
       taxAmount =empSal *4/100
        Otherwise
        The calculator should throw a TaxNotEligibleException.
      Develop a main class CalculatorSimulator  , implement the following logic in main method
   1.  Execute the calculateTax Method and print the tax amount as “Tax amount is “<Tax Amount>
   2.  In case the calculateTaxMethod throws exceptions, this method needs to catch the appropriate exception 
       print the stack trace and display the following messages,
      a.  Country not valid:  “The employee should be an Indian citizen for calculating tax”
      b.  Employee name not valid:  “The employee name cannot be empty”
      c.  Not eligible for Tax calculation:“The employee does not need to pay tax”"
 */
public class CalculatorSimulator {

	public static void main(String[] args) {
		//Creating object of TaxCalculator class 
		TaxCalculator obj = new TaxCalculator();
		try
		{
			obj.CalculateTax();
			System.out.println("Total tax Amount = "+obj.taxAmount);
		}
		catch(InvalidEmployNameException en)
		{
			System.out.println(en.getMessage());
		}
		catch(CountryNotValicException ec)
		{
			System.out.println(ec.getMessage());
		}
		catch(NotEligibalForTaxException et)
		{
			System.out.println(et.getMessage());
		}
	}

}
