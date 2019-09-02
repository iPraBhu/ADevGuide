package com.adevguide.java.designpatterns.factorymethod;

public class AppleFactory extends SuperStockFactory {

    @Override
    public Stock getStock() {
        return new AppleStock();
    }

}
