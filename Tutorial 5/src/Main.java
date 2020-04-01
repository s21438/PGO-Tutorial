import java.util.*;
public class Main {
    public static void main(String[] args) {
        User Anonymous1 = new User("Kamila","Koper","adf@gmail.com", "lool");
        User Anonymous2 = new User("ba");
        User User1 = new User("Christian", "Musu", "asl@gmail.com", "xoxo");
        User User2 = new User(Anonymous1,"Bil1","Lso1","Min0" );


        Product product1 = new Product("Computer", 5000, 1054, 50);
        Product product2 = new Product("SG Buds", 200, 6903,1 );
        Product product3 = new Product("Jbl", 170, 5437, 1);

        ArrayList<Product> products_list1 = new ArrayList<>(Arrays.asList(product1,product2));
        ArrayList<Product> products_list2 = new ArrayList<>(Arrays.asList(product3));

        Category c1 = new Category();
        Category c2 = new Category("Headphones");
        Category c3 = new Category("Speakers", products_list1 );

        c1.addProduct(product1);
        c2.addProduct(product2);
        c3.addProduct(product3);

        Busket b1=new Busket();
        Busket b2= new Busket(User1);
        Busket b3= new Busket(User2,products_list2);

        b1.add(product1);
        b2.add(product2);
        b3.remove(product3);
        b2.buy();

    }
}

