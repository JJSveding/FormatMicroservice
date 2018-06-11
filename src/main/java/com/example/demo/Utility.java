package com.example.demo;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.ConnectionFactory;

public class Utility {
    private static final String JMS_BROKER_URL = "tcp://localhost:61616";


    public static ConnectionFactory connectionFactory() {
        return new ActiveMQConnectionFactory(JMS_BROKER_URL);
    }
}
