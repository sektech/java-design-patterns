package org.example.behaviour.command.sample3;

public class TurnOffCommand implements ICommand{

    private TVReceiver receiver;
    public TurnOffCommand(TVReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.turnOf();
    }
}
