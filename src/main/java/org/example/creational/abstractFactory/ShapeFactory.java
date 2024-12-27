package org.example.creational.abstractFactory;

public class ShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        Shape result =   switch (shapeType.toLowerCase()) {
            case "circle" ->  new Circle();
            case "rectangle" -> new Rectangle();
            default -> throw new IllegalStateException("Unexpected value: " + shapeType);
        };
        return result;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
