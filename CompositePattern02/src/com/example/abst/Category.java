package com.example.abst;

public  interface Category {
    public String getName();
    public void add(Category category);
    public void remove(Category category);

    public  void displayHierarchy();
}
