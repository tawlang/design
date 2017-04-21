package com.company.tl.command;

/**
 * Created by taolang on 2017/4/21.
 */
public class Manager {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
