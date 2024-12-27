package org.example.behaviour.command.sample1;

public class DrawCircleShape implements Action {

    private Shape shape;

    public DrawCircleShape(Shape _shape){
        this.shape = _shape;
    }

    @Override
    public void doAction() {
        this.shape.draw();
    }

    @Override
    public void undoAction() {
        this.shape.erase();
    }
}
