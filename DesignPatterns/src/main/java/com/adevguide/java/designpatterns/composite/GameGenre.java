package com.adevguide.java.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PraBhu
 *
 */
// Composite Class
public class GameGenre extends Games {

    private List<Games> gameList = new ArrayList<>();

    public GameGenre(String name) {
        super(name);
    }

    @Override
    public void listGames() {
        System.out.println(getName());
        gameList.forEach(Games::listGames);
    }

    public void addGame(Games game) {
        gameList.add(game);
    }

    public void removeGame(Games game) {
        gameList.remove(game);
    }


}
