package com.company;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


//Service Endpoint Interface
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC) // more on this later
public interface TimeServer{
    @WebMethod
    String getTimeAsString();
    @WebMethod
    long getTimeAsElapsed();
}
