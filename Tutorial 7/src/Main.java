
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
Forniture f1 = new Forniture("chairs", 20.0);
Forniture f2 = new Forniture("beds", 80.0);
Forniture f3= new Forniture("sofas",120.0);

        ArrayList<Forniture> furnitures_list1= new ArrayList<Forniture>(Arrays.asList(f1,f2));
        ArrayList<Forniture> furnitures_list2 = new ArrayList<Forniture>(Arrays.asList(f2));
        ArrayList<Forniture> furnitures_list3 = new ArrayList<Forniture>(Arrays.asList(f1,f2,f3));

Room r1 = new Room(furnitures_list1 ,30);
Room r2 = new Room(furnitures_list2 , 50);
Room r3 = new Room(furnitures_list3 , 90);

House.CreateHouse("Via dell'agrifoglio");
    }
}


