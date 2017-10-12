package CommercialDeal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import org.junit.Before;

/**
 * User: tetiana.kryvets
 * Date: 8/21/17
 */
public class main {

    public static void main(String args[]) throws IOException {

        //Input buyer и seller names:
//        Party buyer = inputParty();
        Party buyer = new Party();
        buyer.setName("Buyer");

       // Party seller = inputParty();
        Party seller = new Party();
        seller.setName("Seller");

//        //Input array of products:
//        FotoProduct[] fotoProductsArray = createArrayOfFotoProducts(/*[("", 2 ,50, ),()]*/);
//        ShoesProduct[] botinkiProductsArray = createArrayOfBotinkiProducts();
//
//        Product[] productsArray = joinArrays(fotoProductsArray, botinkiProductsArray);

        FotoProduct camera1 = new FotoProduct("Camera1", 100, 2, false, 34);
        FotoProduct camera2 = new FotoProduct("Camera2", 50, 3, false, 22);

        ShoesProduct shoes1 = new ShoesProduct("Shoes1", 200, 1, 35, "green");
        ShoesProduct shoes2 = new ShoesProduct("Shoes1", 500, 1, 35, "red");

        //todo: how to output digital value, megapx, size and colour?

        Product[] productsArray = new Product[1]; //todo: is it possible to initialize without size

        productsArray[0] = camera1;
//        productsArray[1] = camera2;
//        productsArray[2] = shoes1;
//        productsArray[3] = shoes2;

        //input Deal:
        Deal deal = createDeal(buyer, seller, productsArray);
        System.out.println("Total sum = " + deal.getSum());

        //Assert




       //Input and output array of deals:
        //Deal[] deals = createArrayOfDeals(seller, buyer, productsArray);

    }

    public static Party inputParty() throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Input party name:");
        String partyName = reader.readLine();

        return inputPartyName(partyName);
    }

    public static Party inputPartyName(String enteredName) {
        Party party = new Party();
        party.setName(enteredName);
        return party;
    }

//    public static FotoProduct inputFotoProduct() throws IOException {
//
//        FotoProduct fotoProduct = new FotoProduct();  //constructor has been change
//
//        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
//        System.out.println("Input product title:");
//        String productName = reader.readLine();
//        fotoProduct.setTitle(productName);
//
//        System.out.println("Input product price:");
//        double productPrice = Double.parseDouble(reader.readLine().trim());
//        fotoProduct.setPrice(productPrice);
//
//        System.out.println("Input product q-ty:");
//        int productQty = Integer.parseInt(reader.readLine());
//        fotoProduct.setQuantity(productQty);
//
//        System.out.println("Is digital?");
//        boolean isDigital = Boolean.parseBoolean(reader.readLine());
//        fotoProduct.setDigital(isDigital);
//
//        System.out.println("Input megapx:");
//        double megapx = Double.parseDouble(reader.readLine());
//        fotoProduct.setMegapx(megapx);
//
//        return fotoProduct;
//    }

//    public static ShoesProduct inputBotinkiProduct() throws IOException {
//        ShoesProduct botinkiProduct = new ShoesProduct();  //   ShoesProduct constructor has been change
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("");
//
//        System.out.println("Input product title:");
//        String productName = reader.readLine();
//        botinkiProduct.setTitle(productName);
//
//        System.out.println("Input product price:");
//        double productPrice = Double.parseDouble(reader.readLine().trim());
//        botinkiProduct.setPrice(productPrice);
//
//        System.out.println("Input product q-ty:");
//        int productQty = Integer.parseInt(reader.readLine());
//        botinkiProduct.setQuantity(productQty);
//
//        System.out.println("Input size: ");
//        int procustSize = Integer.parseInt(reader.readLine());
//        botinkiProduct.setSize(procustSize);
//
//        System.out.println("Input colour");
//        String productColour = reader.readLine();
//        botinkiProduct.setColour(productColour);
//
//        return botinkiProduct;
//
//    }

//    public static FotoProduct[] createArrayOfFotoProducts() throws IOException {
//        FotoProduct[] fotoProductsArr = new FotoProduct[1];
//        for (int i=0; i<fotoProductsArr.length; i++) {
//            FotoProduct fotoProduct = inputFotoProduct();
//            fotoProductsArr[i] = fotoProduct;
//        }
//        return fotoProductsArr;
//    }

//    public static ShoesProduct[] createArrayOfBotinkiProducts() throws IOException {
//        ShoesProduct[] botinkiProductsArr = new ShoesProduct[1];
//        for (int j=0; j<botinkiProductsArr.length; j++) {
//            ShoesProduct botinkiProduct = inputBotinkiProduct();
//            botinkiProductsArr[j] =  botinkiProduct;
//        }
//        return botinkiProductsArr;
//
//    }

    public static Product[] joinArrays(FotoProduct[] fotoProductsArr, ShoesProduct[] botinkiProductsArr) {
        Product[] prArray = new Product[fotoProductsArr.length + botinkiProductsArr.length];
        System.arraycopy(fotoProductsArr, 0, prArray, 0, fotoProductsArr.length);
        System.arraycopy(botinkiProductsArr, 0, prArray, fotoProductsArr.length, botinkiProductsArr.length);
        return prArray;
    }

    public static Deal createDeal(Party seller, Party buyer, Product[] pr_arr) {
                Deal deal = new Deal(seller, buyer, pr_arr);
                System.out.println("Buyer: " + deal.getBuyer().getName());
                System.out.println("Seller: " + deal.getSeller().getName());
                for (int i=0; i<pr_arr.length; i++) {
                    System.out.println("Product title: " + pr_arr[i].getTitle() + " Product price: " + pr_arr[i]
                            .getPrice() + " Product Q-ty: " + pr_arr[i].getQuantity());
                }
                System.out.println("Total sum of deal = " + deal.getSum());

            return deal;
    }

    public static Deal[] createArrayOfDeals(Party seller, Party buyer, Product[] pr_arr) throws IOException {
        double totalSum = 0;
        Deal[] deals = new Deal[3];
        for (int j=0; j<deals.length; j++) {
            Deal deal = createDeal(buyer, seller, pr_arr);
            //Deal deal = new Deal(seller, buyer, pr_arr);
            deals[j] = deal;
            totalSum += deals[j].getSum();
        }
        System.out.println("Total sum of deals = " + totalSum);
        return deals;
    }


//    public static void outputDeal(Deal deal) {
//        for (int i=0; i<productsArray.length; i++) {
//            for (Product pr: deals[i].getProducts())  {
//                System.out.print("Product: " + pr.getTitle() + " Product Cost: " + pr.getPrice() + " Product q-ty: "
//                        + pr.getQuantity());
//                System.out.println("");
//
//            }
//            System.out.println("Total sum:" + deals[i].getSum());
//
//    }


//    public static void outputArrayOfDeals(Deal[] deals, Product[] productsArray) {
//        for (int i=0; i<productsArray.length; i++) {
//            for (Product pr: deals[i].getProducts())  {
//                System.out.print("Product: " + pr.getTitle() + " Product Cost: " + pr.getPrice() + " Product q-ty: "
//                        + pr.getQuantity());
//                System.out.println("");
//
//            }
//            System.out.println("Total sum:" + deals[i].getSum());
//
//    }
//
//    }

}


