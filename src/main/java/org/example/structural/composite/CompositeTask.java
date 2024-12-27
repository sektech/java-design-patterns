package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements Task{
    private String title;
    private List<Task> taskList;

    public CompositeTask(String _title){
        this.title = _title;
        taskList = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public void addTask(Task task){
        this.taskList.add(task);
    }

    public void removeTask(Task task){
        this.taskList.remove(task);
    }

    @Override
    public void display() {
        System.out.println("Tasks are " + this.getTitle());
        for(Task task : taskList){
            task.display();
        }
    }
}
