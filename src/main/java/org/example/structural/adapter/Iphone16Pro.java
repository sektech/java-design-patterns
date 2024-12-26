package org.example.structural.adapter;

public class Iphone16Pro implements Iphone16{
    @Override
    public void charge(Integer _watt) {
        System.out.println(String.format("iPhone 16 with %s Watt charger is being used for charging ", _watt));
    }
}
