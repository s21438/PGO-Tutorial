import java.util.ArrayList;

public class Busket {
    private User user;
    private ArrayList<Product> products = new ArrayList<Product>();

    public Busket() {
    }

    public Busket(User user) {
        this.user = user; }

    public Busket(User user, ArrayList<Product> products)
    {
        this.user = user;
        this.products = products;
    }

    public void add(Product product)
    {
        int max_size = products.size();
        boolean noSpace = true;
        int numOfItems = product.getNumOfItems();

        if (numOfItems >= 1){
            products.add(product);
            product.setNumOfItems(numOfItems - 1);
            System.out.println("Item " + product.getName() + "was added. " + product.getNumOfItems() + " items are remaining.");
        }else{
            noSpace = false;
            System.out.println("There is no more items");
        }


    }

    public void remove(Product product)
    {
        int max_size = products.size();
        boolean noSpace = true;
        int numOfItems = product.getNumOfItems();

        if (max_size >= 1){
            products.remove(product);
            product.setNumOfItems(numOfItems + 1);
            System.out.println("Item " + product.getName() + "was removed. " + product.getNumOfItems() + " items are remaining.");
        }else{
            noSpace = false;
            System.out.println("The basket is empty!");
        }
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public void buy()
    {
        double total = 0;
        for(int i = 0; i<products.size(); i++) {
            total += products.get(i).getPrice();
        }
        System.out.println("Total value of all products is: " + total);
    }
}
