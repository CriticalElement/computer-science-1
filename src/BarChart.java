// Name: Pranav Pakanati
// Period: Jarrell 2B


import java.awt.*;

public class BarChart
{
    public static void main(String[] args)
    {
        int width = 800;
        int height = 600;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        StdDraw.line(50, 50, 50, 500);
        StdDraw.line(50, 50, 750, 50);

        StdDraw.text(400, 550, "Favorite Chocolate among Students");

        for (int i = 0; i <= 4; i++) {
            StdDraw.text(27, 50 + i * 110, i * 25 + "%");
        }

        StdDraw.setPenColor(70, 20, 20);
        StdDraw.filledRectangle(150, 100, 25, 50);
        StdDraw.text(150, 25, "M&M's");
        StdDraw.setPenColor(21, 71, 52);
        StdDraw.filledRectangle(325, 80, 25, 30);
        StdDraw.text(325, 25, "Lindt");
        StdDraw.setPenColor(3, 37, 126);
        StdDraw.filledRectangle(500, 60, 25, 10);
        StdDraw.text(500, 25, "Milky Way");
        StdDraw.setPenColor(139, 0, 0);
        StdDraw.filledRectangle(675, 160, 25, 110);
        StdDraw.text(675, 25, "Twix");
    }
}
