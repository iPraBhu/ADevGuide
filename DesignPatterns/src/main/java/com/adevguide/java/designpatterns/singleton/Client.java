/**
 * 
 */
package com.adevguide.java.designpatterns.singleton;

/**
 * @author PraBhu
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {

        BillPughSingleton.getInstance();
        BillPughSingleton.getInstance();
        LazyInitialization.getInstance();
        EnumSingleton a = EnumSingleton.INSTANCE;

    }

}
