public class Airplane {
    String brand;
    int numberOfSeats;

    public Airplane(String brand,int numberOfSeats) {
        this.brand=brand;
        this.numberOfSeats=numberOfSeats;
    }
    public void message(String brand,int numberOfSeats) {
        System.out.println("The Airplane is "+brand+" and the number of seats are "
        +numberOfSeats);
    }
    public String getBrand() {
        return this.brand;
    }
    public int getNumberOfSeats() { return numberOfSeats; }
}
