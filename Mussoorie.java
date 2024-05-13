package Thrusday_Lab;

public // Subclass Mussoorie
class Mussoorie extends Hill_Stations 
{
    // Override the location method
    @Override
    public void location()
    {
        System.out.println("Mussoorie is located in Uttarakhand, India.");
    }

    // Override the famousFor method
    @Override
    public void famousFor()
    {
        System.out.println("Mussoorie is famous for its misty hills and lush greenery.");
    }
}