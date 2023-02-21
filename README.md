# WebService_wsd
Activity 1/ Deploy our webservice

Create  a new project in Intellij, named "WebService"

Here we will create and deploy a webservice on wsdl
With the use of one class "BankService"

the bank offert three services: 
-convert from euro to dhrs, 
-also able to provide a list of account, 
-and display user code and, 
-also creationDate of the account; 

Values will be generated randomly.

Now we can create, or set our webservice with the help of the methods from JAXWS
We use the anotation @WebService;
PS: we make sure first that we have the recent dependency of JAXWS added from maven.

Then, using @WebService annotation, that we place on top of the class name, we have declared a 
webservice, now when deployed (later), the application will detect it as a webservice.

Following the same principle, we declare next our method and params from the methods that have one;
using @WebMethod , @WebParam.
And our webservice is now created.

The next part is to create our own web-server.

Create another java class, and name it ServerJWS, with the main method.
  Endpoint is a JAXWS class, that we will be using here to publish our web-service.
  
  eq: Endpoint.publish(<url / localhost:9191>, new BankService());
  
When done, we can use the SOAP Gui applicatin to run test on the web-service; and when finish we will now create a web-client in JAVA
to test our web-service.
