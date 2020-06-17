public class Ship extends Vehicle {
    double x;
    double y;

    public Ship(double tankCapacityMax, int numberOfPlaces, boolean engineOn, double tankCapacityNow) {
        super(tankCapacityMax, numberOfPlaces, engineOn, tankCapacityNow);
    }

    @Override
    public void drivingOn(boolean flag) {

    }

    @Override
    public void drivingOff(boolean flag) {

    }

    @Override
    public void swimming(boolean swim_flag, double x_new, double y_new, double x, double y) {
        if (swim_flag=false) {
            swim_flag = true;
            if(x_new > 0 & y_new > 0){
                x = x_new;
                y = y_new;
            }
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
