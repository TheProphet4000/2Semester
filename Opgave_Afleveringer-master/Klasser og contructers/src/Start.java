import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Elever nr1 = new Elever();
        nr1.navn = "Mikkel";
        nr1.alder = 20;
        nr1.by = "Næstved";

        System.out.println("Elever oprettet");

        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Hvilket elev ønsker du at se");
            String Find = scan.next();

            switch (Find) {
                case "Mikkel" -> System.out.println(" " + nr1.navn + " på " + nr1.alder);
            }
        }
    }
}