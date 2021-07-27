import java.util.Scanner;

public class UdregnLaan {
    public static void main(String[] args) {
        Laan();
    }
    public static void Laan(){
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Aarligt rante beloeb i $, Feks 2,25: ");
        double aarligeRanter = input.nextDouble();

        //Udregn Rander
        double rander = aarligeRanter / 1200;

        //Input
        System.out.print("Skriv meangten af aar som et heltal, Feks 2: ");
        int antalArr = input.nextInt();
        System.out.print("Skriv meangten af penge du vil laane i $, Feks 12,95: ");
        double laaneBeloeb = input.nextDouble();

        //Udregn beloeb
        double moendligeBetaling = laaneBeloeb * rander / (1
                - 1 / Math.pow(1 + rander, antalArr * 12));
        double BelobIAlt = moendligeBetaling * antalArr * 12;

        //Print Tallet
        System.out.println("Din moandlige betalling i $ er " +
                (int)(moendligeBetaling * 100) / 100.0);
        System.out.println("Den totale betalling i $ er " +
                (int)(BelobIAlt * 100) / 100.0);
    }
}