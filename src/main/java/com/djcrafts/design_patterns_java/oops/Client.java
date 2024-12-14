package com.djcrafts.design_patterns_java.oops;

public class Client {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("djIDBIDebitCard", new DebitCard("1234123412341234", "Dhananjay"));
        paymentService.addPaymentMethod("djIDBICreditCard", new CreditCard("5678567856785678", "Dhanjay"));
        paymentService.addPaymentMethod("djUPI", new UPI("1234567890@ybl"));

        paymentService.makePayment("djUPI");
        paymentService.makePayment("djIDBIDebitCard");
        paymentService.makePayment("djIDBICreditCard");
    }
}
