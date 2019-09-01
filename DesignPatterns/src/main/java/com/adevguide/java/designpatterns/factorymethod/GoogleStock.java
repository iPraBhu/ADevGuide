
package com.adevguide.java.designpatterns.factorymethod;

/**
 * @author PraBhu
 *
 */
public class GoogleStock extends Stock {

    @Override
    public void buyShares(int n) {
        System.out.println("Congrats!! You have successfully bought " + n + " Google Shares.");

    }

    @Override
    public void sellShares(int n) {
        System.out.println("Congrats!! You have successfully sold " + n + " Google Shares.");

    }

}
