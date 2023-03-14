package com.example.conc;

import com.example.abst.Command;

public class Invoker {
    private Command command;

    public  void setCommand(Command command)
    {
        this.command=command;
    }

    public  void  executeCommand(){
        command.execute();
    }
}
