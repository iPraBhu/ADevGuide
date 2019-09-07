package com.adevguide.java.designpatterns.adapter;

/**
 * @author PraBhu
 *
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("Adapter Class Implementation");
        OilInGallonInterface adapterInterfaceClass = new OilInGallonImplClass();

        adapterInterfaceClass.buyOilInGallon(1);
        System.out.println("***********************************************************");

        adapterInterfaceClass.buyOilInGallon(10);

        System.out.println("***********************************************************");

        System.out.println("Adapter Object Implementation");
        OilInGallonInterface adapterInterfaceObject = new OilInGallonImplObject();

        adapterInterfaceObject.buyOilInGallon(1);

        System.out.println("***********************************************************");

        adapterInterfaceObject.buyOilInGallon(40);
    }

}
