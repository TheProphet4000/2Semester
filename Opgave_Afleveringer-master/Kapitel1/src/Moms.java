import java.util.Scanner;
public class Moms {
    public static void main(String[] args) {
        // Vil have den til at udregne den danske, og tyske moms med kun et input.
        // Men kan ikke få en variable inden i Main(), ført vidre til PlusDanskMoms(), og PlusTyskMoms().
        plusDanskMoms();
        plusTyskMoms();
    }

    public static void plusDanskMoms() {

        Scanner input = new Scanner(System.in);
        System.out.print("Indtast det Danske beløb du ønsker at finde moms af (Uden Kr til sidst): ");

        double Koebsmaengte = input.nextDouble();
        double Danskmoms = Koebsmaengte * 0.25;

        System.out.println("Momsen af dit Danske beløb er " + (int)(Danskmoms * 100) / 100.0 + " DKK");
    }
    public static void plusTyskMoms() {

        Scanner input = new Scanner(System.in);
        System.out.print("Indtast det Tyske beløb du ønsker at finde moms af (Uden DEM til sidst): ");

        double Koebsmaengte = input.nextDouble();
        double Tyskmoms = Koebsmaengte * 0.16;

        System.out.println("Momsen af dit Tyske beløb er " + (int)(Tyskmoms * 100) / 100.0 + " DEM");
    }
}