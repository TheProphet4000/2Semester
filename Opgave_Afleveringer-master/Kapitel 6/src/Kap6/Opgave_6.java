package Kap6;
import java.util.Scanner;

public class Opgave_6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n1 = in.nextInt();

        System.out.print("Enter the second integer: ");
        int n2 = in.nextInt();

        System.out.println("The greatest common divisor for the number " + n1 + " and the number " + n2 + " is " + gcd(n1, n2));
    }

    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
                k++;
            }
        }
        return gcd;
    }
}
