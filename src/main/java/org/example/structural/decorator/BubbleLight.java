package org.example.structural.decorator;

public class BubbleLight extends ChristmasTreeDecorator{

    public BubbleLight(IChristmasTree christmasTree) {
        super(christmasTree);
    }
    public String decorate(){
        return super.decorate() + " with bubble lights";
    }
}
