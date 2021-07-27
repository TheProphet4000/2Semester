public class Start {
    public static void main(String[] args) {
        System.out.println("Opfindelser: ");
        System.out.println(" 1 et ur der hiver ens dyne af, og spiller en morgen besked, når det ringer");
        System.out.println(" 2 en maskine der brykker kaffe, når man kalder på kaffe");
        System.out.println(" 3 en ai man kan snakke med, og fortælle jokes");
        System.out.println("   Hvis jeg skulle designe et smarthome, ville det gøre alt for mig. Jeg ville blot være ham der styre tiderne.  Dynens stemme skal være dirks linje fra støv på hjernen");
        System.out.println("En program som dette, skal tænde et relæ til kaffemaskinen, når tiderne matcher");
        System.out.println("");

        CoffeOnTheSpot();
    }

    private static void CoffeOnTheSpot() {
        double coffetime = 12.30;
        double currenttime = 12.31;
        boolean makecoffe = false;

        System.out.println((coffetime == currenttime)? makecoffe = true: false);
        System.out.println((makecoffe == true)? "Lets make coffe": "Wait til coffetime matches current time");
    }
}
