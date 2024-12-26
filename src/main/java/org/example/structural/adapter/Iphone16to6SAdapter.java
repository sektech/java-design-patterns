package org.example.structural.adapter;

public class Iphone16to6SAdapter {

    private Iphone16 iphone16;

    public Iphone16to6SAdapter(){
        this.iphone16 = new Iphone16Pro();
    }

    public void charge(){
        this.iphone16.charge(30);
    }

}
