public class Car {
    String color;
    String brand;
    double engineCapacity;

    public Car(String color,String brand,double engineCapacity) {
        this.color=color;
        this.brand=brand;
        this.engineCapacity=engineCapacity;

    }
    public void information (String color,String brand,double engineCapacity) {
        System.out.println("The car is " +color+ " and the brand is "+brand+
                " with an engine capacity of "+ engineCapacity);
    }
    public String getBrand() {
        return this.brand;
    }
    public String getColor() {
        return this.color;
    }
    public double getEngineCapacity(){
        return this.engineCapacity;
    }
    public void modificationOfEngineCapacity (double newEngineCapacity) {
        System.out.println("There is a modification of the Engine Capacity: " + newEngineCapacity);
    }


    }


