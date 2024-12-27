package org.example.structural.composite;

import java.util.List;

public class CompositeClientDemo {

    public static void main(String[] args) {

        Task task= new SimpleTask();
        task.setTitle("Task 1");
        Task task1= new SimpleTask();
        task1.setTitle("Task 2");

        CompositeTask compositeTask = new CompositeTask("Composite Tasks");
        compositeTask.addTask(task);
        compositeTask.addTask(task1);

        compositeTask.display();

        Component leaf1 = new Leaf("HDD", 120.00);
        Component leaf2 = new Leaf("RAM", 140.00);
        Component leaf3 = new Leaf("processor", 320.00);
        CompositeComponent compositeComponent = new CompositeComponent("Cabinet components",580.00);
        compositeComponent.addComponent(leaf1);
        compositeComponent.addComponent(leaf2);
        compositeComponent.addComponent(leaf3);
        compositeComponent.showPrice();

    }
}
