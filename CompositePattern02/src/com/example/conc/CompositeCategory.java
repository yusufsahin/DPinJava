package com.example.conc;

import com.example.abst.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CompositeCategory implements Category {

    private String name;
    private List<Category> subcategories= new ArrayList<>();

    public CompositeCategory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Category category) {
        subcategories.add(category);
    }

    @Override
    public void remove(Category category) {
        subcategories.remove(category);
    }

    @Override
    public void displayHierarchy() {
        System.out.println(getName());
            for (Category category:subcategories)
            {
                category.displayHierarchy();
            }
    }
}
