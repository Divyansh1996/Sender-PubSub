package com.example.senderpubsub.controller;

import com.example.senderpubsub.config.PubSubConfig;
import com.example.senderpubsub.config.PubSubGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private PubSubGateway pubSubGateway;


    @PostMapping("/sendMessage/{message}")
    public String sendMessage(@PathVariable("message") String message) {
        pubSubGateway.sendMessage(message);
        return "Message send successfully";
    }
}
