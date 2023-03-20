package com.example.conc;

import com.example.abst.Game;

public class Chess extends Game {
    @Override
    protected void initialize() {
        System.out.println("Setup chess board");
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
