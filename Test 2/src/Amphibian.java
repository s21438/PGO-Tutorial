public class Amphibian implements ObjectMovement {
    public boolean goes;
    public boolean stops;
    public boolean flows;

    @Override
    public void Goes(boolean flag) {
        goes = true;
        flows = false;
        stops = false;
    }

    @Override
    public void Stops(boolean flag) {
        goes = false;
        flows = false;
        stops = true;
    }

    @Override
    public void Flows(boolean flag) {
        goes = false;
        flows = true;
        stops = false;
    }

    @Override
    public void startEngine(boolean flag) {

    }

    @Override
    public void stopEngine(boolean flag) {

    }

    @Override
    public void drivingOn(boolean flag) {

    }

    @Override
    public void drivingOff(boolean flag) {

    }

    @Override
    public void refueling(double refuel_value, double now, double limit) {

    }

    @Override
    public void swimming(boolean swim_flag, double x_new, double y_new, double x, double y) {

    }

    public boolean isGoes() {
        return goes;
    }

    public boolean isStops() {
        return stops;
    }

    public boolean isFlows() {
        return flows;
    }
}
