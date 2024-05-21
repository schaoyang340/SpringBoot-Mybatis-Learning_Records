package org.example.proxy.StaicProxy;

public class Test {
    public static void main(String[] args) {
        Target target = new Target();
        Proxy1 proxy1 = new Proxy1(target);
        proxy1.service();
    }
}