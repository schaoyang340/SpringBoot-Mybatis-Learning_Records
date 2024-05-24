package org.sql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sql.service.Employees1Service;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/employee")
public class Employees1Controller {

    @Autowired
    private Employees1Service employees1Service;

    @GetMapping("/list")
    public Map<String,Object> list() {
        Map<String,Object> result = new HashMap<>();
        result.put("code",200);
        result.put("msg","成功");
        result.put("data",employees1Service.list());

        return result;
    }

    @GetMapping("/list1")
    public Map<String,Object> listCondition(String name) {
        Map<String,Object> result = new HashMap<>();
        result.put("code",200);
        result.put("msg","成功");
        result.put("data",employees1Service.listCondition(name));

        return result;
    }

    @GetMapping("/list2")
    public Map<String,Object> listCondition2(String name) {
        Map<String,Object> result = new HashMap<>();
        result.put("code",200);
        result.put("msg","成功");
        result.put("data",employees1Service.listCondition(name));

        return result;
    }
}
