package org.example.WebMvc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // mvc注解,匹配get请求
    @GetMapping("hello.action")
    public String hello(String sname){
        return "hello" + sname;
    }
}
