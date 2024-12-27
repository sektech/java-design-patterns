package org.example.behaviour.command.sample1;

public class CircleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("This is circle");
    }

    @Override
    public void erase() {
        System.out.println("The circle is erased");
    }
}
