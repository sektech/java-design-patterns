package org.example.behaviour.command.sample1;

public class SquareShape implements Shape {
    @Override
    public void draw() {
        System.out.println("This is Square");
    }

    @Override
    public void erase() {
        System.out.println("The Square is erased");
    }
}
