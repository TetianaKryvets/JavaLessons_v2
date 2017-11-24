package OOP.CommercialDeal;

/**
 * User: tetiana.kryvets
 * Date: 9/3/17
 */
public class FotoProduct extends Product {
    private double megapx;
    private boolean digital;

    public FotoProduct(String title, double price, int quantity, boolean digital, double megapx) {
        super(title, price, quantity);
        this.digital = digital;
        this.megapx = megapx;
    }

    private final int Disc = 20;

    @Override
    public double getCost() {

        if (!digital) {
            return super.getCost() - super.getCost()*Disc/100;
        } else {
        return super.getCost();
        }
    }

}
