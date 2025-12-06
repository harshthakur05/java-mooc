package part4.exercise7;

public class Product {
    String name;
    int quantity;
    double price;

    public Product(String initialName, double initialPrice, int initialQuantity){
        this.name= initialName;
        this.price = initialPrice;
        this.quantity =initialQuantity;
    }
    public void printproduct(){
            System.out.println(name + ", price " + price + ", " + quantity + " pcs");
        }
    
}
