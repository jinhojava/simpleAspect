package com.nhnacademy.edu.springframework.messagesender;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
//프록시 객체

//자동 프록시 생성기가 감싸서 반환 아니면 그냥 객체반환, 포인트컷 조건하나라도 맞으면 프록시객체로 감싸짐
//대상객체메소드 요청 들어오면 이 놈 거쳐서 감,

@Aspect
@Component
public class MessageSenderAspect {

    @Around("execution(* com.nhnacademy.edu.springframework.messagesender.sender.MessageSender.sendMessage(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object result = joinPoint.proceed();

        stopWatch.stop();
        System.out.println("Execution time of " + joinPoint.getSignature().getName() + ": " + stopWatch.getTotalTimeMillis() + " milliseconds");

        return result;
    }
}