package org.example.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {

        Iphone6S phone = new Iphone6S( new Iphone16to6SAdapter());
        phone.charge();
    }
}
