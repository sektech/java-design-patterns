package org.example.behaviour.Strategy;

public class CreditCard {
    private String number;
    private String date;
    private String cvv;
    private CreditCardStrategy creditCardStrategy;

    public CreditCard(CreditCardStrategy _creditCardStrategy){
        this.creditCardStrategy = _creditCardStrategy;
    }
    public boolean isValid(){
       return this.creditCardStrategy.isValid(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
