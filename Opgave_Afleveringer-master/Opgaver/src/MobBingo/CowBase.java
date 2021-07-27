package MobBingo;

public class CowBase {
    public static short health = 10;
    public static byte moveBlocks = 1;
    public static byte milkAmount = 2;

    public static void main(String[] args) {
        healthHandler();
        death();
        movement();
    }

    private static void movement() {
        byte move = moveBlocks;
    }

    private static void healthHandler() {
        if (health < 1){
            death();
        }
    }
    private static void death() {
        System.out.println("Muuuuuuuuuuuuh");
        System.out.println("Cow drops some raw beef, leather, and XP");
    }
}
