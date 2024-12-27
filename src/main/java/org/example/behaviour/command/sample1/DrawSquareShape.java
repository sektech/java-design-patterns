package org.example.behaviour.command.sample1;

public class DrawSquareShape implements Action {

    private Shape shape;

    public DrawSquareShape(Shape _shape){
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
