import java.util.ArrayList;

public class Garage {
    int maxCapacity;
    int numberOfCars;
    ArrayList<Car> listOfCars = new ArrayList<>();

    public void addCar(Car newCar,ArrayList<Car> list, int numberOfCars, int maxCapacity) throws ExceptionGarageFull {
        int newNumber;
        newNumber = numberOfCars + 1;
        if (newNumber <= maxCapacity){
            numberOfCars = newNumber;
            list.add(newCar);
        }else{
            System.out.println("Garage is full and no more cars can be added!");
            throw new ExceptionGarageFull(maxCapacity);
        }
    }
}
