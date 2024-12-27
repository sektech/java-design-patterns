package org.example.behaviour.command.sample1;

import java.util.ArrayList;
import java.util.List;

public class CommandClient {


    public static void main(String[] args) {

        Shape circle = new CircleShape();
        Shape square = new SquareShape();
       // Action action = new DrawCircleShape(circle);
        List<Action> actionList = new ArrayList<>();
        actionList.add(new DrawCircleShape(circle));
        actionList.add(new DrawSquareShape(square));

        ShapeInvoker shapeInvoker = new ShapeInvoker(actionList);
        shapeInvoker.drawShape();
        shapeInvoker.undoShape();


    }
}
