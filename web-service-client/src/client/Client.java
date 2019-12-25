package client;

import com.company.TimeServer;
import com.company.TimeServerImpl;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;
import java.net.URL;

public class Client {

    @WebServiceRef(wsdlLocation="http://127.0.0.1:9876/one?wsdl")
    public static void main(String[] args) throws  Exception{
        URL url = new URL("http://127.0.0.1:9876/one?wsdl");
        QName qName = new QName("http://company.com/", "TimeServerImplService" );
        Service service = Service.create(url, qName);
        TimeServer timeServer = service.getPort(TimeServer.class);
        System.out.println(timeServer.getTimeAsString());
    }
}
