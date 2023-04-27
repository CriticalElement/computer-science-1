// Title: limitless

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

        StdDraw.clear(Color.BLACK); // set canvas to black
        // could have used .filledRectangle but same result anyway

        StdDraw.setPenColor(Color.WHITE); // draw stars randomly throughout the scene
        for (int i = 0; i < 2000; i++) {
            StdDraw.filledCircle(random.nextInt(1921), random.nextInt(1081), random.nextInt(2) + 1);
        }

        StdDraw.setPenColor(7, 134, 237); // planet outline
        StdDraw.filledCircle(2880, -2550, 3250);

        StdDraw.setPenColor(193, 189, 190); // rocket body
        StdDraw.filledRectangle(640, 560, 100, 175);

        StdDraw.setPenColor(100, 100, 100); // capsule
        StdDraw.filledPolygon(new double[] {540, 640, 740}, new double[] {765, 865, 765});

        StdDraw.setPenColor(255, 125, 0); // orange rectangle thingy
        StdDraw.filledRectangle(640, 750, 100, 15);

        StdDraw.setPenColor(150, 150, 150); // parachute
        StdDraw.filledPolygon(new double[] {640, 626, 629, 635, 641, 648, 653},
                new double[] {865, 852, 849, 848, 848, 849, 852});

        StdDraw.setPenColor(205, 242, 247); // windows
        StdDraw.filledCircle(640, 650, 55);
        StdDraw.filledCircle(635, 505, 5);

        StdDraw.setPenColor(100, 100, 100); // window outline
        StdDraw.circle(640, 650, 55);

        StdDraw.setPenColor(100, 100, 100);
        StdDraw.filledPolygon(new double[] {740, 810, 740}, new double[] {561, 462, 462}); // fins
        StdDraw.filledPolygon(new double[] {540, 470, 540}, new double[] {561, 462, 462});
        StdDraw.filledPolygon(new double[] {540, 552, 572, 585, 595, 572, 712, 689, 712, 725, 740}, // engine bell
                new double[] {385, 380, 376, 375, 374, 271, 271, 374, 375, 377, 385});

        StdDraw.line(620, 480, 660, 480); // hatch
        StdDraw.line(620, 530, 660, 530);
        StdDraw.line(615, 485, 615, 525);
        StdDraw.line(665, 485, 665, 525);
        StdDraw.arc(620, 485, 5, 180, 270); // arcs for rounded squares
        StdDraw.arc(660, 485, 5, 270, 0);
        StdDraw.arc(620, 525, 5, 90, 180);
        StdDraw.arc(660, 525, 5, 0, 90);

        StdDraw.line(648, 500, 648, 510); // hatch ladder
        StdDraw.line(655, 500, 655, 510);

        StdDraw.arc(683, 525, 7, 120, 270); // ladder
        StdDraw.arc(683, 484, 7, 90, 240);

        StdDraw.line(683, 518, 740, 518);
        StdDraw.line(683, 491, 740, 491);

        for (int i = 0; i < 3; i++)
        {
            StdDraw.line(693 + i * 17, 518, 693 + i * 17, 491); // ladder rungs
        }

        StdDraw.setPenColor(80, 140, 90); // landforms
        StdDraw.filledPolygon(new double[] {1072.0, 1080.0, 1098.0, 1123.0, 1137.0, 1168.0, 1196.0, 1241.0, 908.0, 934.0, 953.0, 976.0, 1007.0, 1031.0, 1066.0, 1087.0},
                              new double[] {152.0, 132.0, 126.0, 121.0, 100.0, 94.0, 70.0, 32.0, 32.0, 54.0, 70.0, 85.0, 107.0, 125.0, 148.0, 163.0});
        StdDraw.filledPolygon(new double[] {1446.0, 1482.0, 1526.0, 1539.0, 1614.0, 1699.0, 1718.0, 1774.0, 1807.0, 1857.0, 1916.0, 1916.0},
                              new double[] {32.0, 62.0, 68.0, 100.0, 106.0, 120.0, 130.0, 205.0, 182.0, 225.0, 271.0, 32.0});
        StdDraw.filledPolygon(new double[] {1333.0, 1359.0, 1396.0, 1444.0, 1506.0, 1546.0, 1587.0, 1625.0, 1668.0, 1709.0, 1726.0, 1720.0, 1705.0, 1682.0, 1707.0, 1687.0, 1709.0, 1707.0, 1656.0, 1592.0, 1505.0, 1480.0},
                              new double[] {310.0, 294.0, 272.0, 238.0, 198.0, 179.0, 182.0, 178.0, 203.0, 213.0, 250.0, 289.0, 317.0, 341.0, 380.0, 427.0, 467.0, 482.0, 463.0, 436.0, 397.0, 385.0});
        StdDraw.filledPolygon(new double[] {1127.0, 1178.0, 1191.0, 1239.0, 1270.0, 1289.0, 1327.0, 1326.0, 1334.0, 1308.0, 1291.0, 1258.0, 1261.0, 1230.0, 1195.0},
                              new double[] {188.0, 170.0, 147.0, 142.0, 123.0, 140.0, 146.0, 177.0, 197.0, 224.0, 247.0, 250.0, 269.0, 251.0, 229.0});
        StdDraw.filledPolygon(new double[] {1780.0, 1793.0, 1779.0, 1796.0, 1826.0, 1848.0, 1865.0, 1883.0, 1912.0, 1916.0, 1916.0, 1893.0, 1850.0},
                              new double[] {510.0, 459.0, 410.0, 366.0, 341.0, 360.0, 358.0, 376.0, 376.0, 384.0, 555.0, 547.0, 533.0});

        StdDraw.setPenColor(255, 23, 23); // engine plume (fire)
        StdDraw.filledPolygon(new double[] {572.0, 554.0, 600.0, 642.0, 681.0, 730.0, 712.0},
                              new double[] {271.0, 199.0, 236.0, 201.0, 236.0, 199.0, 271.0});
        StdDraw.setPenColor(255, 164, 0);
        StdDraw.filledPolygon(new double[] {571.0, 600.0, 642.0, 680.0, 712.0},
                              new double[] {272.0, 237.0, 262.0, 238.0, 272.0});
        StdDraw.setPenColor(255, 233, 0);
        StdDraw.filledPolygon(new double[] {571.0, 642.0, 712.0}, new double[] {274.0, 262.0, 273.0});

        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.textRight(1905, 50, "limitless");
    }
}
