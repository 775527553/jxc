package com.soft.system.controller;


import com.github.pagehelper.PageInfo;
import com.soft.base.utils.ResultData;
import com.soft.system.entity.User;
import com.soft.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/t")
    public List<User> findAll(){
        return userService.findAll();
    }
    @RequestMapping("/findByPage")
    public ResultData findByPage(int pageNum, int pageSize){
        return ResultData.success(userService.findByPage(pageNum,pageSize));
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResultData findByPage(String  username, String password){
        Map map= new HashMap();
        map.put("token","123");
        return ResultData.success(map);
    }

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public ResultData info(String  username, String password){
        Map map= new HashMap();
        map.put("token","123");
        return ResultData.success(map);
    }


}
