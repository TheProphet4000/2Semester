package com.exampel.IfElseStatements;

public class Opgaver_36 {
    public static void main(String[] args) {
        WichAreEquivalent();
        RewriteStatement();
        WichOneIsBetter();
        WhatAreTheOutput();
    }

    private static void WhatAreTheOutput() {
        System.out.println("3.6.4: A for 14 is even, 15 is multiple of 5, 30 is even AND is multiple of 5");
    }

    private static void WichOneIsBetter() {
        System.out.println("3.6.3: Both are correct but B is easier to read");
    }

    private static void RewriteStatement() {
        short count = 10;
        boolean newline = false;

        if (count % 10 == 0 ){
            newline = true;
            if (newline){
                System.out.println("3.6.2: " + count + " is a round number");
            }
        } else { System.out.println("3.6.2: " + count + " is not a round number");}
    }

    private static void WichAreEquivalent() {
        System.out.println("3.6.1: B, C, D, is equivalent but have diffrent outputs");
    }
}
