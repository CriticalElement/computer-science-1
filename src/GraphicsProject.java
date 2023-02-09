import java.awt.*;
import java.util.ArrayList;
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
//        for (int i = 0; i < 200; i++) {
//            StdDraw.filledCircle(random.nextInt(1921), random.nextInt(1081), random.nextInt(2) + 1);
//        }

        StdDraw.setPenColor(40, 40, 40);
        StdDraw.filledCircle(2880, -2550, 3250);

        StdDraw.setPenColor(193, 189, 190);
        StdDraw.filledRectangle(640, 560, 100, 175);
        StdDraw.setPenColor(100, 100, 100);
        StdDraw.filledPolygon(new double[] {540, 640, 740}, new double[] {765, 865, 765});
        StdDraw.setPenColor(255, 125, 0);
        StdDraw.filledRectangle(640, 750, 100, 15);
        StdDraw.setPenColor(150, 150, 150);
        StdDraw.filledPolygon(new double[] {640, 626, 629, 635, 641, 648, 653},
                new double[] {865, 852, 849, 848, 848, 849, 852});

        StdDraw.setPenColor(205, 242, 247);
        StdDraw.filledCircle(640, 650, 55);
        StdDraw.filledCircle(635, 505, 5);

        StdDraw.setPenColor(100, 100, 100);
        StdDraw.filledPolygon(new double[] {740, 810, 740}, new double[] {561, 462, 462});
        StdDraw.filledPolygon(new double[] {540, 470, 540}, new double[] {561, 462, 462});
        StdDraw.filledPolygon(new double[] {540, 552, 572, 585, 595, 572, 712, 689, 712, 725, 740},
                new double[] {385, 380, 376, 375, 374, 271, 271, 374, 375, 377, 385});

        StdDraw.line(620, 480, 660, 480);
        StdDraw.line(620, 530, 660, 530);
        StdDraw.line(615, 485, 615, 525);
        StdDraw.line(665, 485, 665, 525);

        StdDraw.arc(620, 485, 5, 180, 270);
        StdDraw.arc(660, 485, 5, 270, 0);
        StdDraw.arc(620, 525, 5, 90, 180);
        StdDraw.arc(660, 525, 5, 0, 90);

        boolean clicked = false;
        ArrayList<Double> mouseXPos = new ArrayList<>();
        ArrayList<Double> mouseYPos = new ArrayList<>();
        while (true) {
            if (StdDraw.isMousePressed()) {
                if (!clicked)
                    System.out.printf("(%s, %s)%n", StdDraw.mouseX(), StdDraw.mouseY() - 15);
                    clicked = true;
            }
            else {
                clicked = false;
            }
            StdDraw.pause(60);
        }

    }
}
