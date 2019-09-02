
package com.adevguide.java.designpatterns.factory;

/**
 * @author PraBhu
 *
 */
public class StockFactory{

    public static Stock getStock(StockCompany company) {
        Stock stock;
        switch (company) {
            case APPLE:
                stock = new AppleStock();
                break;
            case GOOGLE:
                stock = new GoogleStock();
                break;
            case AMAZON:
                stock = new AmazonStock();
                break;
            default:
                throw new IllegalArgumentException("The stock is not listed in the market yet.");

        }
        stock.exchangeInfo();
        return stock;

    }

}
