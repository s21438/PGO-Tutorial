import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        Telephone Mobile = new Telephone("Samsung", 5.5,
                344634646);
        int Number1 = Mobile.getNumber();
        String message1 = "Hi man";
        Mobile.message(message1, Number1);

        Car Vehicle = new Car("Red", "Ferrari", 5.0);
        String brand = Vehicle.getBrand();
        String color = Vehicle.getColor();
        double engineCapacity = Vehicle.getEngineCapacity();
        Vehicle.information(color, brand, engineCapacity);


        double newEngineCapacity = 6.0;
        Vehicle.modificationOfEngineCapacity(newEngineCapacity);
        System.out.println("Give the volume");
        double volume=in.nextDouble();
        if (volume>=6.0) {
            System.out.println("The Ferrari is Highspeed");
        } else {
            System.out.println("The Ferrari is Lowspeed");
        }
    }
}

