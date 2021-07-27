package Grønhandleren;

import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Main {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.stykpris = 2;
        a.holdbarhed = new Date(1608768000);

        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);

        Agurker ag = new Agurker();
        ag.stykpris = 5;
        ag.forhandelbar = true;
        ag.holdbarhed = new Date (1608768001);

        Tulipaner t = new Tulipaner();
        t.stykpris = 20;
        t.blomstre = false;
        t.farve = ("Blå");
        t.forhandelbar = true;

        VareListe vis = new VareListe();
        vis.opteldning();

    }

}
