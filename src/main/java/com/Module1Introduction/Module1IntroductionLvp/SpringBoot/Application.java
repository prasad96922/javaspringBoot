package com.Module1Introduction.Module1IntroductionLvp.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    PaymentService paymentServiceObj;

    @Autowired
    PaymentService paymentServiceObj2;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
        System.out.println("Lvprasad started learning springboot application....");
	}
//    PaymentService paymentServiceObj = new PaymentService();

    @Override
    public void run(String... args) throws Exception {

        System.out.println(paymentServiceObj.hashCode());
        System.out.println(paymentServiceObj2.hashCode());

        paymentServiceObj.pay();
    }
}
