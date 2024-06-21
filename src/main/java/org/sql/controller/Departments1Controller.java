package org.sql.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sql.service.Departments1Service;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dept")
public class Departments1Controller {

    @Autowired
    private Departments1Service departments1Service;

    @GetMapping("/list")
    public Map<String,Object> list(){
        Map<String,Object> result = new HashMap<>();
        result.put("code",200);
        result.put("msg","操作成功");
        result.put("data",departments1Service.list());
        return result;
    }
}
