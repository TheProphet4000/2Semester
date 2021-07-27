package MobBingo;

public class TestSuite {
    public static void main(String[] args) {
        tests();
    }

    private static void tests() {
        System.out.println("Test Running: ");

        System.out.print("Test 1 (Health should be 10): ");
        testHealth();
        System.out.println(" ");

        System.out.print("Test 2 (Should contain 2 Milk): ");
        testMilk();
        System.out.println(" ");

        System.out.print("Test 3 (Should drop Meat, leather, and XP on death): ");
        testDrops();
        System.out.println(" ");

    }

    private static void testDrops() {
        CowBase.health = 0;

    }

    private static void testMilk() {
        System.out.println(CowBase.milkAmount);
    }

    private static void testHealth() {
        System.out.println(CowBase.health);
    }
}
