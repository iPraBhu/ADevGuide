package com.adevguide.java.designpatterns.abstractfactory;

public class AppleProcessor implements Processor {

    private String storage;

    public AppleProcessor() {
        System.out.println("Intel Processor will be used for Apple Laptop");
    }

    // This method will attach Storage Object with Processor
    public void attachStorage(Storage storage) {
        this.storage = storage.toString();
        System.out.println(storage + " is attached to Apple Laptop");
    }

    public void printSpecs() {
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "AppleProcessor is created using Intel Processor and " + this.storage;
    }

}
