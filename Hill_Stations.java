/*
 * Q3)Creating one superclass Hill stations and three subclasses Manali, Mussoorie, Gulmarg.
	    Subclasses extend the superclass and override its location() and famousfor() method. 
	   We will call the location() and famousfor() method by the Parent class’, i.e. Hillstations class. 
	   As it refers to the base class object and the base class method overrides the superclass method;
	   the base class method is invoked at runtime. 
 */
package Thrusday_Lab;

public class Hill_Stations 
{
	// Superclass HillStations
	
	    // Method to display the location
	    public void location()
	    {
	        System.out.println("This is a hill station.");
	    }

	    // Method to display what it is famous for
	    public void famousFor()
	    {
	        System.out.println("It is famous for its scenic beauty.");
	    }
}
