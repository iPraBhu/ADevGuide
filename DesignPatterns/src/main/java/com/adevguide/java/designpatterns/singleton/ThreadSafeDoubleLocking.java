/**
 * 
 */
package com.adevguide.java.designpatterns.singleton;

/**
 * @author PraBhu
 *
 */
public class ThreadSafeDoubleLocking {

    // private construction so the class cannot be instantiated from outside also blocks inheritance
    private ThreadSafeDoubleLocking() {
        System.out.println("A Singleton class is created using ThreadSafeDoubleLocking.");
    }

    // private static final instance creation
    private static ThreadSafeDoubleLocking instance;

    // public class for outside world to get the instance
    public static ThreadSafeDoubleLocking getInstance() {
        if (null == instance) {
            synchronized (ThreadSafeDoubleLocking.class) {
                if(null==instance)
                    instance = new ThreadSafeDoubleLocking();
            }
        }
        return instance;
    }

}
