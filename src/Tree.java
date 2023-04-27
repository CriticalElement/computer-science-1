public class Tree
{
    public static void main(String[] args)
    {
        int width = 800;
        int height = 600;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

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
    }
}
