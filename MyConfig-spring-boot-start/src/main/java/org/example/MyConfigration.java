package org.example;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = MyProp.class)
public class MyConfigration {
    public MyConfigration(){
        System.out.println("我的配置工程");
    }

    @Bean
    public Student initStudent(MyProp myProp){
        return new Student(myProp.getName(), myProp.getAge(), 0);
    }
}
