package Thrusday_Lab;
/*Q1)"Taj Hotel" given the 5- list of Room types, cost per day Room types cost per day luxury 2500 a/c ,
 * 2000 non a/c, 1500 deluxe do the hotel reservation process.
 */
import java.util.*;
public class Hotel_Reservation_System 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        // Room types and costs
        int costLuxuryAC = 2500;
        int costAC = 2000;
        int costNonAC = 1500;

        // Display room types and costs
        System.out.println("Room Types:");
        System.out.println("1. Luxury (A/C) - Rs." + costLuxuryAC + " per day");
        System.out.println("2. A/C - Rs." + costAC + " per day");
        System.out.println("3. Non A/C - Rs." + costNonAC + " per day");

        // Get user input for room type selection
        System.out.print("Enter the room type (1/2/3): ");
        int roomType = scanner.nextInt();

        // Get user input for number of days
        System.out.print("Enter the number of days: ");
        int numOfDays = scanner.nextInt();

        // Calculate total cost based on room type and number of days
        int totalCost = 0;
        switch (roomType) {
            case 1:
                totalCost = costLuxuryAC * numOfDays;
                break;
            case 2:
                totalCost = costAC * numOfDays;
                break;
            case 3:
                totalCost = costNonAC * numOfDays;
                break;
            default:
                System.out.println("Invalid room type selection.");
        }

        // Display total cost and confirmation message
        System.out.println("Total Cost: Rs." + totalCost);
        System.out.println("Reservation confirmed for " + numOfDays + " days.");

        scanner.close();

	}

}
