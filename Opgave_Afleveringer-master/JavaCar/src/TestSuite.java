import java.awt.*;

class CarTest {

    public static void main(String[] args) {
        testSuite();
    }

    private static void testSuite() {
        System.out.println("Test Running: ");

        System.out.print("Test 1 (Engine should be on): ");
        testStartCarWithCorrectKey();
        System.out.println(" ");

        System.out.print("Test 2 (Engine should be off): ");
        testTurnoffCar();
        System.out.println(" ");

        System.out.print("Test 3 (Key should make an error): ");
        keyError();
        System.out.println(" ");

        System.out.print("Test 4 (The Car should turn left/right, some degree in either + or -): ");
        testSteering();
        System.out.println(" ");

        System.out.print("Test 5 (The throttleposition should be 1.0/max): ");
        testThrottle();
        System.out.println(" ");

        System.out.print("Test 6 (The Car should breake a little, 10.0 is max): ");
        testBreaks();
        System.out.println(" ");

        System.out.print("Test 7 (Gear should be 1): ");
        testGears();
        System.out.println(" ");

        System.out.print("Test 8 (The car should NOT have a full tank of 100): ");
        checkFuel();
        System.out.println(" ");

        System.out.print("Test 9 (The car should be Refueled): ");
        refuel();
        System.out.println(" ");

        System.out.print("Test 10 (Lights and aircon should be on): ");
        testElectricStuff();
        System.out.println(" ");

        System.out.print("Test 11 (Light and aircon should be off): ");
        turnOffElectric();
        System.out.println(" ");

        System.out.print("Test 12 (The breakes should be 2.0 down): ");
        testBreaks();
        System.out.println(" ");

        System.out.print("Test 13 (Colour should be ScarletRed): ");
        TestColour();
        System.out.println(" ");

        System.out.print("Test 14 (TransmitionType should be Automatic): ");
        testTransmitionType();
        System.out.println(" ");

        System.out.print("Test 15 (Company should be Renault): ");
        testCompany();
        System.out.println(" ");

        System.out.print("Test 16 (Should make many cars): ");
        makeManyCars();
        System.out.println(" ");
    }

    private static void makeManyCars() {
        Car productionCode = new Car();
        productionCode.createCar(1000001); //vi tilføjer 1 fordi den kun laver op til 99999
    }

    private static void testCompany() {
        Car renault = new Car();

        System.out.print("The car company of this car is ");
        System.out.println(" ");
    }

    private static void testTransmitionType() {
        Car renault = new Car();
        TransmitionType type = TransmitionType.Automatic;
        System.out.print("The Transmition type is "+type);
        System.out.println(" ");
    }

    private static void TestColour() {
        Car renault = new Car();
        ChasisColour color = ChasisColour.ScarletRed;
        System.out.print("The colour of this car is " + color);
        System.out.println(" ");
    }

    private static void turnOffElectric() {
        Car renault = new Car();
        Company maker = Company.Corvette;
        renault.turnOffSecurityAndComfort();
        System.out.print("The maker of this car is " + maker); //Hva?
        System.out.println(" ");
    }

    private static void testElectricStuff() {
        Car renault = new Car();

        renault.turnOnSecurityAndComfort();
        System.out.print("Airconditioner is "+ renault.airconOn + " and lights are "+ renault.lightsOn);
        System.out.println(" ");
    }

    private static void checkFuel() {
        Car renault = new Car();
        
        System.out.print("Amount of fuel is "+ renault.fuel);
        System.out.println(" ");
    }

    private static void testThrottle() {
        Car renault = new Car();
        CarKey key = new CarKey("pass");

        renault.throttlePosition(1); //Vrooom
        System.out.print("Throttleposition is "+renault.throttlePosition);
        System.out.println(" ");
    }


    private static void testGears() {
        Car renault = new Car();

        renault.setGear(1);
        System.out.print("Current gearconfiguration is "+renault.gear);
        System.out.println(" ");
    }

    private static void testBreaks() {
        Car renault = new Car();

        renault.breaks(2);
        System.out.print("The breakes are pushed "+renault.breakAmount+ " down");
        System.out.println(" ");
    }

    private static void refuel() {
        Car renault = new Car();

        renault.reFuel(100);
        System.out.print("Amount of fuel is "+ renault.fuel);
        System.out.println(" ");
    }

    private static void testStartCarWithCorrectKey() {
        Car renault = new Car();
        CarKey key = new CarKey("pass");

        renault.turnEngineOn(key);
    }

    private static void testTurnoffCar() {
        Car renault = new Car();
        CarKey key = new CarKey("pass");

        renault.turnEngineOff(key);
    }

    public static void keyError() {
        Car renault = new Car();
        CarKey key = new CarKey("Wrong");

        renault.turnEngineOn(key);
    }

    private static void testSteering() {
        Car renault = new Car();

        renault.setSteeringAngle(10);
        System.out.print("Steering angle is "+renault.steeringAngle);
        System.out.println(" ");
    }


}