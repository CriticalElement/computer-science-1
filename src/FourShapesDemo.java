// Name: Pranav Pakanati
// Period: Jarrell 2B

public class FourShapesDemo
{
    public static void main(String[] args)
    {
        //DO NOT EDIT THE STARTER CODE FOR THE ASSIGNMENT ------------------
        //*** MAKE SURE THAT StdDraw.java IS IN THE SAME PROJECT FOLDER ***
        //Sets size and scale of drawing canvas / window
        int width = 800;
        int height = 600;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        //ADD YOUR CODE BELOW HERE ----------------------------------------

        //(1) Draw a filled-in circle in the upper left of the window
        StdDraw.filledCircle(200, 450, 125);

        //(2) Draw a [hollow] square upper right of the window and draw its apothem
        //apothem - the "radius" of a polygon, from the center to a 90-degree angle on any side
        StdDraw.square(600, 450, 125);
        StdDraw.line(600, 450, 600, 325);

        //(3) Use multiple ellipses to form a sphere in the lower left of the window
        StdDraw.circle(200, 150, 125);

        StdDraw.ellipse(200, 150, 42, 125);
        StdDraw.ellipse(200, 150, 90, 125);

        StdDraw.ellipse(200, 150, 125, 42);
        StdDraw.ellipse(200, 150, 125, 90);

        //(4) Create a cube/rectangular prism in the lower right of the window
        //HINT: 2 full shapes and 4 lines :)
        StdDraw.square(575, 175, 100);
        StdDraw.square(625, 125, 100);

        StdDraw.line(475, 275, 525, 225);
        StdDraw.line(475, 75, 525, 25);

        StdDraw.line(675, 275, 725, 225);
        StdDraw.line(675, 75, 725, 25);
        //(5) Write YOUR NAME somewhere in the middle of the window
        StdDraw.text(400, 300, "Pranav Pakanati");

    }
}