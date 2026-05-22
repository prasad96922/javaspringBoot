package com.Module1Introduction.Module1IntroductionLvp.SpringBoot.ImplNotificationService;

import com.Module1Introduction.Module1IntroductionLvp.SpringBoot.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@Qualifier("emailNotify")

//@ConditionalOnProperty(name="notification.type", havingValue = "email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email sending....."+ message);
    }
}
