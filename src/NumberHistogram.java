public class NumberHistogram
{
    public static void main(String[] args)
    {
        // 1:
        int[] nums = {2, 4, 5, 8, 16, 2, 3, 5, 9, 0, 9, 12, 6};

        // 2:
        System.out.println(nums[0] + "\n");

        // 3:
        System.out.println(nums[1] + "\n");

        // 4:
        System.out.println(nums[3] + "\n");

        // 5:
        System.out.println(nums[12] + "\n");

        // 6:
        System.out.println(nums.length + "\n");

        // 7:
        System.out.println(nums[nums.length - 1] + "\n");

        // 8:
        // no

        // 9:
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");

        // 10:
        //noinspection ConstantConditions
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            System.out.println("True\n");
        }
        else {
            System.out.println("False\n");
        }

        // 11:
        boolean aboveTen = false;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 10)
                aboveTen = true;
        }
        if (aboveTen) {
            System.out.println("Above 10\n");
        }
        else {
            System.out.println("At/Below 10\n");
        }

        // 12:
        boolean has6 = false;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6)
                has6 = true;
        }
        if (has6) {
            System.out.println("Found a 6\n");
        }
        else {
            System.out.println("No 6\n");
        }

        // 13:
        boolean inRange = true;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 2 || nums[i] > 8) {
                inRange = false;
                break;
            }
        }
        if (inRange) {
            System.out.println("Within 2 to 8");
        }
        else {
            System.out.println("Not within 2 to 8");
        }
    }
}
