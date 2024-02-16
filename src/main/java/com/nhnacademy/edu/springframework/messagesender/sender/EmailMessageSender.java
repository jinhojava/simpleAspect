package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
public class EmailMessageSender implements MessageSender {


    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println(user.toString() + " dooray" + message);

        new DoorayHookSender(new RestTemplate(), "https://hook.dooray.com/services/3204376758577275363/3738651962004364986/HByzZBRuRu69-EUTsWR0tg")
                .send(DoorayHook.builder()
                        .botName("${작성자 이름}")
                        .text("${동료들에게 하고싶은말}")
                        .build());

        return true;
    }

    @PostConstruct
    public void init() {
        System.out.println("dooray 빈 생성 완료");
    }
}
