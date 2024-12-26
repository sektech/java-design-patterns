package org.example.creational.org.example.creational.factory;

public class ShapeFactory {

    public ShapeFactory(){}

    public Shape getShapes(String _shape){

     Shape result =   switch (_shape) {
            case "circle" ->  new Circle();
            case "rectangle" -> new Rectangle();
            default -> throw new IllegalStateException("Unexpected value: " + _shape);
     };
     return result;
    }

}
