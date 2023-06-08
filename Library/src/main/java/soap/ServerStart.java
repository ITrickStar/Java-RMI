package soap;

import javax.xml.ws.Endpoint;

public class ServerStart {
    public static void main(String[] args) {
        LibServer server = new LibServer();
        Endpoint.publish("http://localhost:8080/LibServer", server);
        System.out.println("Server started");
    }
}
