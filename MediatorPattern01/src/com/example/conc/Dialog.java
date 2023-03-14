package com.example.conc;

import com.example.abst.Component;
import com.example.abst.Mediator;

public class Dialog extends Component {

    public Dialog(Mediator mediator) {
        super(mediator);
    }
    public void show() {
        sendEvent("show");
    }

    public void hide() {
        sendEvent("hide");
    }

    @Override
    public void sendEvent(String event) {
        mediator.notify(this, event);
    }
}
