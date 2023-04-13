@SuppressWarnings("WeakerAccess")
public class Automobile
{
    public double mpg;
    public double gallons;

    Automobile(double mpg)
    {
        this.mpg = mpg;
        gallons = 0;
    }

    public void fillUp(double gallons)
    {
        this.gallons += gallons;
    }

    public void takeTrip(double miles)
    {
        this.gallons -= miles / mpg;
    }

    public double reportFuel()
    {
        return gallons;
    }
}
