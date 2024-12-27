package org.example.behaviour.command.sample2;

public class RemoteInnov {

    private Command command;
    public  RemoteInnov(Command _command){
        this.command = _command;
    }
    public void execute() {
        this.command.execute();
    }
}
