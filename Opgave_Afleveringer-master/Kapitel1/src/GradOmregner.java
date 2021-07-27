import java.util.Scanner;

public class GradOmregner {
    public static void main(String[] args) {
        CelsiusTilFehrenheit();
    }

    public static void CelsiusTilFehrenheit(){
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv en tempertur i Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // omregn og print
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + " grader Fahrenheit " + " er " + celsius + " grader Celsius");
    }
}