package org.example.structural.proxy;

public class ProxyCllientDemo {
    public static void main(String[] args) {
        Resource resource = new ResourceProxy("test");
        resource.accessResource();


        Resource resource1 = new ResourceProxy("admin");
        resource1.accessResource();
    }
}
