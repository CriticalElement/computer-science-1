// Name: Pranav Pakanati
// Period: Jarrell 2B

import java.util.Arrays;
import java.util.Random;

public class NumberHistogramAPP
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] data = new int[25];

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(data) + "\n");

        int[] histogram = new int[10];

        for (int i = 0; i < histogram.length; i++) {
            int occurences = 0;
            //noinspection ForLoopReplaceableByForEach
            for (int j = 0; j < data.length; j++) {
                if (data[j] == i)
                    occurences++;
            }
            histogram[i] = occurences;
        }

        for (int i = 0; i < histogram.length; i++) {
            System.out.println(i + " - occurred " + histogram[i] + " time(s)");
        }
    }
}
