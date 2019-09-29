package com.adevguide.java.designpatterns.composite;

/**
 * @author PraBhu
 *
 */

// leaf class
public class GameTitle extends Games {

    private int price;

    public GameTitle(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void listGames() {
        System.out.println(getName() + " is available for " + getPrice() + "$");
    }

    @Override
    public void addGame(Games game) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeGame(Games game) {
        throw new UnsupportedOperationException();

    }

}
