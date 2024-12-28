package org.example.behaviour.command.sample3;

public class TunrOnCommand implements ICommand {

    private TVReceiver tvReceiver;

    public TunrOnCommand(TVReceiver _tvReceiver){
        this.tvReceiver = _tvReceiver;
    }

    @Override
    public void execute() {
        this.tvReceiver.turnOn();
    }
}
