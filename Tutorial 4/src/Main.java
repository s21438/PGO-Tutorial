public class Main {
    public static void main(String[] args) {
        String name;
        User u = new User();
        User u1 = new User("Christian","Musu","s21438@pjwstk.edu.pl", "xoxo");
        User u2 = new User("magicmashroom@pjastk.pl");
        User u3 = new User("christianmusu@virgilio.it");

        u2.createUser("Michal","Wiatr","12346");
        u1.createUser("Andrea","Musu","xoxo1");
        u2.createUser("AA","","");
        u3.createUser("Kamila","Koper","Ciao Bello!");
        name = u1.getName();
        System.out.println(name);


        Product p1 = new Product("Samsung Galaxy Buds Plus",140, 1656.9089);
        Product p2 = new Product("Iphone X",900,62425.0636,100);
        Product p3 = new Product("ChrisPhone",1000,62735.3998);
        p1.setProductNumberOfItems(2);
        p2.setProductPrice(1200);
    }
}
