package com.thetestroom;

public class MyExampleEndpoint {

    public String sayHi(ExternalExampleEndpoint externalExampleEndpoint) {
        System.out.println("My Example Endpoint Method had been called and is about to call ExternalExampleEndpoint");
        return externalExampleEndpoint.sayHi();
    }

}
