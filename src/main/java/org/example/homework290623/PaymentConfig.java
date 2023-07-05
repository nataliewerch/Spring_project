package org.example.homework290623;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class PaymentConfig {

    @Bean
    public PaymentService paymentService() {
        return new PaymentService();
    }

    @Bean
    public Payment card() {
        return new Card();
    }

    @Bean
    public Payment cash() {
        return new Cash();
    }

    @Bean
    public Payment check() {
        return new Check();
    }
}
