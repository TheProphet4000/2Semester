package Kap6;

public class Opgave_2 {
    public static void main(String[] args) {
        testMetode();
    }

    public static int sumDigits(long n){
        int result = 0;

        while (true){

            result += (int) (n % 10);
            n = n/10;

            if (n/10 == 0){
                result += n;
                break;
            }
        }
        return result;
    }

    static void testMetode(){
        System.out.printf("234 skal give 9, og det giver: %d", sumDigits(234));
        System.out.println(" ");
        System.out.printf("10000 skal give 1, og det giver: %d", sumDigits(10000));
    }

}
