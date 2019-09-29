package com.adevguide.java.designpatterns.composite;

/**
 * @author PraBhu
 *
 */
public class Client {

    public static void main(String[] args) {

        final String SEPERATOR = "***************************";
        Games gameType = new GameGenre("PC Games");

        gameType.addGame(createMiscGame());
        gameType.listGames();
        System.out.println(SEPERATOR);

        gameType.addGame(createSportGames());
        gameType.listGames();
        System.out.println(SEPERATOR);

        gameType.addGame(createRacingGames());
        gameType.listGames();

        System.out.println(SEPERATOR);

    }

    private static Games createSportGames() {

        Games sportGames = new GameGenre("Sport Games");

        Games fifa = new GameTitle("FIFA 19", 10);
        Games nba = new GameTitle("NBA 2K19", 6);
        sportGames.addGame(fifa);
        sportGames.addGame(nba);
        return sportGames;

    }

    private static Games createRacingGames() {

        Games racingGames = new GameGenre("Racing Games");

        Games nfs = new GameTitle("Need For Speed", 15);
        Games realRacing = new GameTitle("Real Racing", 5);
        racingGames.addGame(nfs);
        racingGames.addGame(realRacing);
        return racingGames;

    }

    private static Games createMiscGame() {
        Games sims = new GameTitle("Sims 3", 1);
        return sims;
    }

}
