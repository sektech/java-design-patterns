package org.example.behaviour.Observer;

public class ObserverClientDemo {
    public static void main(String[] args) {

        IObserver s1 = new Subscriber("Sek");
        IObserver s2 = new Subscriber("Kap");
        Channel channel = new Channel();
        channel.subscribe(s1);channel.subscribe(s2);
        channel.notifyObserver();

    }
}
