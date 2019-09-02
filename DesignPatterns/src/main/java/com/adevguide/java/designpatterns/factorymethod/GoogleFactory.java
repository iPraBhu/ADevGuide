package com.adevguide.java.designpatterns.factorymethod;

public class GoogleFactory extends SuperStockFactory {

    @Override
    public Stock getStock() {
        return new GoogleStock();
    }

}
