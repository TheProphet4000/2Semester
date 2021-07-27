import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your annual interest rate");
        double annualInterestRate = input.nextDouble();

        System.out.println("Please enter the number of years your loan is" + " in whole numbers");
        int numberOfYears = input.nextInt();

        System.out.println("Please enter the amount of money you borrowed");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan (annualInterestRate, numberOfYears,loanAmount);

        System.out.printf("Y>our loan was created on %s\n" + " and your monthly payment is %.2f\n So the total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}
