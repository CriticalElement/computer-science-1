// Name: Pranav Pakanati
// Period: Jarrell 2B

public class SalariesAPP
{
    public static void main(String[] args)
    {
        double hourlyRate = 10.0;
        double hoursWorked = 40.0;
        double overtimeHours = 10.0;
        double totalSalary = hoursWorked * hourlyRate;
        totalSalary += 1.5 * hourlyRate * overtimeHours;

        System.out.println("Hourly rate >>> $" + hourlyRate);
        System.out.println("Regular hours worked >>> " + hoursWorked);
        System.out.println("Overtime hours worked >>> " + overtimeHours + "\n");
        System.out.println("Gross salary (total, before taxes) >>> $" + totalSalary);
        double taxRate = 0.25;
        double netSalary = totalSalary - totalSalary * taxRate;
        System.out.println("Net salary (after taxes) >>> $" + netSalary);
    }
}
