package org.example.behaviour.Strategy;

public class StrategyClientDemo {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(new AmexStrategy());
        creditCard.setNumber("2443 2345 12134");
        if (creditCard.isValid())
         System.out.println("Your card is valid");
        else
            System.out.println("Your card is not valid");
    }
}
