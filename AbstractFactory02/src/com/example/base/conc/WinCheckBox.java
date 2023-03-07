package com.example.base.conc;

import com.example.base.abst.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win CheckBox çizdiriliyor");
    }
}
