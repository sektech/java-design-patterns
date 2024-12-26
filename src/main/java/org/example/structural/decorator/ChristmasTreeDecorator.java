package org.example.structural.decorator;

public class ChristmasTreeDecorator implements IChristmasTree{

    private IChristmasTree iChristmasTree;
    public ChristmasTreeDecorator(IChristmasTree christmasTree){
        this.iChristmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return iChristmasTree.decorate();
    }
}
