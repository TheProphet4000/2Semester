public class Car {

    private final String car_password;   //final? inellij sagde det var en god ide.
    public float breakAmount;
    public float newBreakAmount;

    public float throttlePosition;
    public float currentRpm;
    public float maxRpm;

    public float steeringAngle;
    public float newAngle;

    public double fuelConsumption;
    public double fuel; //1 er fuld tank

    public int gear;

    public boolean engineOn = false;
    public float engineTempC;

    public boolean airconOn = false;
    public boolean lightsOn = false;

    Car() { //giver bilerne start atributter
        this.car_password = "pass";
        this.engineOn = false;
        this.throttlePosition = 0;
        this.currentRpm = 0;
        this.fuelConsumption = 0.1;
        this.maxRpm = 3000;
        this.engineTempC = 15;
        this.fuel = 0;
        this.gear = 0;
        this.airconOn = false;
        this.lightsOn = false;
        this.steeringAngle = 0; //positive grader er til højer, samt negative er til venstre
        this.breakAmount = 0;
    } //Bilen er stillestående og slukket

    public void setSteeringAngle(float newAngle){
        steeringAngle = newAngle;
    }

    public void turnEngineOn(CarKey key) {

        if (key.key_password.equals(car_password)) {
            System.out.println("The engine is turned on ");
            engineOn = true;
            engineTempC = 100;

        } else { System.out.println("Can't start the engine due to password error "); }
    }

    public void turnEngineOff(CarKey key) {
        if (key.key_password.equals(car_password)) {
            System.out.println("The engine is turned off ");
            engineOn = false;
            engineTempC = 80;

        } else { System.out.println("You need the key to do anything, password error "); }
    }

    public void turnOnSecurityAndComfort(){
        airconOn = true;
        lightsOn = true;
    }

    public void turnOffSecurityAndComfort(){
        airconOn = false;
        lightsOn = false;
    }

    public void throttlePosition(float newThrottlePosition) {

        throttlePosition = newThrottlePosition;

        currentRpm = throttlePosition * 10;
        engineTempC = engineTempC * currentRpm + 10; //ikke realistisk men har ikke nogle kilder, eller bil
        fuel = fuel-fuelConsumption;

        if (currentRpm >= maxRpm){
            currentRpm = maxRpm;
            engineTempC = 200;
        }
        if (currentRpm <= 0){
            currentRpm = 0;
        }
    }

    public void setGear(int newgear){
        gear = newgear;
    }

    public void reFuel(double addFuel){
        fuel = fuel + addFuel;
        if (fuel > 100){
            System.out.println("Ohhhh noooo there is fuel everywhere... you pumped to much fuel in the car");
        }
    }

    public void breaks (float newBreakAmount){
        breakAmount = newBreakAmount;
    }

    public void createCar (int carAmount){
        Car[] cars = new Car[carAmount]; //laver en array klasse der indenholder Car med atributter sat på

        for (int i = 1; i < carAmount; i++) { //i er et tal der går op
            cars[i] = new Car(); //laver en bil med ID som i
            System.out.println("Dette er bil ved navn og nummer: "+cars[i].toString());
            System.out.println(i);

            cars[i].reFuel(100); //fylder benzin på alle bilerne
            System.out.println("Dette er mængten at benzin i denne bil: "+cars[i].fuel);
            System.out.println(" ");
        }
    }

}
