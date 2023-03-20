package com.example.conc;

import com.example.abst.Game;

public class Checkers extends Game {
    @Override
    protected void initialize() {
        System.out.println("Setup Checkers board ");
    }

    @Override
    protected void makeMove() {
        System.out.println("move");
    }

    @Override
    protected boolean endOfGame() {
        System.out.println("End of Game");
        return true;
    }

    @Override
    protected void printWinner() {
        System.out.println("Winner");
    }
}
