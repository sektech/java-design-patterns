package org.example.creational.org.example.creational.abstractFactory;

import org.example.creational.org.example.creational.factory.ShapeFactory;

public class factoryClientDemo {
    public static void main(String[] args) {

        AbstractFactory factory = FactoryProducer.getFactory("color");

       AbstractFactory factory1 = FactoryProducer.getFactory("shape");
       factory1.getShape("rectangle").draw();
        factory.getColor("red").fillColor();

        factory1.getShape("circle").draw();
        factory.getColor("green").fillColor();


    }
}
