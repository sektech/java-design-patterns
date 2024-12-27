package org.example.creational.abstractFactory;

public interface AbstractFactory {
    Shape getShape(String shapeType);
    Color getColor(String colorType);

}
