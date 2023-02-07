import java.awt.*;
import java.util.Random;

public class GraphicsProject
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int width = 1920;
        int height = 1080;

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        StdDraw.clear(Color.BLACK);

        StdDraw.setPenColor(Color.WHITE);
        for (int i = 0; i < 200; i++) {
            StdDraw.filledCircle(random.nextInt(1921), random.nextInt(1081), random.nextInt(2) + 1);
        }

        StdDraw.setPenColor(40, 40, 40);
        StdDraw.filledCircle(2880, -2550, 3250);

        StdDraw.setPenColor(193, 189, 190);
        StdDraw.filledRectangle(640, 560, 100, 200);
        StdDraw.filledPolygon(new double[] {540, 640, 740}, new double[] {770, 870, 770});
        StdDraw.setPenColor(255, 125, 0);
        StdDraw.filledRectangle(640, 765, 100, 5);
        StdDraw.setPenColor(40, 40, 40);
        StdDraw.filledPolygon(new double[] {}, new double[] {});

    }
}
