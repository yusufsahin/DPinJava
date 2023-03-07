package com.example.base.conc;

import com.example.base.abst.Button;
import com.example.base.abst.CheckBox;
import com.example.base.abst.GUIFactory;

public class WindowGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {

        return new WinCheckBox();
    }
}
