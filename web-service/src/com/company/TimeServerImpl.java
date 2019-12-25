package com.company;


import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "com.company.TimeServer")
public class TimeServerImpl implements TimeServer {

    public String getTimeAsString() { return new Date().toString(); }
    public long getTimeAsElapsed() { return new Date().getTime(); }

}
