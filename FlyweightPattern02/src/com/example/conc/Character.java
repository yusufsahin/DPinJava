package com.example.conc;

import java.awt.*;

public class Character {
    private  char value;
    private int x;
    private int y;
    private int size;
    private int style;
    private  String name;

    private  FontFactory fontFactory= new FontFactory();

    public Character(char value, int x, int y, int size, int style, FontFactory fontFactory) {
        this.name=name;
        this.value = value;
        this.x = x;
        this.y = y;
        this.size = size;
        this.style = style;
        this.fontFactory = fontFactory;
    }

    public void  draw()
    {
        Font font =fontFactory.getFont(name,style,size);
        System.out.println("Drawing character "+value+ " at (" + x + ", " + y + ") with font " + font);
    }
}
