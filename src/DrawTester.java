//make sure StdDraw is in the same PROJECT as this file.
//import java.util.*;
//import java.awt.*;      //for graphics stuff

public class DrawTester
{
    public static void main(String[] args)
    {
        //Random rng = new Random();

        //Canvas Window or Drawing Surface Area
        //set size / scale of drawing window
        int width  = 800;
        int height = 600;
        StdDraw.setCanvasSize(width, height);           
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        
        //Insert your code below here
        
        StdDraw.ellipse(250,250,50,100);
	    StdDraw.setPenColor(195,180,130);   //old heritage maroon
        StdDraw.text(405, 400,"Hello World!");
        StdDraw.setPenColor(87,28,30);  //old vegas gold
        StdDraw.filledRectangle(500,250,100,100);
        StdDraw.setPenColor(0,0,0); //black
        StdDraw.text(400, 100,"-- your files have been successfully generated --");
        
    }
}