package org.sql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sql.domain.Employees1;
import org.sql.service.Employees1Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/employee")
public class Employees1Controller {

    @Autowired
    private Employees1Service employees1Service;

    @GetMapping("/list1")
    public Map<String,Object> list() {
        Map<String,Object> result = new HashMap<>();
        result.put("code",200);
        result.put("msg","成功");
        result.put("data",employees1Service.list());

        return result;
    }

    @GetMapping("/list2")
    public Map<String,Object> listCondition(String name) {
        Map<String,Object> result = new HashMap<>();
        result.put("code",200);
        result.put("msg","成功");
        result.put("data",employees1Service.listCondition(name));

        return result;
    }

    @GetMapping("/list3")
    public Map<String,Object> listCondition2(String name) {
        Map<String,Object> result = new HashMap<>();
        result.put("code",200);
        result.put("msg","成功");
        result.put("data",employees1Service.listCondition2(name));

        return result;
    }

    @PostMapping("/add")
    public Map<String,Object> add(Employees1 employees1) {
        Map<String,Object> result = new HashMap<>();
        if (employees1Service.add(employees1) >=0) {
            result.put("code",200);
            result.put("msg","操作成功");
            result.put("data",employees1);
        }else {
            result.put("code",201);
            result.put("msg","操作失败");

        }
        return result;
    }

    @GetMapping("/list")
    public Map<String,Object> listAll(@RequestParam Map<String,Object> parse){
        Map<String,Object> result = new HashMap<>();
        result.put("code",200);
        result.put("msg","成功");
        List<Map<String,Object>> list = employees1Service.listAll(parse);
        result.put("data",list);

        return result;
    }


    @PutMapping("/update")
    public Map<String,Object> update(@RequestBody Employees1 employees1){
        Map<String,Object> result = new HashMap<>();
        if(employees1Service.update(employees1)){
            result.put("code",200);
            result.put("msg","操作成功");
        }else{
            result.put("code",201);
            result.put("msg","操作失败");
        }
        return result;
    }

    //@DeleteMapping("/del/{id}")
    @GetMapping("/del/{id}")
    public Map<String,Object> del(@PathVariable("id") Integer employeeId){
        Map<String,Object> result = new HashMap<>();
        if(employees1Service.del(employeeId)){
            result.put("code",200);
            result.put("msg","操作成功");
        }else{
            result.put("code",201);
            result.put("msg","操作失败");
        }
        return result;
    }
}
