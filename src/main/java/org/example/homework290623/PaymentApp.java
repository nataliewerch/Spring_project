package org.example.homework290623;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PaymentApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PaymentConfig.class);
        PaymentService paymentService = context.getBean(PaymentService.class);

        paymentService.pay(PaymentType.CARD);
        paymentService.pay(PaymentType.CASH);
        paymentService.pay(PaymentType.CHECK);
    }
}
