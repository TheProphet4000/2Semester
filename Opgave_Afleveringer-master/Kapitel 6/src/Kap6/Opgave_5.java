package Kap6;

public class Opgave_5 {
    public static void main(String[] args) {
        lPrint("Hej",10);
    }

    private static void lPrint(String text, int l) {
        for (int i = 0; i < l; i++) {
            System.out.println(text + " Number " + i);
        }
    }
}
