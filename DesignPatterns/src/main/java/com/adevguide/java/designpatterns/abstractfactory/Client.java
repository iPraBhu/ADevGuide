package com.adevguide.java.designpatterns.abstractfactory;

/**
 * @author PraBhu
 *
 */
public class Client {

    public static void main(String[] args) {

        Processor dellProcessor = createLaptop(new DellLaptop(1024));
        dellProcessor.printSpecs();
        System.out.println("*****************************************");
        Processor appleProcessor = createLaptop(new AppleLaptop(512));
        appleProcessor.printSpecs();

    }

    // config method that will create an instance of Processor with passed abstract class object
    public static Processor createLaptop(LaptopFactory laptopFactory) {
        Processor processor = laptopFactory.createProcessor();
        Storage storage = laptopFactory.createStorage();
        processor.attachStorage(storage);
        return processor;

    }

}
