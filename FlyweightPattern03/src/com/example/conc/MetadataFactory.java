package com.example.conc;

public class MetadataFactory {
    private static int nextID = 0;

    public int getID() {
        return nextID++;
    }

}
