/**
 * 
 */
package com.adevguide.java.designpatterns.singleton;

/**
 * @author PraBhu
 *
 */
public class StaticBlockInitialization {

    private static StaticBlockInitialization instance;

    static {
        try {
            // private static final instance creation
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            System.out.println("Exception Occured" + e);
        }

    }

    // private construction so the class cannot be instantiated from outside also blocks inheritance
    private StaticBlockInitialization() {
        System.out.println("A Singleton class is created using StaticBlockInitialization.");
    }

    // public class for outside world to get the instance
    public static StaticBlockInitialization getInstance() {
        return instance;
    }

}
