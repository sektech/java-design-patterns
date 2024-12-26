package org.example.creational.org.example.creational.prototype;

public class protoTypeDemo {

    public static void main(String[] args) {
        Sheep blacksheep = new BlackSheep("Titan");
        System.out.println("Blacksheep " + blacksheep.getName());

        Sheep cloneBlackSheep = new SheepClient(blacksheep).createSheep();
        cloneBlackSheep.setName("Cloned titan");
        System.out.println("Cloned Blacksheep "+ cloneBlackSheep.getName());
        System.out.println("Blacksheep " + blacksheep.getName());
    }
}
