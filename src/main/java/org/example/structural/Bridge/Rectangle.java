package org.example.structural.Bridge;

public class Rectangle extends Shape {
    public Rectangle(Color _color) {
        super(_color);

    }

    @Override
    public void draw() {

        System.out.println("Drawing rectangle");
        color.fillColor();
    }
}
