package com.exampel.IfElseStatements;

public class Opgaver_34 {
    public static void main(String[] args) {
        GreaterThen90();
        GreaterThen90Part2();
    }

    public static void GreaterThen90() {

        double score = 100;
        double percentage = 3.0;
        double Payout;

        if (score > 90) {
            double x = score / 100; //Finder bet i %
            double y = x * percentage; // finder total procent
            Payout = score + y; //lægger procenter til bet
            System.out.println("3.4.1: pay = " + Payout);
        }

    }

    public static void GreaterThen90Part2() {

        double score = 1;
        double payout;

        if (score > 90) {
            double percentage = 3.0;
            double x = score / 100; //Laver score om til procent
            double y = x * percentage; // finder total procent
            payout = score + y; //lægger procenter til bet

            System.out.println("3.4.2: Payout = " + payout);

        } else {
            double percentage = 1.0;
            double x = score / 100; //Laver score om til procent
            double y = x * percentage; // finder total procent
            payout = score + y; //lægger procenter til bet

            System.out.println("3.4.2: Payout = " + payout);
        }
    }
}