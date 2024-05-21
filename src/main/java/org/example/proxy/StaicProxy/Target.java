package org.example.proxy.StaicProxy;

public class Target {
    public void service() {
//        throw new RuntimeException("真是的崩了");
        System.out.println("这是真实的商品的服务");
    }
}