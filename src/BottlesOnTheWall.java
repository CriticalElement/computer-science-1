public class BottlesOnTheWall
{
    public static void main(String[] args)
    {
        // 1:
        // yes

        // 2:
        int x = 1;
        while (x < 10)
        {
            System.out.print(x);
            x++;
        }
        System.out.println();

        // 3:
        x = 1;
        while (x < 10)
        {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();

        // 4:
        x = 1;
        while (x < 20)
        {
            System.out.print(x + " ");
            x += 2;
        }
        System.out.println();

        // 5:
        x = 5;
        while (x < 55)
        {
            System.out.print(x + " ");
            x += 5;
        }
        System.out.println();

        // 6:
        x = 10;
        while (x > 0)
        {
            System.out.print(x + " ");
            x--;
        }
        System.out.println();

        // 7:
        // no

        // 8:
        x = -4;
        while (x > -44)
        {
            System.out.print(x + " ");
            x -= 4;
        }
        System.out.println();

        // 9:
        x = 1;
        while (x < 512)
        {
            System.out.print(x + " ");
            x *= 2;
        }
        System.out.println();

        // 10:
        x = 1000;
        while (x > 1)
        {
            System.out.print(x + " ");
            x /= 2;
        }
        System.out.println();

        // 11:
        x = 1;
        while (x < 9)
        {
            System.out.print(x + " ");
            System.out.print(-x + " ");
            x++;
        }
    }
}
