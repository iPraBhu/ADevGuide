package com.adevguide.java.designpatterns.adapter;

/**
 * @author PraBhu
 *
 */
public class OilInLitre implements OilInLitreInterface {

    public Oil buyOil(double quantityInLitre) {
        System.out.println("Purchasing " + quantityInLitre + " litres of Oil");
        return new Oil(quantityInLitre);
    }

}
