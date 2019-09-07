package com.adevguide.java.designpatterns.adapter;

/**
 * @author PraBhu
 *
 */
public class OilInGallonImplObject implements OilInGallonInterface {

    private OilInLitreInterface oilInLitre = new OilInLitre();

    public Oil buyOilInGallon(double quantityinGallon) {
        double quantityInLitres = convertGallonToLitre(quantityinGallon);

        return oilInLitre.buyOil(quantityInLitres);
    }

    private double convertGallonToLitre(double gallonQuantity) {
        return gallonQuantity * 3.78541;
    }

}
