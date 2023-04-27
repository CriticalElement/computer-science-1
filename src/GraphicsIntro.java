import java.awt.*;

public class GraphicsIntro
{
    public static void main(String[] args)
    {
        //DO NOT EDIT THE STARTER CODE FOR THE ASSIGNMENT ------------------
        //*** MAKE SURE THAT StdDraw.java IS IN THE SAME PROJECT FOLDER ***
        //Sets size and scale of drawing canvas / window
        int width = 600;
        int height = 600;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        //ADD YOUR CODE BELOW HERE ----------------------------------------
        // 5 Circles
        StdDraw.filledCircle(300, 300, 300);
        StdDraw.setPenColor(255, 255, 255);
        StdDraw.filledCircle(300, 300, 240);
        StdDraw.setPenColor(0, 0, 255);
        StdDraw.filledCircle(300, 300, 180);
        StdDraw.setPenColor(255, 0, 0);
        StdDraw.filledCircle(300, 300, 120);
        StdDraw.setPenColor(255, 255, 0);
        StdDraw.filledCircle(300, 300, 60);

        StdDraw.pause(3000);
        StdDraw.clear();

        // Notebook Paper
        StdDraw.setPenColor(0, 0, 255);
        for (int i = 1; i <= 26; i++)
        {
            StdDraw.line(0, i * 600 / 26, 600, i * 600 / 26);
        }
        StdDraw.setPenColor(200, 0, 0);
        StdDraw.line(60, 0, 60, 600);

        StdDraw.pause(3000);
        StdDraw.clear();

        // Curve Illusion
        int numLines = 100;
        int finalColorR = 255;
        int finalColorG = 0;
        int finalColorB = 0;
        for (int i = 0; i < numLines; i++) {
            StdDraw.setPenColor(i * finalColorR / numLines, i * finalColorG / numLines, i * finalColorB / numLines);
            StdDraw.line(i * 600 / numLines,0,600,i * 600 / numLines);
        }

        StdDraw.pause(3000);
        StdDraw.clear();

        // Checkerboard
        int N = 12;
        width = N * 20;
        height = N * 20;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        Color currentColor = new Color(0, 0, 0);
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                StdDraw.filledSquare(20 * i - 10, 20 * j - 10, 10);
                currentColor = new Color(Math.abs(currentColor.getRed() - 255), 0, 0);
                StdDraw.setPenColor(currentColor);
            }
            // noinspection ConstantConditions
            if (N % 2 == 0) {
                currentColor = new Color(Math.abs(currentColor.getRed() - 255), 0, 0);
                StdDraw.setPenColor(currentColor);
            }
        }
    }
}