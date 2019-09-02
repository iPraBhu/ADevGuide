package com.adevguide.java.designpatterns.abstractfactory;

public interface LaptopFactory {

    Processor createProcessor();

    Storage createStorage();
}
