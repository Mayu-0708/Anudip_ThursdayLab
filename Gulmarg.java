package Thrusday_Lab;
//Subclass Gulmarg
public class Gulmarg extends Hill_Stations
{
    // Override the location method
    @Override
    public void location()
    {
        System.out.println("Gulmarg is located in Jammu and Kashmir, India.");
    }

    // Override the famousFor method
    @Override
    public void famousFor() 
    {
        System.out.println("Gulmarg is famous for its skiing slopes and snow-covered mountains.");
    }
}