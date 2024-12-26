package org.example.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        IChristmasTree christmasTree = new BubbleLight(new ChristmasTreeImpl());

        System.out.println(christmasTree.decorate());
    }
}
