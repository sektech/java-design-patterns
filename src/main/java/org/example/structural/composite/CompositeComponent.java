package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements Component{

    private String title;
    private Double price;
    private List<Component> componentList;

    public CompositeComponent(String _title,Double _price){
        this.title = _title;
        this.price = _price;
        this.componentList = new ArrayList<>();
    }

    public void addComponent(Component component){
        this.componentList.add(component);
    }

    public void removeComponent(Component component){
        this.componentList.remove(component);
    }

    @Override
    public void showPrice() {
        Double total = 0.0;
        System.out.println(String.format("The price of %s is £%.2f", this.title,this.price));
        for(Component component : componentList){
            component.showPrice();
        }
    }
}
