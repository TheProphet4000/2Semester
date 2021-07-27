package ArrayXYZopgave;

import java.util.*;

public class ArrayXYZ {

    public static byte x = 5;
    public static short y = 3;

    String[] arrayX = {"Red", "Blue", "SapphireGreen", "MetalBlue", "ScarletRed"};
    int[] arrayY = new int[y];

    public static void main(String[] args) {

        getNumber();

        for (int i = 0; i != y ; i++) { //y instillet
            getNumber();

        }

    }

    public static int getNumber() { //y generaret
        Random rand = new Random();
        return rand.nextInt(x);
    }
}
