package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
//public class BootMyBatisApplication implements CommandLineRunner {
//    public static void main(String[] args) {
//        SpringApplication.run(BootMyBatisApplication.class, args);
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    @Autowired
//    ApplicationContext applicationContext;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        String[] beannames = applicationContext.getBeanDefinitionNames();
//        for (String name: beannames){
////            根据名字获取Bean对象
//            Object o = applicationContext.getBean(name);
//            System.out.println(name + "@@" + o);
//        }
//    }
//}

@SpringBootApplication
public class BootMyBatisApplication{
    public static void main(String[] args) {
        SpringApplication.run(BootMyBatisApplication.class, args);
    }

}