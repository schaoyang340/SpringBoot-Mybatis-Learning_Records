package org.example.service.Impl;

import org.example.service.MyService;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public String doSomething(){
        String result = "我要干饭";

        // 测试异常通知方法
        // 在这里抛出一个异常
        if (true) { // 为了演示，此处条件永远成立，实际中请根据需要修改条件
            throw new RuntimeException("抛出一个异常，触发异常通知！");
        }

        return result;
    }
}
