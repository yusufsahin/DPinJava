package com.example.conc;

import com.example.abst.Image;

public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename=filename;
    }


    @Override
    public void display() {
        System.out.println("Displaying "+filename);
    }

    private  void loadImageFromDisk()
    {
        System.out.println("Loading " + filename + " from disk");

    }
}
