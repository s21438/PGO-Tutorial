public class Car extends Vehicle {
    public boolean drive;
    public double maxSpeed;

    public Car(double tankCapacityMax, int numberOfPlaces, boolean engineOn, double tankCapacityNow, boolean drive, double maxSpeed) {
        super(tankCapacityMax, numberOfPlaces, engineOn, tankCapacityNow);
        this.drive = drive;
        this.maxSpeed = maxSpeed;
    }

    public Car(double tankCapacityMax, int numberOfPlaces, boolean engineOn, double tankCapacityNow) {
        super(tankCapacityMax, numberOfPlaces, engineOn, tankCapacityNow);
    }

    @Override
    public void drivingOn(boolean drive) {
        drive = true;
    }

    @Override
    public void drivingOff(boolean drive) {
        drive = false;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void swimming(boolean swim_flag, double x_new, double y_new, double x, double y){
        swim_flag = false;
        x = 0;
        y = 0;
        System.out.println("The car is not able to swim!");
    }
}
