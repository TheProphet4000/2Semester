// 1.Variable (instansvariable, klassevariable)                                                                     DONE
// 2.Klasser og objekter (constructors, getters & setters, enum, metoder)              Mangler enums
// 3.Nedarvning, interface                                                                                          DONE
// 4.Kontrolstrukturer (if, switch & 2 slags løkker)                                   Mangler if
// 5.Array og ArrayList                                                                                             DONE
// 6.Exceptions (try/catch)                                                                                         DONE
// 7.GUI                                                                               Mangler GUI
// 8.Persistens (gemme i- / læse fra en fil)                                           Mangler save/load
// 9.Unit test (jUnit assertions)                                                                                   DONE
// 10.Algoritmer: Eksempel på søgning eller sortering                                  Mangler sortering
// 11.Dokumentation og versionsstyring                                                                              DONE

import java.util.ArrayList;
import java.util.Scanner;

public class Selector{

    public static void main(String[] args) {

        run();
    }

    static void run(){ //køre programmet, og laver en arraylist der viser hvor mange opskrifter, der er
        byte page; //en variable som kan holde en lille tal... i forhold til int
        ArrayList<String> latestRecipe = new ArrayList<>(3);
        latestRecipe.add(0," ");
        latestRecipe.add(1," ");
        latestRecipe.add(2," ");
        System.out.println("there is " + latestRecipe.size() + " Recipies in this book");

        Scanner scan = new Scanner(System.in);
        System.out.println("What page will you lookup: (Type ( 1 ) if you want to open page one )");

        try { //fanger småfejl brugeren kan lave
            page = scan.nextByte();

        switch (page) { //en switch, som jeg bruger som en form af virtuelle sider, i en kogebog
            case 1 -> {
                Recipy show = new Recipy();
                show.showGlaze();

                latestRecipe.set(0,"Glaze");

                run();
            }
            case 2 -> {
                Recipy show = new Recipy();
                show.showLemonTea();

                latestRecipe.set(1,"Lemon Tea");

                run();
            }
            case 3 -> {
                Recipy show = new Recipy();
                show.showPggb();

                latestRecipe.set(2,"Pan Galactic Gargle Blaster");

                run();
            }
            default ->{ //hvis brugeren vil have en side der ikke eksitere, fortæl dem det
                System.out.println("This page doesn't exist, try a lower number..  ");
                System.out.println(" ");
                System.out.println(" ");
                run();
            }

        }
        }catch (Exception e) { //hvis brugeren ikke skriver et nummer, fortæl dem det
            System.out.println("Type a number, not a letter... try again");
            System.out.println(" ");
            System.out.println(" ");
            run();
        }
    }
}
