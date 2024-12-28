package org.example.behaviour.Strategy;

public class AmexStrategy extends CreditCardStrategy{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return creditCard.getNumber().startsWith("344");
    }
}
