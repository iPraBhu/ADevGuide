
package com.adevguide.java.designpatterns.factorymethod;

/**
 * @author PraBhu
 *
 */
public class Client {

    public static void main(String[] args) {

        try {
            Stock appleStock = StockFactory.getStock(StockCompany.APPLE);
            appleStock.buyShares(10);
            appleStock.exchangeInfo();
            
            Stock amazonStock = StockFactory.getStock(StockCompany.AMAZON);
            amazonStock.sellShares(20);
            amazonStock.exchangeInfo();

            Stock microsoftStock = StockFactory.getStock(StockCompany.MICROSOFT);
            microsoftStock.buyShares(10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
