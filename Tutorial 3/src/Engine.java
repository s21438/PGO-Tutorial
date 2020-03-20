public class Engine {
    double power;
    int productionYear;

    public Engine(double power,int productionYear) {
        this.power=power;
        this.productionYear=productionYear;
    }
    public void message2(double power,int productionYear) {
        System.out.println("The power of the Engine is "+power+" and the production year is "
        +productionYear);
    }

    public double getPower() { return power; }
    public int getProductionYear() { return productionYear; }
}
