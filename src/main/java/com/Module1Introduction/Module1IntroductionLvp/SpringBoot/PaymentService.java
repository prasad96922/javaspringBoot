package com.Module1Introduction.Module1IntroductionLvp.SpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//1. how to create Beans?
@Component  //  generic bean
//@Service  // business logic
//@Controller // web layer
//@Repository // database access
//RestController

// 2. Using @Bean in a @Configuration Class

public class PaymentService {

    public void pay(){
        System.out.println("Paying............");
    }

    @PostConstruct
    public void afterInitialisationOfBean(){
        System.out.println("Before Paying.........");
    }

    @PreDestroy
    public void beforeDestroy(){
        System.out.println("After payment is done .........");
    }

}
