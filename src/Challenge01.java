// Name: Pranav Pakanati
// Period: Jarrell 2B

public class Challenge01
{
    public static void main(String[] args)
    {
        int total = 0;

        for (int i = 100; i < 1000; i++)
        {
            for (int j = 100; j < 1000; j++)
            {
                int actualAnswer = i * j;
                int shortcut = (i % 10) * (j % 10);
                shortcut += (((i / 100) * (j % 10)) + ((i % 10) * (j / 100))) * 100;
                shortcut += ((i / 100) * (j / 100)) * 10000;

                if (actualAnswer == shortcut)
                {
                    System.out.println(i + " * " + j + " = " + i * j);
                    total++;
                }
            }
        }

        System.out.println(total);
    }
}
