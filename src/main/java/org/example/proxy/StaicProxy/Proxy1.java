package org.example.proxy.StaicProxy;

public class Proxy1 {
    private Target target;

    public Proxy1(Target target) {
        this.target = target;
    }

    public void service() {
        try {
            System.out.println("收费1");
            // 真实对象的服务
            target.service();
            System.out.println("收费2");
        } catch (Exception e) {
            System.out.println("收费3");
        } finally {
            System.out.println("收费4");
        }
    }
}
