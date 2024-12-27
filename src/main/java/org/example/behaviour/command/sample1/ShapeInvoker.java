package org.example.behaviour.command.sample1;

import java.util.List;

public class ShapeInvoker {

    private Action action;
    private List<Action> actionList;

    public ShapeInvoker(List<Action> _action){
        this.actionList = _action;
    }

    public void drawShape(){
        for(Action action1 : actionList){
            action1.doAction();
        }
    }
    public void undoShape(){
        for(Action action1 : actionList){
            action1.undoAction();
        }
    }
}
