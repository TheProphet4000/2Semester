import java.util.*; //* er et wildcard, så den tager alle ting i util.
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {

        //input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble(); //hvis den modtager tal, melder den fejl.

        //udregn og vis output
        double area = radius * radius * 3.14159;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}