public class TableOfBases
{
    public static void main(String[] args)
    {
        System.out.println("Decimal     Binary      Octal       Hex         Character");

        for (int i = 65; i <= 90; i++)
        {
            System.out.printf("%-12s%-12s%-12s%-12s%-12s%n", i, Integer.toBinaryString(i), Integer.toOctalString(i),
                    Integer.toHexString(i), (char) i);
        }
    }
}
