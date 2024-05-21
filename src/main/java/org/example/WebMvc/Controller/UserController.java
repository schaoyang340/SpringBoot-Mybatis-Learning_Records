package org.example.WebMvc.Controller;

import org.example.WebMvc.vo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("user")
public class UserController {

    // 参数同名
    @PostMapping("login1.action")
    public HashMap login(@RequestParam("username") String uname, String password) {
        System.out.println(uname);
        System.out.println(password);
        HashMap map = new HashMap();
        map.put("code", "20000");
        map.put("message", "登录请求成功！");

        return map;
    }

    // 模板数据
    @PostMapping("login11.action")
    public HashMap login2(UserInfo userInfo) {
        System.out.println(userInfo.getUsername() + "--login11--" + userInfo.getPassword());
        HashMap map = new HashMap();
        map.put("code", "20000");
        map.put("message", "登录请求成功！");
        map.put("data", userInfo);
        return map;
    }

    // json形式入参
    @PostMapping("login2.action")
    public HashMap login3(@RequestBody UserInfo userInfo) {
        HashMap map = new HashMap();
        map.put("code", "20000");
        map.put("message", "登录请求成功！");
        map.put("data", userInfo);
        return map;
    }


    // 根据id获取用户信息（查询操作是get请求）
    @GetMapping("/{id}/userId")
    public HashMap getById(@PathVariable("id") int id) {
        UserInfo ui = new UserInfo();
        ui.setUserId(id);

        HashMap map = new HashMap();
        map.put("code", "20000");
        map.put("message", "登录请求成功！");
        map.put("data", ui);
        return map;
    }

}

