package org.example.structural.composite;

public class SimpleTask implements Task{

    private String title;
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Simple task :" + this.title);
    }
}
