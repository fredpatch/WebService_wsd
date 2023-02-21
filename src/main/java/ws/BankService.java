package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//Uses annotation to call in methods from jws
@WebService(serviceName = "BankWS")
public class BankService {

    //@method helps the webservice know that we are determining a method
    //Same for the @WebParam which is used to pass parameter for a method
    @WebMethod(operationName = "Conversion")
    public double conversionEuroToDhs (@WebParam(name="amount") double mt){
        return mt*11;
    }

    @WebMethod
    public Account getaccount (int code){
        return new Account(code , Math.random()*9000, new Date());
    }

    @WebMethod
    public List<Account> accountList(){

        //Creating a new random list of bank account information
        return List.of(
                new Account(1 , Math.random()*9000, new Date()),
                new Account(2 , Math.random()*9000, new Date()),
                new Account(3 , Math.random()*9000, new Date())
        );
    }
}
