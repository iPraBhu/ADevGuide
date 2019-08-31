/**
 * 
 */
package com.adevguide.java.designpatterns.singleton;

/**
 * @author PraBhu
 *
 */
public class LazyInitialization {

    // private construction so the class cannot be instantiated from outside also blocks inheritance
    private LazyInitialization() {
        System.out.println("A Singleton class is created using LazyInitialization.");
    }

    // private static final instance creation lazy
    private static LazyInitialization instance;

    // public class for outside world to get the instance
    public static LazyInitialization getInstance() {
        if (null == instance) {
            instance = new LazyInitialization();
        }
        return instance;
    }

}
