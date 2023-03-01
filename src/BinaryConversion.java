// Name: Pranav Pakanati
// Period: Jarrell 2B

public class BinaryConversion
{
    public static void main(String[] args)
    {
        // 1:
        int[] nums = {2, 2, 4, 5, 8, 6, 2, 3, 5, 5, 5, 9, 0, 9, 6};

        // 2:
        int sum = 0;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

        // 3:
        boolean hasOdd = false;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                hasOdd = true;
                break;
            }
        }
        if (hasOdd)
            System.out.println("Found an odd");
        else
            System.out.println("No odd numbers");

        // 4:
        boolean hasZero = false;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                hasZero = true;
                break;
            }
        }
        if (hasZero)
            System.out.println("Found a zero");
        else
            System.out.println("No zeros");

        // 5:
        // no

        // 6:
        int numSixes = 0;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6)
                numSixes++;
        }
        if (numSixes >= 2)
            System.out.println("Two 6s");
        else
            System.out.println("Less than two 6s");

        // 7:
        boolean has23 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                has23 = true;
                break;
            }
        }
        if (has23)
            System.out.println("Found 2/3");
        else
            System.out.println("No 2/3");

        // 8:
        boolean sorted = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted)
            System.out.println("In order");
        else
            System.out.println("Not in order");

        // 9:
        int numEvens = 0;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                numEvens++;
        }
        if (numEvens % 2 == 0)
            System.out.println("Even evens");
        else
            System.out.println("Uneven evens");

        // 10:
        boolean hasThreeInARow = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                hasThreeInARow = true;
                break;
            }
        }
        if (hasThreeInARow)
            System.out.println("Three in a row");
        else
            System.out.println("No three in a row");

        // 11:
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < nums.length; i++) {
            minValue = Math.min(minValue, nums[i]);
            maxValue = Math.max(maxValue, nums[i]);
        }
        System.out.println(maxValue - minValue);

        // 12:
        int numPairs = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                numPairs++;
                i++;
            }
        }
        System.out.println(numPairs);
    }
}
