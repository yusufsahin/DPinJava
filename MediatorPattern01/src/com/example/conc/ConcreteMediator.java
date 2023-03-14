package com.example.conc;

import com.example.abst.Component;
import com.example.abst.Mediator;

public class ConcreteMediator implements Mediator {
    private Button button;
    private Dialog dialog;

    public void setButton(Button button) {
        this.button = button;
    }

    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == button && event.equals("click")) {
            System.out.println("Button clicked, showing dialog...");
            dialog.show();
        } else if (sender == dialog && event.equals("hide")) {
            System.out.println("Dialog closed");
            dialog.hide();
        }
    }

}
