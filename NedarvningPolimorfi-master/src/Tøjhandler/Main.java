package Tøjhandler;

import java.util.Date;


public class Main {

    public static void main(String[] args) {

        Kjoler k = new Kjoler();
        k.pris = 1000;
        k.indkøbt = new Date(1608768000);
        k.farve = ("pink");
        k.stoerrelse = ("S");
        k.udstil();

        Jakker j = new Jakker();
        j.pris = 500;
        j.indkøbt = new Date(1608768010);
        j.stoerrelse = ("L");
        j.type = ("Bomuld");
        j.udstil();


        Jakkeseat js = new Jakkeseat();
        js.pris = 1500;
        js.indkøbt = new Date(1608768050);
        js.farve = ("Grøn");
        js.stoerrelse = ("S");
        js.udstil();
    }

}
