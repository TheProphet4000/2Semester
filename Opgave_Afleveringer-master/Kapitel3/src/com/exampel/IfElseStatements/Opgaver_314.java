package com.exampel.IfElseStatements;

import java.util.Random;

public class Opgaver_314 {
    public static void main(String[] args) {
        Sort(); //3.14.1
        RewriteIf(); //3.14.2
        RandomNumber(); //3.14.4
        IfElse(); //3.14.3
    }

    private static void IfElse() {
        double x = 3 , tax = 4, income = 5, score = 6, scale = 7, number = 8;
        byte i = 1, j = 2;

        if (score > 10){
            score =  scale * 3;
        } else score = scale * 4;

        if (income > 10000){
            income = income * 0.2;
        } else income = income * 0.17 + 1000;

        if (number % 3 == 0){
            System.out.println(i);
        } else System.out.println(j);

    }

    private static void RandomNumber() {
        byte x = (byte)(Math.random()*5);
        System.out.print("3.14.4: The random byte is ");
        System.out.print( (x>2) ? x = 1 : -1);
        //Jeg kan ikke få den her til at virke, lige meget hvor meget jeg tester, og ændre.
        //Fremgangsmåden vil være, at finde et tilfældigt tal, og cast det til en byte 0-9
        //Herefter retunere 1 hvis tallet er over 5, og -1 hvis tallet er under 6
    }

    private static void RewriteIf() {
        short ages = 10;
        short ticketprice = 0;
        System.out.print("3.14.2: the ticket price is ");
        System.out.print((ages >= 16) ? ticketprice = 20 : 10);
        System.out.println(" ");
    }

    private static void Sort() {
        System.out.println("3.1.4: input 2,3,6 gives sorted");
    }
}