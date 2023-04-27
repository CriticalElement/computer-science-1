public class ArrayOfHope
{
    public static void main(String[] args)
    {
        char[] ch = new char[26];

        for (int i = 65; i <= 90; i++) {
            ch[i - 65] = (char) i;
        }

        for (int i = 0; i < ch.length; i++) {
            String sep = "";
            if (i != ch.length - 1)
                sep = ", ";
            System.out.print(ch[i] + sep);
        }
    }
}
