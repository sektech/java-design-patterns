package org.example.creational.org.example.creational.factory;

public class factoryClientDemo {
    public static void main(String[] args) {
        Shape circle = new ShapeFactory().getShapes("circle");
        circle.draw();

        Shape recatangle = new ShapeFactory().getShapes("rectangle");
        recatangle.draw();


    }
}
