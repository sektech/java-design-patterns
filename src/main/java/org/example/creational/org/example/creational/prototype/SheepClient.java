package org.example.creational.org.example.creational.prototype;

public class SheepClient {

    private Sheep sheep;
    public SheepClient(Sheep _sheep){
        this.sheep = _sheep;
    }

    public Sheep createSheep(){
        return this.sheep.clone();
    }

}
