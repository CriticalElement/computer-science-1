// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.*;

public class StateOfWater
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program returns the state of water at a given temperature.");

        System.out.print("Enter a temperature: ");
        double temp = scan.nextDouble();
        scan.nextLine();

        System.out.println("(Fahrenheit, Celsius, or Kelvin)");
        System.out.print("Enter the scale: ");
        String scale = scan.nextLine();

        String scaleString;
        String state;
        if (scale.equalsIgnoreCase("Kelvin"))
        {
            scaleString = " Kelvin";
            if (temp < 273)
            {
                state = "solid";
            }
            else if (temp < 373)
            {
                state = "liquid";
            }
            else
            {
                state = "gas";
            }
        }
        else if (scale.equalsIgnoreCase("Celsius"))
        {
            scaleString = " degrees Celsius";
            if (temp < 0)
            {
                state = "solid";
            }
            else if (temp < 100)
            {
                state = "liquid";
            }
            else
            {
                state = "gas";
            }
        }
        else
        {
            scaleString = " degrees Fahrenheit";
            if (temp < 32)
            {
                state = "solid";
            }
            else if (temp < 212)
            {
                state = "liquid";
            }
            else
            {
                state = "gas";
            }
        }
        System.out.println("The state at " + temp + scaleString + " is " + state);
    }
}
