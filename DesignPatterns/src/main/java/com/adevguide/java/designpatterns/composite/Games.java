package com.adevguide.java.designpatterns.composite;

/**
 * @author PraBhu
 *
 */
// Component class
public abstract class Games {

    private String name;

    public Games(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void listGames();

    public abstract void addGame(Games game);

    public abstract void removeGame(Games game);

}
