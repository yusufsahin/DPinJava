package com.example.conc;

import com.example.abst.Component;
import com.example.abst.Mediator;

import javax.swing.plaf.basic.ComboPopup;

public class Button extends Component {

    public Button(Mediator mediator) {
        super(mediator);
    }
    public void click() {
        sendEvent("click");
    }
    @Override
    public void sendEvent(String event) {
        mediator.notify(this,event);
    }
}
