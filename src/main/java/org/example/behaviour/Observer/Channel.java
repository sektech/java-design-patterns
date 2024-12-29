package org.example.behaviour.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private final List<IObserver> iObserverList = new ArrayList<>();
    public Channel(){

    }

    public void subscribe(IObserver iObserver){
        iObserverList.add(iObserver);
    }
    public void unsubscribe(IObserver iObserver){
        iObserverList.remove(iObserver);
    }

    public void notifyObserver(){
        for(IObserver observer : iObserverList){
            observer.update("Video uploaded");
        }

    }

}
