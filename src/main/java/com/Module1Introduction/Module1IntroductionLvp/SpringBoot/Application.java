package com.Module1Introduction.Module1IntroductionLvp.SpringBoot;

import com.Module1Introduction.Module1IntroductionLvp.SpringBoot.ImplNotificationService.EmailNotificationService;
import com.Module1Introduction.Module1IntroductionLvp.SpringBoot.ImplNotificationService.SmsNotificationService;
import com.sun.tools.jconsole.JConsoleContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Application implements CommandLineRunner {
//    @Autowired
//    final NotificationService notificationServiceObj;// Field Dependency Injection // ***Dependency injection***
//
//    public Application(
////            @Qualifier("emailNotify")
//            NotificationService notificationService){
//        this.notificationServiceObj = notificationService; // constructor dependency injection // preferred
//    }
    @Autowired
    Map<String, NotificationService> notificationServiceMap = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
        System.out.println("Lvprasad started learning springboot application....");
	}
//    PaymentService paymentServiceObj = new PaymentService();

    @Override
    public void run(String... args) throws Exception {
//        notificationServiceObj = new SmsNotificationService();

        // notificationServiceObj.send("HI This is Lvp");
//        System.out.println("notificationServiceMap======>"+ notificationServiceMap);
        for (var notificationService: notificationServiceMap.entrySet()){
            System.out.println("notificationService=====>" + notificationService);
            System.out.println(notificationService.getKey());
            System.out.println(notificationService.getValue());
            notificationService.getValue().send("Hi This is Lvp.....");
        }
    }
}
