/**
 * 
 */
package com.adevguide.java.designpatterns.factory;

/**
 * @author PraBhu
 *
 */
public abstract class Stock {
    
 
    
    public abstract void buyShares(int n);
    public abstract void sellShares(int n);
    //implemented method
    public void exchangeInfo() {
        System.out.println("You are making Transactions at NASDAQ");
    }
    

}
