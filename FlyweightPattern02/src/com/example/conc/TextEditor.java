package com.example.conc;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<Character> characters = new ArrayList<>();
    private FontFactory factory = new FontFactory();

    public void addCharacter(char value, int x, int y, int size, int style) {
        Character character = new Character(value, x, y, size, style, factory);
        characters.add(character);
    }

    public void draw() {
        for (Character character : characters) {
            character.draw();
        }
    }

}
