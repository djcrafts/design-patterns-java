package com.djcrafts.design_patterns_java.oops;

public class DebitCard extends Card{

    public DebitCard(String cardNo, String name) {
        super(cardNo, name);
    }

    @Override
    public void pay() {
        System.out.println("making payment via debit card");
    }
}
