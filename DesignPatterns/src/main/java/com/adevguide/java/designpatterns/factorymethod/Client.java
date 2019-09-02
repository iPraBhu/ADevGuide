
package com.adevguide.java.designpatterns.factorymethod;

/**
 * @author PraBhu
 *
 */
public class Client {

    public static void main(String[] args) {

        try {
            Stock appleStock = new AppleFactory().getStock();
            appleStock.buyShares(10);

            System.out.println("********************************");
            Stock amazonStock = new AmazonFactory().getStock();
            amazonStock.sellShares(20);

            System.out.println("********************************");
            Stock googleStock = new GoogleFactory().getStock();
            googleStock.buyShares(30);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
