public class Test {
    public static void main(String[] args) {
        System.out.println("Begin tests");
        findTests();
        test1();
    }

    private static void findTests() {
        int[] numberOfTests = {1}; //laver et array kaldt numberOfTests med et element

        for (int i:numberOfTests) { //køre dette det antal gange, der er et element i numberOfTests og viser det med variablen i
            System.out.println("there is " +i+ " tests");
            System.out.println("Showing tests");
            System.out.println(" ");
        }
    }


    private static void test1() {
        boolean working = false;
        while (!working) { //laver et while loop, der stopper når testen er kørt eller working er sandt
            System.out.println("test 1: Show all recipes. there should be 3 recipies");
            Recipy show = new Recipy(); //er dette ikke en sætter.. jeg vil sige det er
            show.showLemonTea();
            show.showGlaze();
            show.showPggb();

            break;
        }
    }
}
