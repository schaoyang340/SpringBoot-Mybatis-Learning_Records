package org.example;

import org.example.SingletonPattern.Test2;
import org.example.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import static junit.framework.Assert.assertEquals;

@SpringBootTest
public class BootApplicationTests {
    @Autowired
    Student student;

    @Test
    public void test1(){
        System.out.println(student.getName() + "-0-0--" + student.getAge());
    }


//    测试@Scope变更单实例
    @Autowired
    ApplicationContext applicationContext;
    @Test
    public void test2(){
        Test2 t1 = applicationContext.getBean(Test2.class);
        Test2 t2 = applicationContext.getBean(Test2.class);
//      添加@Scope之前为true，之后为false
        System.out.println(t1 == t2);
    }

    /*测试AOP日志记录*/
    @Autowired
    MyService myService;

    @Test
    public void testLoggingAspect() {
        String result = myService.doSomething();
        System.out.println("现在的result = " + result);
        assertEquals("我要干饭",result) ;
    }

}
