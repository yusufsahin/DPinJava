package com.example.base.conc;

import com.example.base.abst.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button çizdiriliyor");
    }
}
