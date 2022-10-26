// Name: Pranav Pakanati
// Period: Jarrell 2B


public class BigMacWalkAPP
{
    public static void main(String[] args)
    {
        double numBigMacs = 1;
        double bigMacCals = 590;
        double calsPerMile = 94;

        System.out.println("Big Macs eaten >>> " + numBigMacs);
        double totalCalories = bigMacCals * numBigMacs;
        System.out.println("Total calories consumed (Big Macs) >>> " + totalCalories);
        double milesToWalk = totalCalories / calsPerMile;
        System.out.println("Miles to walk to burn off all those Big Macs >>> " + milesToWalk);

        double friesCals = 480; // large fries
        double drinkCals = 192; // medium can of Sprite

        totalCalories = totalCalories + friesCals + drinkCals;
        System.out.println("Total calories consumed >>> " + totalCalories);
        milesToWalk = totalCalories / calsPerMile;
        System.out.println("Miles to walk to burn off all that chow >>> " + milesToWalk);
    }
}
