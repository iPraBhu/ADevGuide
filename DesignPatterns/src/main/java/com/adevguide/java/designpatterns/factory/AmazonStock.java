
package com.adevguide.java.designpatterns.factory;

/**
 * @author PraBhu
 *
 */
public class AmazonStock extends Stock {

    @Override
    public void buyShares(int n) {
        System.out.println("Congrats!! You have successfully bought " + n + " Amazon Shares.");

    }

    @Override
    public void sellShares(int n) {
        System.out.println("Congrats!! You have successfully sold " + n + " Amazon Shares.");

    }

}
