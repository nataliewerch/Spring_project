package org.example.homework290623;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @Autowired
    private Payment card;

    @Autowired
    private Payment cash;

    @Autowired
    private Payment check;

    public void pay(PaymentType paymentType) {
        switch (paymentType) {
            case CARD -> card.pay();
            case CASH -> cash.pay();
            case CHECK -> check.pay();
        }
    }
}

