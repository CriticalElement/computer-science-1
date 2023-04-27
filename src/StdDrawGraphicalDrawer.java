import java.util.ArrayList;
import java.util.Scanner;

public class StdDrawGraphicalDrawer
{
    private final static char SQUARE = '1';
    private final static char CIRCLE = '2';
    private final static char RECTANGLE = '3';
    private final static char ELLIPSE = '4';
    private final static char LINE = '5';
    private final static char COLOR = '9';
    private final static char FILLED = '0';

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int width = 1280;
        int height = 720;

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        // Draw grid
        drawGrid(width, height);

        boolean isFilled = false;
        char currentShape = RECTANGLE;
        boolean mousePressed = false;
        Shape tempShape = null;
        ArrayList<Shape> shapes = new ArrayList<>();

        while (true) {
            while (!StdDraw.hasNextKeyTyped() && !StdDraw.isMousePressed()) { // wait for action
                if (mousePressed) {
                    shapes.add(tempShape);
                    tempShape = null;
                    mousePressed = false;
                }
            }

            if (StdDraw.hasNextKeyTyped()) {
                char keyTyped = StdDraw.nextKeyTyped();
                if ((int) keyTyped >= 49 && (int) keyTyped <= 53) {
                    currentShape = keyTyped;
                }
                else if (keyTyped == FILLED) {
                    isFilled = !isFilled;
                }
                else if (keyTyped == COLOR) {
                    System.out.print("Enter rgb values (line separated): ");
                    StdDraw.setPenColor(scan.nextInt(), scan.nextInt(), scan.nextInt());
                }
                else if (keyTyped == 'q') {
                    return;
                }
            }

            if (StdDraw.isMousePressed()) {
                if (!mousePressed) {
                    switch (currentShape) {
                        case RECTANGLE:
                            tempShape = new Rectangle(StdDraw.mouseX(), StdDraw.mouseY(), StdDraw.getPenColor(), isFilled);
                            break;
                    }
                    mousePressed = true;
                }
                else {
                    switch (currentShape) {
                        case RECTANGLE:
                            Rectangle rectangle = (Rectangle) tempShape;
                            assert rectangle != null;
                            rectangle.setxHalfWidth(Math.abs(StdDraw.mouseX() - rectangle.getX0()));
                            rectangle.setyHalfWidth(Math.abs(StdDraw.mouseY() - rectangle.getY0()));
                    }
                }
            }

            StdDraw.clear();
            if (!mousePressed) { drawGrid(width, height); }
            shapes.forEach(Shape::draw);
            if (tempShape != null) { tempShape.draw(); }
            StdDraw.pause(10);
        }
    }

    private static void drawGrid(int width, int height) {
//        for (int i = 0; i <= width; i += 25) {
//            if (i % width / 2 == 0) {
//                StdDraw.setPenColor(0, 0, 255);
//            }
//            else if (i % 100 == 0) {
//                StdDraw.setPenColor(140, 140, 200);
//            }
//            else {
//                StdDraw.setPenColor();
//            }
//            StdDraw.line(i, 0, i, height);
//        }
//        for (int i = 0; i <= height; i += 25) {
//            if (i % height / 2 == 0) {
//                StdDraw.setPenColor(0, 0, 255);
//            }
//            else if (i % 100 == 0) {
//                StdDraw.setPenColor(140, 140, 200);
//            }
//            else {
//                StdDraw.setPenColor();
//            }
//            StdDraw.line(0, i, width, i);
//        }
//        StdDraw.picture(((double) width - 13) / 2, ((double) height - 101) / 2, "StdDraw Grid.png",
//                width * 1.2711306257, height * 1.2850318471);
    }
}