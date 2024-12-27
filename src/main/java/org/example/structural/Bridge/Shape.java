package org.example.structural.Bridge;

public abstract class Shape {
    protected Color color;

    public Shape(Color _color){
        this.color = _color;
    }
    public  abstract void draw();
}
