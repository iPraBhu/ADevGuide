package com.adevguide.java.designpatterns.adapter;

/**
 * @author PraBhu
 *
 */
public class Oil {
    private double oilPrice;

    public Oil(double quantityInLitre) {
        this.oilPrice = quantityInLitre * 2;    // price is 2 dollars per litre
        System.out.println("Total Cost of purchase is " + oilPrice + " dollars. Purchase Complete.");
    }

}
