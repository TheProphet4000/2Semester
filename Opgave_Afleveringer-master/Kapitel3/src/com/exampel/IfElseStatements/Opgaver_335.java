package com.exampel.IfElseStatements;
import java.util.Scanner;

public class Opgaver_335 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int usernumber = input.nextInt();

        System.out.println((usernumber % 2 == 0) ? "Number is even":"Number is odd");
    }
}
