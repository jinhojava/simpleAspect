package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.sender.MessageSender;
//import com.nhnacademy.edu.springframework.messagesender.sender.SmsMessageSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        MessageSendService messageSendService = context.getBean("messageSendService", MessageSendService.class);

        User user = new User("ho123456","01099997777");
        messageSendService.doSendMessage(user,"안녕하세요");

    }

}
