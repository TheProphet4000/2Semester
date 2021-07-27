public class Test {
    public static void main(String[] args) {
        //double i = 50.0;
        //double k = i + 50.0;
        //double j = k+i;

        int i = 50; // der er ikke nogle grund til double, når det kun er hele tal. Double fylder mere end int.
        int k = i *2;  // her kan man sige i * 2
        int j = k+i; // 100 + 50 = 150
        System.out.println("j is "+j+" and k is "+k); //variablerne er uoverskuelige
    }
}
