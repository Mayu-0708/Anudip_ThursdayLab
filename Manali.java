package Thrusday_Lab;

public // Subclass Manali
class Manali extends Hill_Stations
{
    // Override the location method
    @Override
    public void location()
    {
        System.out.println("Manali is located in Himachal Pradesh, India.");
    }

    // Override the famousFor method
    @Override
    public void famousFor()
    {
        System.out.println("Manali is famous for adventure sports and picturesque landscapes.");
    }
}