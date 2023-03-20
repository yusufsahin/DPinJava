package com.example.abst;

public abstract class Game {

    protected abstract  void  initialize();

    protected  abstract  void  makeMove();

    protected  abstract  boolean endOfGame();

    protected  abstract  void  printWinner();

    public final  void play()
    {
        initialize();
        while (!endOfGame())
        {
            makeMove();
        }
        printWinner();
    }
}
