package org.example.behaviour.command.sample2;

public class ReceiverOnCommand implements Command{

    private Receiver receiver;

    public ReceiverOnCommand(Receiver _receiver){
        this.receiver = _receiver;
    }

    @Override
    public void execute() {
        this.receiver.On();
    }
}
