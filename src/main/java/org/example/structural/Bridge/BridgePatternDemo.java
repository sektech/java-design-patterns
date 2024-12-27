package org.example.structural.Bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {

        Color red = new Red();
        Shape circle = new Circle(red);
        circle.draw();

        Shape rectangle = new Rectangle(red);
        rectangle.draw();

    }
}
