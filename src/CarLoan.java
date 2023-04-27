public class CarLoan
{
    public static void main(String[] args)
    {
        // 2:
        double tuna = 2.99;
        System.out.println(tuna + 3);

        // 3:
        tuna++;
        System.out.println(tuna);

        // 4:
        tuna = tuna + 5;
        System.out.println(tuna);

        // 5:
        tuna = tuna / 10;
        System.out.println(tuna);

        // 6:
        int alpha = 4;
        int beta = 6;
        System.out.println(2 * alpha + 3 * beta * (alpha + beta) / 2);

        // 7:
        int gamma = 5;
        int delta = 9;
        System.out.println(-1 * (gamma + delta) * (gamma + delta) / 4);

        // 9:
        double pi = 3.14159;
        double radius = 6.5;
        System.out.println(pi * radius * radius);

        // 10:
        double something = 4.5;
        System.out.println(something * something);

        // 11:
        int sideA = 4;
        int sideB = 9;
        System.out.println(sideA * sideA + sideB * sideB);

        // 12:
        System.out.println(sideA % sideB);

        // 13:
        int calcA = 79 + 3 * (4 + 82 - 68) - 7 + 19;
        int calcB = (179 + 21 + 10) / 7 + 181;
        int calcC = 10389 * 56 * 11 + 2246;
        System.out.println("79 + 3 * (4 + 82 - 68) - 7 + 19 = " + calcA);
        System.out.println("(179 + 21 + 10) / 7 + 181 = " + calcB);
        System.out.println("10389 * 56 * 11 + 2246 = " + calcC);
    }
}
