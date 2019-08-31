/**
 * 
 */
package com.adevguide.java.designpatterns.singleton;

/**
 * @author pbhuite
 *
 */
public class EagerInitialization {

    // private construction so the class cannot be instantiated from outside also blocks inheritance
    private EagerInitialization() {
        System.out.println("A Singleton class is created using EagerInitialization.");
    }

    // private static final instance creation eagerly
    private static final EagerInitialization INSTANCE = new EagerInitialization();

    // public class for outside world to get the instance
    public static EagerInitialization getInstance() {
        return INSTANCE;
    }

}
