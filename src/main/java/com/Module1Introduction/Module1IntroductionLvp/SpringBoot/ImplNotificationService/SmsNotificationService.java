package com.Module1Introduction.Module1IntroductionLvp.SpringBoot.ImplNotificationService;

import com.Module1Introduction.Module1IntroductionLvp.SpringBoot.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsNotify")
//@ConditionalOnProperty(name="notification.type", havingValue = "sms")
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sms sending....."+ message);
    }
}
