package org.example.proxy.DynamicProxy;

public class Test {
    public static void main(String[] args) {
        ITarget target = new Target();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        ITarget proxy =  proxyFactory.newInstance();
        proxy.service();
    }
}