public class CarLoanAPP
{
    public static void main(String[] args)
    {
        double retailPrice = 25000.0;
        double tradeIn = 2000.0;
        double downPayment = 3000.0;
        double financedAmount = retailPrice - tradeIn - downPayment;
        double interest = financedAmount / 10000 * 800;
        double totalFinanced = interest + financedAmount;
        int months = 60;
        double monthlyPayment = totalFinanced / months;

        System.out.println("CAR LOAN PAYMENT APP");
        System.out.println("Retail price of car\t$" + retailPrice);
        System.out.println("\tTrade-in value\t (" + tradeIn + ")");
        System.out.println("\tDown payment\t (" + downPayment + ")");
        System.out.println("Amount to finance\t$" + financedAmount + "\n");
        System.out.println("Interest paid\t\t  " + interest + "\n");
        System.out.println("Total financing\t\t$" + totalFinanced + "\n");
        System.out.println("MONTHLY PAYMENT\t\t$  " + monthlyPayment);
        System.out.println("spread out over " + months + " months");


    }
}
