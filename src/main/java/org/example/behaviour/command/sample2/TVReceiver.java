package org.example.behaviour.command.sample2;

public class TVReceiver implements Receiver{
    @Override
    public void On() {
        System.out.println("TV on");
    }

    @Override
    public void Off() {
        System.out.println("TV off");
    }
}
