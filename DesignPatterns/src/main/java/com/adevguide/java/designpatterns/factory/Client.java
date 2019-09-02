
package com.adevguide.java.designpatterns.factory;

/**
 * @author PraBhu
 *
 */
public class Client {

    public static void main(String[] args) {

        try {
            Stock appleStock = StockFactory.getStock(StockCompany.APPLE);
            appleStock.buyShares(10);

            System.out.println("********************************");
            Stock amazonStock = StockFactory.getStock(StockCompany.GOOGLE);
            amazonStock.sellShares(20);

            System.out.println("********************************");
            Stock googleStock = StockFactory.getStock(StockCompany.MICROSOFT);
            googleStock.buyShares(30);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
