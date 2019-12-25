package com.company;

import javax.xml.ws.Endpoint;

public class TimerServerPublisher {

    public static void main(String[ ] args) {

        // 1st argument is the publication URL
        // 2nd argument is an SIB instance
        System.out.println("test");

        Endpoint.publish("http://127.0.0.1:9876/one", new com.company.TimeServerImpl());

    }

}

