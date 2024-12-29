package org.example.behaviour.Observer;

public class Subscriber implements IObserver{
    private String name;
    public Subscriber(String _name){
        this.name = _name;
    }
    @Override
    public void update(String message) {
        System.out.println(String.format("Hey %s , received message  %s ",this.name, message));
    }
}
