import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServiceWS {
    public static void main(String[] args) {

        //Defining the url for our deployment
        String url = "http://0.0.0.0:9191/";
        //Use of endpoint method to define a webservice to deploy our website at
        Endpoint.publish(url, new BankService());
        System.out.println("Web service has been deployed on "+ url);
    }
}
