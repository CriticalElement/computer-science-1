import java.awt.*;

public class Shape {
    private double x0;
    private double y0;
    private boolean filled;
    private Color color;

    public Shape(double x0, double y0, Color color) {
        new Shape(x0, y0, color, false);
    }

    public Shape(double x0, double y0, Color color, boolean filled) {
        this.x0 = x0;
        this.y0 = y0;
        this.color = color;
        this.filled = filled;
    }

    public double getX0() {
        return x0;
    }

    public double getY0() {
        return y0;
    }

    public Color getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void move(double x0, double y0) {
        this.x0 = x0;
        this.y0 = y0;
    }

    public void draw() {
        throw new UnsupportedOperationException("Objects of class Shape should not be instantiated; however objects " +
                "that subclass Shape are allowed.");
    }
}
