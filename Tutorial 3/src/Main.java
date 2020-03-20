public class Main {
    public static void main(String[] args) {
Airplane Information= new Airplane("Emirates",350);
String brand1=Information.getBrand();
int number1=Information.getNumberOfSeats();
Information.message(brand1,number1);

Engine Information2= new Engine(22000.00,2010);
 double power=Information2.getPower();
 int productionYear=Information2.getProductionYear();
 Information2.message2(power,productionYear);
        if (power>20000 && productionYear>2000) {
            System.out.println("The Airplane is ecological");
        } else {
            System.out.println("The Airplane isn't ecological");
        }
    }
}
