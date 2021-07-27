package Kap6;
/*
Use the methods in RandomCharacter in Listing 6.10 to
print 200 uppercase letters and then 200 single digits,
printing ten per line
 */

public class Opgave_38 {
    public static void main(String[] args) {
        printUpper();
        printDigit();
    }
//--------------------------------setup----------------------------------------
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
//----------------------------------play with these-----------------------------------------
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

//----------------------------useless------------------------
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
//-----------------------------------------------------------

    public static void printUpper(){
        for(int u = 1; u < 201; u++) {
            System.out.print(getRandomUpperCaseLetter());
            if (u % 10 == 0){
                System.out.println(" ");
            }
        }
    }

    public static void printDigit(){
        for(int l = 1; l < 201; l++) {
            System.out.print(getRandomDigitCharacter());
            if (l % 10 == 0){
                System.out.println(" ");
            }
        }
    }
}
