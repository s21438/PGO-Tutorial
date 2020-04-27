public class Forniture {
    private String name;

    private double price;
    private static double VAT_PERCENTAGE = 0.15;

    Forniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPriceVAT(){
        return price * VAT_PERCENTAGE  + price  ;
    }

    public double getPrice() {
        return price;
    }


    }

