package org.example.structural.adapter;

public class Iphone6S implements Iphone{

    Iphone16to6SAdapter iphone16to6SAdapter;

    public Iphone6S(Iphone16to6SAdapter _iphone16to6SAdapter){
        this.iphone16to6SAdapter = _iphone16to6SAdapter;
    }

    @Override
    public void charge() {
        System.out.println("Iphone 6s is charging");
        this.iphone16to6SAdapter.charge();
    }
}
