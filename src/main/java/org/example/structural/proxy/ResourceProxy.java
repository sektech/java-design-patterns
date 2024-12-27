package org.example.structural.proxy;

import java.util.function.Predicate;

public class ResourceProxy implements Resource{

    private ActualSensitiveResource actualSensitiveResource;
    private String username;

    public ResourceProxy(String _username){
        this.username = _username;
    }
    Predicate<String> checkAccess = (input) -> input.equals(this.username.toLowerCase());

    @Override
    public void accessResource() {
       if(checkAccess.test("admin")){
           if(actualSensitiveResource == null)
               actualSensitiveResource = new ActualSensitiveResource();
           actualSensitiveResource.accessResource();
       }
       else
           System.out.println(" Access denied");
    }
}
