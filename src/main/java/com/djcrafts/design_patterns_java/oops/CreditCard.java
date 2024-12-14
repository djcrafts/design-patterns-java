package com.djcrafts.design_patterns_java.oops;

public class CreditCard extends Card{

    public CreditCard(String cardNo, String name) {
        super(cardNo, name);
    }

    @Override
    public void pay() {
        System.out.println("making payment via credit card");
    }
}
