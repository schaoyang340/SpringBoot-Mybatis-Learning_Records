package org.example.SingletonPattern;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
// 参数prototype使得单实例创建时会是新的Bean
@Scope("prototype")
public class Test2 {

}
