// Name: Pranav Pakanati, Akshay Gajjala, Shaunak Sethi
// Period: Jarrell 2B

import java.util.Scanner;

public class TShirtLauncherAPP
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter launch velocity (m/s) >>> ");
        double velocity = scan.nextDouble();
        System.out.print("Enter launch angle (degrees) >>> ");
        double launchAngle = scan.nextDouble();

        double xVelocity = velocity * Math.cos(Math.toRadians(launchAngle));
        double yVelocity = velocity * Math.sin(Math.toRadians(launchAngle));

        double xPos = 0;
        double yPos = 0;

        double time = 0;

        System.out.println("\nProjectile's path:\n");

        while (yPos > 0 || time == 0)
        {
            System.out.println("Time: " + time + "s");
            System.out.println("\tx-pos: " + xPos);
            System.out.println("\ty-pos: " + yPos);

            time++;
            xPos = xVelocity * time;
            yPos = yVelocity * time - (0.5 * 9.8 * (time * time));
        }
        System.out.println("Time: " + time + "s");
        System.out.println("\tx-pos: " + xPos);
        System.out.println("\ty-pos: " + 0);
    }
}
