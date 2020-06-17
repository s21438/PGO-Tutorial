public interface Object {
    void startEngine(boolean flag) throws ExceptionEngineStarted;
    void stopEngine(boolean flag);
    void drivingOn(boolean flag);
    void drivingOff(boolean flag);
    void refueling(double refuel_value, double now, double limit);
    void swimming(boolean swim_flag, double x_new, double y_new, double x, double y);

}
