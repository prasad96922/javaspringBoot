package com.Module1Introduction.Module1IntroductionLvp.SpringBoot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


// Beans is simply a java object

/*
* 1. Life Cycle of a Bean
*
* Bean created >>>>
*      Dependency injected ( @Autowired) >>>> Bean Initialised (PaymentService paymentServiceObj;)
*      >>>>>>> Bean is Used ( in public void pay()) >>>>>> bean is destroyed
*
* 2. Bean LifeCycle Methods
*
* ****@PostConstruct annotation before bean is used
* ****@PreDestroy    annotation before bean is destroyed
* */

@Configuration
public class AppConfig {

    @Bean  // By-default Bean is Singleton  99% is used
//    @Scope("prototype")
//    @Scope("request")
    PaymentService paymentService() {
        return new PaymentService();
    }
}
