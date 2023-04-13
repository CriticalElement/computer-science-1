public class AutomobileTester
{
    public static void main(String[] args)
    {
        //#1
        Automobile myBmw = new Automobile(24);

        //#2
        myBmw.fillUp(20);

        //#3
        myBmw.takeTrip(100);

        //#4
        double fuel_left = myBmw.reportFuel();

        //#5
        System.out.println(fuel_left); //15.833333333333332
    }
}
