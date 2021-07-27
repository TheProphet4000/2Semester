package Div;

public class IfElseSwitch {
    public static void main(String[] args) {
        short x = 2;
        short y = 20;

        if (x < y) {
            System.out.println("X = " + x);
        } else {
            System.out.println("Y = " + y);
        }


        switch (x) {
            case 1 -> System.out.println("Hej");
            case 2 -> System.out.println("Med");
            case 3 -> System.out.println("Dig");
            case 4 -> System.out.println("!");
        }
    }
}
