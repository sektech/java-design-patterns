package org.example.structural.decorator;

public class HotChocalate extends MilkDecorator{
    public HotChocalate(IBeverage iBeverage) {
        super(iBeverage);
    }


    public String name() {
        return "Hot chocalate with "+  super.name() ;
    }

    @Override
    public Double price() {
        return super.price() + 1.00;
    }


}
