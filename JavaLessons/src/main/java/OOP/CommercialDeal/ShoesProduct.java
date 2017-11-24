package OOP.CommercialDeal;

/**
 * User: tetiana.kryvets
 * Date: 9/3/17
 */
public class ShoesProduct extends Product {
    private int size;
    private String colour;

    public ShoesProduct(String title, double price, int quantity, int size, String colour) {
        super(title, price, quantity);
        this.size = size;
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

}
