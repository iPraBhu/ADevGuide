
package com.adevguide.java.designpatterns.factorymethod;

/**
 * @author PraBhu
 *
 */
public class AppleStock extends Stock {

    @Override
    public void buyShares(int n) {

        System.out.println("Congrats!! You have successfully bought " + n + " Apple Shares.");
    }

    @Override
    public void sellShares(int n) {
        System.out.println("Congrats!! You have successfully sold " + n + " Apple Shares.");

    }

}
