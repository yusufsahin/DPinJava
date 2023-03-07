package com.example.base.conc;

import com.example.base.abst.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac CheckBox çizdiriliyor");
    }
}
