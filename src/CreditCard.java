// Name: Pranav Pakanati
// Period: Jarrell 2B

public class CreditCard
{
    public static void main(String[] args)
    {
        double totalDebt = 3200.0;
        double minMonthlyPayment = totalDebt * 0.05;
        System.out.println("Total debt >>> $" + totalDebt);
        System.out.println("Minimum monthly payment (5%) >>> $" + minMonthlyPayment + " per month\n");

        int numMonths = 8;
        System.out.println("Total debt >>> $" + totalDebt);
        System.out.println("Desired months to pay off debt >>> " + numMonths);
        System.out.println("Monthly payment required >>> $" + totalDebt / numMonths);
    }
}
