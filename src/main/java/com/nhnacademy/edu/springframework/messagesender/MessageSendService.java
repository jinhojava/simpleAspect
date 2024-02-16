package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MessageSendService {

    private MessageSender messageSender;


    @Autowired
    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String string) {

        messageSender.sendMessage(user, string);
    }

    @PostConstruct
    public void init() {
        System.out.println("서비스빈생성완료");
    }

}
