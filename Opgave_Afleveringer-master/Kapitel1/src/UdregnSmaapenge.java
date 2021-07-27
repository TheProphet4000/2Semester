import java.util.Scanner;

public class UdregnSmaapenge {
    public static void main(String[] args) {
        UdregnBeloeb();
    }
    public static void UdregnBeloeb(){
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv et tal som double, Feks 12,03: ");
        double Meangte = input.nextDouble();
        int ResterendePenge = (int)(Meangte * 100);

        int AmericanskeDollers = ResterendePenge / 100;
        ResterendePenge = ResterendePenge % 100;

        int MeangteAfQuarters = ResterendePenge / 25;
        ResterendePenge = ResterendePenge % 25;

        int MeangteAfDimes = ResterendePenge / 10;
        ResterendePenge = ResterendePenge % 10;

        int MeangteAfNickles = ResterendePenge / 5;
        ResterendePenge = ResterendePenge % 5;

        int numberOfPennies = ResterendePenge;

        System.out.println("Dit beloeb " + Meangte + " bestoar af");
        System.out.println("    " + AmericanskeDollers + " dollar/dollars");
        System.out.println("    " + MeangteAfQuarters + " quarters ");
        System.out.println("    " + MeangteAfDimes + " dimes");
        System.out.println("    " + MeangteAfNickles + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}