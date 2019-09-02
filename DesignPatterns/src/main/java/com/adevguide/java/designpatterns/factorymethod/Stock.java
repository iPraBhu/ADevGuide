/**
 * 
 */
package com.adevguide.java.designpatterns.factorymethod;

/**
 * @author PraBhu
 *
 */
public abstract class Stock {

    public Stock() {
        System.out.println("You are making Transactions at NASDAQ");
    }

    public abstract void buyShares(int n);

    public abstract void sellShares(int n);

}
