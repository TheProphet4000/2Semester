package Div;

public class DocJavaOpgaver { //Navnet på Class
    public static void main(String[] args) { //void start
        Opgave1();
        Opgave2();
        Opgave3();
        Opgave4();
        Opgave5();
    }
    public static void Opgave1(){

        //Standard variabler----------------------------------
        int x = 5;
        int y = 8;
        int z = 3;

        //Opgave A: Udfra irl udregning med standard variabler, er det sandt
        boolean a = x <=x && z!=y;

        //Opgave B: Udfra irl udregning med standard variabler, er det sandt
        boolean b = x == 5||x == y && z==3;

        //Opgave C: Udfra irl udregning med standard variabler, er det falsk
        boolean c = x/y>z/x;

        //Opgave D: Udfra irl udregning med standard variabler, er det falsk
        boolean d = !(x!=y-z) == false;

        //Opgave E: Udfra irl udregningmed standard variabler, er det sandt
        boolean e = 2 * x != x || x == 0;

        //Opgave F: Udfra irl udregningmed standard variabler, er det sandt
        boolean f = ! true || ! false;

        //TESTS-------------------------------------
        System.out.println("Opgave 1");
        //Test A___________________________
        if (a == true){
            System.out.println("A: " + a);
        } else {
            System.out.println("A: " + a);
        }

        //Test B___________________________
        if (b == true){
            System.out.println("B: " + b);
        } else {
            System.out.println("B: " + b);
        }
        //_________________________________
        //Test C___________________________
        if (c == true){
            System.out.println("C: " + c);
        } else {
            System.out.println("C: " + c);
        }
        //_________________________________
        //Test D___________________________
        if (d == true){
            System.out.println("D: " + d);
        } else {
            System.out.println("D: " + d);
        }
        //_________________________________
        //Test E___________________________
        if (e == true){
            System.out.println("E: " + e);
        } else {
            System.out.println("E: " + e);
        }
        //_________________________________
        //Test F___________________________
        if (f == true){
            System.out.println("F: " + f);
        } else {
            System.out.println("F: " + f);
        }
        //_________________________________
        System.out.println("__________");
    }
    public static void Opgave2 (){ //void start

        int x = 41;
        int y = 67;

        System.out.println("Opgave 2");
        if(x+y>100){
            System.out.println("Summen er større end hundrede");
        }else{
            System.out.println("Summen er mindre end hundrede");
        }
        System.out.println("----------");
    }
    public static void Opgave3(){
        int Ko = 47;
        int Kylling = 21;

        System.out.println("Opgave 3");
        if(Ko > Kylling){
            System.out.println("Ko er størst");
        }else{
            System.out.println("Kylling er størst");
        }
        System.out.println("----------");
    }
    public static void Opgave4(){
        int Ko = 47;
        int Kylling = 69;
        int Menneske = 42;

        System.out.println("Opgave 4");
        if (Ko > Kylling && Ko > Menneske){
            System.out.println("Ko er størst");
        } else if (Kylling > Ko && Kylling > Menneske){
            System.out.println("Kylling er størst");
        } else if (Menneske > Ko && Menneske > Kylling){
            System.out.println("Menneske er størst");
        }
        System.out.println("----------");
    }
    public static void Opgave5(){

    }
}
