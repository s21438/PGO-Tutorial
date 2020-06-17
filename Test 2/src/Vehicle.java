public abstract class Vehicle implements Object {
    double tankCapacityMax;
    int numberOfPlaces;
    boolean engineOn;
    double tankCapacityNow;
    boolean drive;


    @Override
    public void startEngine(boolean engineOn) throws ExceptionEngineStarted{
        if (engineOn = true) {
            System.out.println("Engine was already started!");
            throw new ExceptionEngineStarted(true);
        } else {
            engineOn = true;
        }
    }

    @Override
    public void stopEngine(boolean engineOn) {
        if (engineOn = false) {

        } else {
            engineOn = false;
        }

    }

    @Override
    public void refueling(double refuel_value, double tankCapacityNow, double tankCapacityMax) {
        if (refuel_value+tankCapacityNow<= tankCapacityMax) {
            tankCapacityNow+=refuel_value;
        }
        else{
            System.out.println("It's full");
        }
    }

    public Vehicle(double tankCapacityMax, int numberOfPlaces, boolean engineOn, double tankCapacityNow) {
        this.tankCapacityMax = tankCapacityMax;
        this.numberOfPlaces = numberOfPlaces;
        this.engineOn = engineOn;
        this.tankCapacityNow = tankCapacityNow;
    }

    public double getTankCapacityMax() {
        return tankCapacityMax;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public double getTankCapacityNow() {
        return tankCapacityNow;
    }
}
