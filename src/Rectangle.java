import java.awt.*;

public class Rectangle extends Shape {
    private double xHalfWidth;
    private double yHalfWidth;

    public Rectangle(double x0, double y0, Color color, boolean filled) {
        super(x0, y0, color, filled);
        this.xHalfWidth = 0;
        this.yHalfWidth = 0;
    }

    public Rectangle(double x0, double y0, Color color, boolean filled, double xHalfWidth, double yHalfWidth) {
        super(x0, y0, color, filled);
        this.xHalfWidth = xHalfWidth;
        this.yHalfWidth = yHalfWidth;
    }

    public double getxHalfWidth() {
        return xHalfWidth;
    }

    public double getyHalfWidth() {
        return yHalfWidth;
    }

    public void setxHalfWidth(double xHalfWidth) {
        this.xHalfWidth = xHalfWidth;
    }

    public void setyHalfWidth(double yHalfWidth) {
        this.yHalfWidth = yHalfWidth;
    }

    @Override
    public void draw() {
        StdDraw.setPenColor(getColor());
        if (isFilled()) {
            StdDraw.filledRectangle(getX0(), getY0(), xHalfWidth, yHalfWidth);
        }
        else {
            StdDraw.rectangle(getX0(), getY0(), xHalfWidth, yHalfWidth);
        }
    }
}
