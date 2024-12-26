package org.example.structural.decorator;

public class MilkDecorator implements IBeverage{

    private IBeverage iBeverage;

    public MilkDecorator(IBeverage iBeverage){
        this.iBeverage = iBeverage;
    }

    @Override
    public String name() {
        return iBeverage.name();
    }

    @Override
    public Double price() {
        return iBeverage.price();
    }
}
