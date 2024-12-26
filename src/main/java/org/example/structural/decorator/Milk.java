package org.example.structural.decorator;

public class Milk implements IBeverage{
    @Override
    public String name() {
        return "Milk";
    }

    @Override
    public Double price() {
        return 4.00;
    }
}
