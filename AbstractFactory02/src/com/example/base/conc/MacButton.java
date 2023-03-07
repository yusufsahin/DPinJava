package com.example.base.conc;

import com.example.base.abst.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button Çizdiriliyor");
    }
}
