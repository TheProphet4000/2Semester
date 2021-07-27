package MobBingo;

import java.util.Random;

public class Spawner {

    public static byte spawnAmount = 3;

    public static void main(String[] args) {
        randomAmount(spawnAmount);
        spawn();
    }

    private static Random randomAmount(byte spawnAmount) {
        Random rand = new Random();
        return rand; //HADER RANDOM, kan aldrig få det til at virke
        //Prøvede at spawne et tilfældigt antal køer med 3 maximum spawns
    }

    private static void spawn() {
        System.out.println("1 Cow has spawned");
    }
}
