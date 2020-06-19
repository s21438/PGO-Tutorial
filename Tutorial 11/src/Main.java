import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 2010);
        Car c2 = new Car("Opel", 2005);
        Car c3 = new Car("Citroen", 2005);
        Car c4 = new Car("Ferrari", 2019);
        Car c5 = new Car("Fiat", 2002);
        Car c6 = new Car("Audi", 2017);
        Car c7 = new Car("Toyota", 2009);
        Car c8 = new Car("Maserati", 2017);
        Car c9 = new Car("Lamborghini", 2020);
        Car c10 = new Car("Lotus", 2014);

        ArrayList<Car> cars = new ArrayList(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10));

        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < cars.size() - 1; i++) {
                if (cars.get(i).compareTo(cars.get(i + 1)) > 0) {
                    Collections.swap(cars, i, i + 1);
                    change = true;
                }

                for (Car car : cars) {
                    int year = car.getYear();
                    String carModel = car.getCarModel();
                    System.out.println(year + carModel);
                }

                Item item0 = new Item("Sugar", 1);
                Item item1 = new Item("Cereals", 2);
                Item item2 = new Item("Salt", 3);
                Item item3 = new Item("Flour", 4);
                Item item4 = new Item("Mango", 5);
                ArrayList<Item> items = new ArrayList<>(Arrays.asList(item0, item1, item2, item3, item4));
                for ( i = 0; i < items.size(); i++) {
                    items.get(i).show();
                }
                HashMap<Integer, String> productKeys = new HashMap<>();
                for (Item item : items) {
                    productKeys.put(item.getId(), item.getName());
                }
                Set<Map.Entry<Integer, String>> set = productKeys.entrySet();
                for (Map.Entry<Integer, String> entry : set) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }

                items.clear();
                item1 = new Item("Sweet Bread", 6);
                items.add(item1);
                item1 = new Item("Sweet Milk", 7);
                items.add(item1);
                item1 = new Item("Sour Cookies", 8);
                items.add(item1);
                item1 = new Item("Sour Water", 9);
                items.add(item1);
                item1 = new Item("Sour Apples", 10);
                items.add(item1);
                item1 = new Item("Sour Bread", 11);
                items.add(item1);
                item1 = new Item("Sour Milk", 12);
                items.add(item1);
                item1 = new Item("Sweet Cookies", 13);
                items.add(item1);
                item1 = new Item("Sweet Water", 14);
                items.add(item1);
                item1 = new Item("Sweet Apples", 15);
                items.add(item1);
                List<Item> pt3List = items.subList(0, 5);
                for (Item item : pt3List) {
                    productKeys.put(item.getId(), item.getName());
                }
                set = productKeys.entrySet();
                for (Map.Entry<Integer, String> entry : set) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        }
    }
}

