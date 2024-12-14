package com.djcrafts.design_patterns_java.oops;

public class UPI implements PaymentMethod{

    String upiId;

    public UPI(String upiId){
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("making payment via UPI "+ upiId);
    }
}
