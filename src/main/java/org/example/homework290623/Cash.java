package org.example.homework290623;

import org.springframework.stereotype.Component;

@Component
public class Cash implements Payment {
    @Override
    public void pay() {
        System.out.println("Cash");
    }
}
