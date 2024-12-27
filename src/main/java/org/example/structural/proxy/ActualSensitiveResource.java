package org.example.structural.proxy;

public class ActualSensitiveResource implements Resource{

    @Override
    public void accessResource() {
        System.out.println("You are accessing sensitive resources");
    }
}
