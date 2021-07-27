import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {


    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomPigeNavne property OBS: randomPigeNavne skal forblive private!

    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)

    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen

    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det

    // TODO 6 - Skriv en test til randomName() metoden

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)

    // TODO 8 - Skriv en  plet eller krone generator metode (plet er boolean true og krone er boolean false)

    public static void main(String[] args) {
        randomBoyAndGirlNames();
    }

    private static void randomBoyAndGirlNames() { //fik adgang til navne, og mangler nu at lave en array

        int antalNavne = 3; //får altid *2, der man både har drenge og pige navne
        //String pigeOgDrengeNavne[]; Vil gerne have smidt alle navne ind i en array, så der kommer et tilfældigt navn ved hvert array.

        for (int i = 0; i != antalNavne; i++) {
            System.out.println(Data.randomBoyName());
            System.out.println(Data.randomGirlName());
        }
    }

}
