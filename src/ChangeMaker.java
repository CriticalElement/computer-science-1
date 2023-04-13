@SuppressWarnings("WeakerAccess")
public class ChangeMaker
{
    public static void main(String[] args)
    {
        System.out.println("simpleSearch(new int[] {8, 6, 7, 4, 3, 6, 5}, 7) >>> " + simpleSearch(new int[] {8, 6, 7, 4, 3, 6, 5}, 7));
        System.out.println("\nsquareBoard(2) >>>");
        squareBoard(2);
        System.out.println("\ncheckerBoard(3) >>>");
        checkerBoard(3);
        System.out.println("\nprintPow2(4) >>> ");
        printPow2(4);
        System.out.println("convertTemp(32, true) >>> " + convertTemp(32, true));
        System.out.println("\nconvertTemp(0, false) >>> " + convertTemp(0, false));
        System.out.println("\nisArmstrong(371) >>> " + isArmstrong(371));
        System.out.println("\ncontains(new int[] {1, 2, 1, 2, 3}, new int[] {1, 2, 3}) >>> " + contains(new int[] {1, 2, 1, 2, 3}, new int[] {1, 2, 3}));
        System.out.println("\ncontains(new int[] {1, 2, 1, 2, 3, 1}, new int[] {1, 1, 3, 1}) >>> " + contains(new int[] {1, 2, 1, 2, 3, 1}, new int[] {1, 1, 3, 1}));
    }

    public static int simpleSearch(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (value == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void squareBoard(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void checkerBoard(int num) {
        for (int i = 0; i < num; i++) {
            if (i % 2 != 0) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printPow2(int num) {
        String output = "Here are the first " + num + " powers of 2:\n";
        for (int i = 0; i < num; i++) {
            //noinspection StringConcatenationInLoop
            output += "2^" + i + " = " + (int) Math.pow(2, i) + "\n";
        }
        System.out.println(output);
    }

    public static double convertTemp(double temp, boolean isF) {
        if (isF) {
            return (temp - 32) * (5.0 / 9);
        }
        return temp * (9.0 / 5) + 32;
    }

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int number = num;
        while (num > 0) {
            sum += Math.pow(num % 10, 3);
            num /= 10;
        }
        return sum == number;
    }

    public static boolean contains(int[] alpha, int[] beta) {
        for (int i = 0; i < alpha.length - (beta.length - 1); i++) {
            for (int j = 0; j <= beta.length; j++) {
                if (j == beta.length)
                    return true;
                if (alpha[i + j] != beta[j])
                    break;
            }
        }
        return false;
    }
}
