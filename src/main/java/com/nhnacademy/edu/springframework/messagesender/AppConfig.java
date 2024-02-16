//package com.nhnacademy.edu.springframework.messagesender;
//
//
//import com.nhnacademy.edu.springframework.messagesender.sender.EmailMessageSender;
//import com.nhnacademy.edu.springframework.messagesender.sender.SmsMessageSender;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//@EnableAspectJAutoProxy
//@Configuration
//public class AppConfig {
//
//
//    @Bean
//    public MessageSendService messageSendService(){
//        return new MessageSendService(emailMessageSender());
//    }
//
//    @Bean
//    public SmsMessageSender smsMessageSender(){
//            return new SmsMessageSender();
//    }
//
//    @Bean
//    public EmailMessageSender emailMessageSender(){
//        return new EmailMessageSender();
//    }
//}
