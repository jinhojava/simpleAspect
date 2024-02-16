package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class SmsMessageSender implements MessageSender {
    @Override
    public boolean sendMessage(User user, String message) {

        System.out.println(user.toString() + " sms" + message);

        return true;

    }

    @PostConstruct
    public void init() {
        System.out.println("sms 빈 생성 완료");
    }
}
