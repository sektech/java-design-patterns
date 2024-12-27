package org.example.creational.abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if (choice.toLowerCase()=="color")
            return new ColorFactory();
        else if (choice.toLowerCase()=="shape")
            return new ShapeFactory();
        else
            return null;

    }
}
