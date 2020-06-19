import java.util.ArrayList;

public class Car implements Comparable<Car> {
    String carModel;
    int year;

    public Car(String carModel, int year) {
        this.carModel = carModel;
        this.year = year;
        ArrayList<Car> cars = new ArrayList();
    }

    public String getCarModel() {
        return carModel;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Car car) {
        return year-car.getYear();
    }
}
