package CommercialDeal;

/**
 * User: tetiana.kryvets
 * Date: 8/21/17
 */
public abstract class Product {
    private String title;
    private double price;
    private int quantity;

    private final int discProd = 10;

    public Product(String title, double price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        if (quantity > 2) {
            return price*quantity - price*quantity*discProd/100;
        } else {
            return price*quantity;
        }

    }
}
