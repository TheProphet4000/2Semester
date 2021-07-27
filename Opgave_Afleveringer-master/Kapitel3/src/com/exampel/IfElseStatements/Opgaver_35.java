package com.exampel.IfElseStatements;

public class Opgaver_35 {
    public static void main(String[] args) {
        WhatHappends();
        FixTheCode();
    }

    public static void WhatHappends() {

        byte x = 3;
        byte y = 3;
        if (x > 2)if (y > 2) {int z = x + y;
            System.out.println("z is " + z);
        }else  System.out.println("x is " + x);
        System.out.println("3.5.2: x = 2, y = 3: Nothing is printed");
        System.out.println("3.5.2: x = 3, y = 2: prints x is 3");
        System.out.println("3.5.2: x = 3, y = 2: prints z is 6");
    }

    public static void FixTheCode(){

        int score = 80; //Variablen var ikke declared
        if (score >= 60)  System.out.println("3.5.3: D");
        else if (score >= 70)  System.out.println("3.5.3: C");
        else if (score >= 80)  System.out.println("3.5.3: B");
        else if (score >= 90)  System.out.println("3.5.3: A");
        else  System.out.println("F");
        System.out.println("3.5.3: The varible score was not declared");
    }
}

