package com.djcrafts.design_patterns_java.oops;

import java.util.HashMap;

public class PaymentService {
    // storing + making payments

    HashMap<String, PaymentMethod> paymentMethods;

    PaymentService() {
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod pm) {
        paymentMethods.put(name, pm);
    }

    public void makePayment(String name) {
        PaymentMethod pm = paymentMethods.get(name);
        pm.pay(); // Run time polymorphism
    }

}
