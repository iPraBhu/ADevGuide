package com.adevguide.java.designpatterns.factorymethod;

public class AmazonFactory extends SuperStockFactory {

    @Override
    public Stock getStock() {
        return new AmazonStock();
    }

}
