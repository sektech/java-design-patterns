package org.example.creational.org.example.creational.prototype;

public class BlackSheep implements Sheep{

    private String name;
    public BlackSheep(String _name){
        this.name = _name;
    }
    @Override
    public Sheep clone() {
        return new BlackSheep(this.name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }
}
