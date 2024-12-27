package org.example.structural.Bridge;

public class Circle extends Shape {

    public Circle(Color _color) {
        super(_color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
        color.fillColor();
    }
}
