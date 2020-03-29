public class Product {
    private String ProductName;
    private int ProductPrice;
    private double ProductCode;
    private int ProductNumberOfItems;

    public Product (String ProductName,int ProductPrice,
                    double ProductCode) {
        this.ProductName=ProductName;
        this.ProductPrice=ProductPrice;
        this.ProductCode=ProductCode;
        this.ProductNumberOfItems=0;


    }
    public Product(String ProductName,int ProductPrice,
                   double ProductCode,int ProductNumberOfItems){
        this.ProductName=ProductName;
        this.ProductPrice=ProductPrice;
        this.ProductCode=ProductCode;
        if(ProductNumberOfItems >= 0) {
            this.ProductNumberOfItems = ProductNumberOfItems;
        }else{
            System.out.println("Number of items cannot be less than 0!");
        }
    }
    public Product () {
    }

    public void setProductPrice(int productPrice) {
        this.ProductPrice = productPrice;
    }

    public void setProductNumberOfItems(int productNumberOfItems) {
        this.ProductNumberOfItems = productNumberOfItems;
    }

    public double getProductCode() {
        return ProductCode;
    }

    public int getProductNumberOfItems() {
        return ProductNumberOfItems;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public String getProductName() {
        return ProductName;
    }
}
