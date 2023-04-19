@SuppressWarnings("WeakerAccess")
public class BankAccount
{
    public double balance;
    public String name;

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double money) {
        balance += money;
    }

    public void withdraw(double money) {
        balance -= money;
    }
}
