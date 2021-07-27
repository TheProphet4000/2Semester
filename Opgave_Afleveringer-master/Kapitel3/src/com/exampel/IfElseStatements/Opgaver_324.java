package com.exampel.IfElseStatements;
import java.util.Random;
import java.util.Scanner;

public class Opgaver_324 {
    public static void main(String[] args) {
        CardGame();
    }

    private static void CardGame() {
        System.out.println("Opgave 3.24:  -------------Start---------------");
        System.out.println("Hello there my name Romaine, so you wanna play a card game?");
        System.out.println(" ");
        System.out.println("Okay let's play a simple game, i shuffle the cards and you pick one");
        System.out.println("What card from 1 to 13 do you want to take off my hand?");
        //------------------------program-----------------
        int cardmin = 1, cardmax = 13;
        int suitmin = 1, suitmax = 4;
        String cardname, suitname;

        int card = (int)(Math.random()*(cardmax-cardmin+1)+cardmin);
        int suit = (int)(Math.random()*(suitmax-suitmin+1)+suitmin);
        //------------------Cards-------------------------
        if (card == 1){
            cardname = "Ace";
        } else if (card == 11){
            cardname = "Jack";
        } else if (card == 12){
            cardname = "Queen";
        } else if (card == 13){
            cardname = "King";
        } else {
            cardname = String.valueOf(card);
        }
        //-------------------Suits------------------------
        if (suit == 1){
            suitname = "Diamonds";
        } else if (suit == 2){
            suitname = "Clubs";
        } else if (suit == 3){
            suitname = "Hearts";
        } else {
            suitname = "Spades";
        }
        //-------------------bruger-----------------------
        Scanner input = new Scanner(System.in);
        int pickedcard = input.nextInt(); //simulere at brugeren trækkede et kort, selvom det ikke gør noget i sidste ende

        System.out.println("So you picked card number " + pickedcard + " I'll now show you the card");
        System.out.println(" ");
        System.out.println("The card is " + cardname + " of " + suitname + " ,This is your lucky card");
        System.out.println(" --------------------------Restart----------------------------------- ");
    }
}
