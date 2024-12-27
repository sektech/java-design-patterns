package org.example.structural.composite;

public class Leaf implements Component {

    private String title;
    private Double price;

    public Leaf(String _title,Double _price){
        this.title = _title;this.price = _price;
    }
    @Override
    public void showPrice() {
        System.out.println(String.format("The price of %s is £%.2f", this.title,this.price));
    }

    public Double getPrice() {
        return price;
    }
}
