package CommercialDeal;

import java.util.Date;

/**
 * User: tetiana.kryvets
 * Date: 8/21/17
 */
public class Deal {
    private Date date;
    private Party buyer;
    private Party seller;
    private Product[] products;

    public Date getDate() {
        return date;
    }

    public Party getBuyer() {
        return buyer;
    }

    public Party getSeller() {
        return seller;
    }

    public Product[] getProducts() {
        return products;
    }

    public Deal(Party seller, Party buyer, Product[] products) {
        date = new Date();//конструктор, сразу устанавливает в текущую дату
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public double getSum() {
        double sum = 0.0;
        for (Product pr:products) {
            sum += pr.getCost();
        }
        return sum;
    }

}
