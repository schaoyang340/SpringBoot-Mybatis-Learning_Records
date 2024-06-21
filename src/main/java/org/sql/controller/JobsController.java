package org.sql.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sql.service.JobsService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/job")
public class JobsController {
    @Autowired
    private JobsService jobsService;

    @GetMapping("/list")
    public Map<String,Object> list(){
        Map<String,Object> result = new HashMap<>();
        result.put("code",200);
        result.put("msg","操作成功");
        result.put("data",jobsService.list());
        return result;
    }
}
