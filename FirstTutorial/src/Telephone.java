public class Telephone {
String brand;
double screenResolution;
int number;

public Telephone(String brand, double screenResolution, int number) {
    this.brand = brand;
    this.screenResolution = screenResolution;
    this.number = number;
}
public void message (String X,int Y) {
    System.out.println("Send "+ X +" to "+ Y);
}

    public int getNumber() {
        return this.number;
    }
}

