package org.example.structural.decorator;

public class BeverageDemo {


    public static void main(String[] args) {
        IBeverage beverage = new Milk();
        System.out.println(String.format("The price of %s is £%.2f", beverage.name(),beverage.price()));

        IBeverage beverage1 = new HotChocalate(beverage);
        System.out.println(String.format("The price of %s is £%.2f", beverage1.name(),beverage1.price()));
    }
}
