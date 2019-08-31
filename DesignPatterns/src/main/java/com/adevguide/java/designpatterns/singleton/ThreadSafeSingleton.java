/**
 * 
 */
package com.adevguide.java.designpatterns.singleton;

/**
 * @author PraBhu
 *
 */
public class ThreadSafeSingleton {

    // private construction so the class cannot be instantiated from outside also blocks inheritance
    private ThreadSafeSingleton() {
        System.out.println("A Singleton class is created using ThreadSafeSingleton.");
    }

    // private static final instance creation
    private static ThreadSafeSingleton instance;

    // public class for outside world to get the instance
    public static synchronized ThreadSafeSingleton getInstance() {
        if (null == instance) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}
