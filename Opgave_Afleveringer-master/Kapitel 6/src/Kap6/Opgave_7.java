package Kap6;
import java.util.Scanner;
public class Opgave_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a Hexidecimal value you wish to translate into Decimal");
        String hexval = in.nextLine();

        System.out.println(" ");
        System.out.println("The translated Decimal value for hexidecimal value " + hexval + " is " + hexToDecimal(hexval.toUpperCase()));
    }

    public static int hexToDecimal(String hexval){

        int decimalValue = 0;

        for (int i = 0; i < hexval.length(); i++) {
            char hexChar = hexval.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return + ch - 'A';
        } else{ return ch - '0'; }
    }
}
