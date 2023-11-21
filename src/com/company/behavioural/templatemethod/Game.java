package com.company.behavioural.templatemethod;

public abstract class Game {

    protected int currentPlayer;

    protected int numberOfPlayers;

    public Game(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
    public void run(){
        start();
        while (!haveAWinner())
            takeTurn();
        System.out.println("Player "+ getWinningPlayer()+ " wins");
    }
    protected abstract int getWinningPlayer();
    protected abstract void start();
    protected abstract boolean haveAWinner();
    protected abstract void takeTurn();
}
