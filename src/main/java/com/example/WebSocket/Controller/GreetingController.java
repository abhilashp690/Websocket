package com.example.WebSocket.Controller;

import com.example.WebSocket.Model.Greeting;
import com.example.WebSocket.Model.RequestModel;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/register")
    @SendTo("/topic/realTime")
    public Greeting greet(@Payload RequestModel request) {
        Greeting greet = new Greeting();
        greet.setGreetText("Hi " + request.getUserName() +" greets from Pune");
        return greet;
    }
}
