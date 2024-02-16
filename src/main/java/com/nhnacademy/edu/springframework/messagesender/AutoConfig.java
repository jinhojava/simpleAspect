package com.nhnacademy.edu.springframework.messagesender;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan("com.nhnacademy.edu.springframework.messagesender")
public class AutoConfig {
}
