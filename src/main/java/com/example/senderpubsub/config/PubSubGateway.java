package com.example.senderpubsub.config;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(defaultRequestChannel = "outputChannel")
public interface PubSubGateway{
    public void sendMessage(String message);
}
