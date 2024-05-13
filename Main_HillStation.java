package Thrusday_Lab;

public class Main_HillStation
{
	    public static void main(String[] args) 
	    {
	        // Create objects of each subclass
	    	Hill_Stations manali = new Manali();
	    	Hill_Stations mussoorie = new Mussoorie();
	    	Hill_Stations gulmarg = new Gulmarg();

	        // Call methods using the superclass reference
	        System.out.println("Manali:");
	        manali.location();
	        manali.famousFor();
	        System.out.println();

	        System.out.println("Mussoorie:");
	        mussoorie.location();
	        mussoorie.famousFor();
	        System.out.println();

	        System.out.println("Gulmarg:");
	        gulmarg.location();
	        gulmarg.famousFor();
	    }
}
