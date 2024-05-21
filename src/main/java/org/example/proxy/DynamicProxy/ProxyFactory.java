package org.example.proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class ProxyFactory implements InvocationHandler {
    ITarget target;
    public ProxyFactory(ITarget target) {
        this.target = target;
    }
    /**
     * invoke， 代理执行方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws
            Throwable {
        // 反射： 代码的真实方法运行
        Object o = null;
        try {
            System.out.println("收费1");
            // 真实对象的方法
            o = method.invoke(target, args);
            System.out.println("收费2");
        } catch (Exception e) {
            System.out.println("收费3");
        } finally {
            System.out.println("收费4");
        }
        return o;
    }
    // 公开方法。获取 代理对象实力
    public ITarget newInstance() {
        return (ITarget)
        /*
        * roxy.newProxyInstance(p1,  p2,  p3);
        * p1:  类加载器： AppClassLoad
        * p2:  要代理的接口
        * p3: 执行句柄对象
        * */
        Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(), new Class[] {ITarget.class}, this);
    }
}