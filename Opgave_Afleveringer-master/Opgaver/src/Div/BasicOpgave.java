package Div;

public class BasicOpgave { //Navnet på Class

    public static int Dyr = 10;
    public static double Bure = 2.5;
    public static double AlleDyr;
    public static String text1 = "Der var";
    public static String text2 = "typer af dyr, i denne Zoo.";

    public static void main(String[] args) {
        Calculate();
        PrintVars();
    }

    public static void Calculate(){
        AlleDyr += Dyr * Bure;
    }

    public static void PrintVars(){
        System.out.print(text1 + " " + AlleDyr +  " " +text2);
    }
}
