/**
 * 
 */
package com.adevguide.java.designpatterns.singleton;

/**
 * @author PraBhu
 *
 */
public class BillPughSingleton {

    // private construction so the class cannot be instantiated from outside also blocks inheritance
    private BillPughSingleton() {
        System.out.println("A Singleton class is created using BillPughSingleton.");
    }

    // private static final instance creation
    private static class InnerStaticHelperClass {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // public class for outside world to get the instance
    public static BillPughSingleton getInstance() {
        return InnerStaticHelperClass.INSTANCE;
    }
}
