package Kap6;
/*
Write a method that prints numbers using the following header: public static void printNumbers(int num1, int num2, int numberPerLine) Done
This  method  prints  the  characters  between  num1  and  num2  with  the  specified  numbers per line. Done

Write a test program that prints ten characters per line from 1to 100. Done but i wanted to get a random number for each character
Numbers are separated by exactly one space. done
*/

public class Opgave_12 {
    public static void main(String[] args) {
        printNumbers(1,100,10);
    }

    public static void printNumbers(int num1, int num2, int numberPerLine){

        int rand = (int) (Math.random() * (num2 - num1 + 1)) +num1;

        for(int y = 0; y < 2; y++) {
            for(int x = 0; x < numberPerLine; x++) {

                System.out.printf("%3d ", rand);
            }
            System.out.println();
        }
    }

}
