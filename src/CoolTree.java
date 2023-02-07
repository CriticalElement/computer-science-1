// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.awt.event.KeyEvent;
import java.util.Random;


public class CoolTree
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int width = 800;
        int height = 600;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        double[] snowflakeX = {30, 80, 124, 164, 182, 205, 255, 298, 325, 350, 400, 426, 475, 500, 520, 550, 570, 600, 640, 670, 700, 750, 770};
        double[] snowflakeY = new double[snowflakeX.length];

        for (int i = 0; i < snowflakeY.length; i++) {
            snowflakeY[i] = random.nextInt(600) + 400;
        }

        while (true)
        {
            if (StdDraw.isKeyPressed(KeyEvent.VK_Q)) {
                return;
            }

            StdDraw.setPenColor(0, 0, 0);
            StdDraw.filledRectangle(400, 300, 400, 300);

            double[] treeX = {400, 475, 450, 500, 450, 525, 475, 550, 450, 475, 400,
                    325, 350, 250, 325, 275, 350, 300, 350, 325, 400};
            double[] treeY = {500, 400, 400, 325, 350, 250, 275, 175, 200, 175, 200,
                    175, 200, 175, 275, 250, 350, 325, 400, 400, 500};

            StdDraw.setPenColor(10, 80, 20);
            StdDraw.filledPolygon(treeX, treeY);

            double[] trunkX = {400, 425, 425, 375, 375, 400};
            double[] trunkY = {200, 192, 125, 125, 192, 200};

            StdDraw.setPenColor(165, 42, 42);
            StdDraw.filledPolygon(trunkX, trunkY);

            for (int i = 0; i < snowflakeY.length; i++) {
                snowflakeY[i] -= 15;
                if (snowflakeY[i] < 0) {
                    snowflakeY[i] = 600;
                }
            }

            StdDraw.setPenColor(255, 255, 255);
            for (int i = 0; i < snowflakeX.length; i++) {
                StdDraw.filledCircle(snowflakeX[i], snowflakeY[i], 5);
            }

            StdDraw.pause(50);
        }
    }
}
