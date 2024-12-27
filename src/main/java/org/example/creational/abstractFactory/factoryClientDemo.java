package org.example.creational.abstractFactory;

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
