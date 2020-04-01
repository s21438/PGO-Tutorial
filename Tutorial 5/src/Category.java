import java.util.ArrayList;

public class Category {
private String name;
private ArrayList<Product> products=new ArrayList<>();

    public Category () {
        this.name = "Main";
    }

    public Category (String name){
    this.name=name;
    }

    public Category (String name,ArrayList<Product> products) {
    this.name=name;
    this.products = products;
    }

public void addProduct (Product newProduct) {
    products.add(newProduct);
}
public void deleteProduct (Product oldProduct){
    products.remove(oldProduct);
}

    public void setName(String name) {
        this.name = name;
    }
    }

