package org.example.creational.abstractFactory;


public class ColorFactory implements AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        Color result =
                switch (colorType.toLowerCase()) {
                    case "red" ->  new red();
                    case "green" -> new green();
                    default -> throw new IllegalStateException("Unexpected value: " + colorType);
                };
        return result;
    }
}
