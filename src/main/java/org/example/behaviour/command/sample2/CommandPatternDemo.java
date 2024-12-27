package org.example.behaviour.command.sample2;

public class CommandPatternDemo {

    public static void main(String[] args) {
        TVReceiver tvReceiver = new TVReceiver();
        Command command = new ReceiverOnCommand(tvReceiver);
        RemoteInnov remoteInnov = new RemoteInnov(command);
        remoteInnov.execute();
    }

}
