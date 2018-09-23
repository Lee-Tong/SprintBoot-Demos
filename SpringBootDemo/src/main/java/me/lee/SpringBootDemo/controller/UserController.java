package me.lee.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.lee.SpringBootDemo.entity.User;
import me.lee.SpringBootDemo.service.TestInterFace;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private TestInterFace testInterFace;

    @RequestMapping("/get")
    @ResponseBody 
    User getUser() {
    	return testInterFace.testUser();
    }
    
    //增加新的对外访问接口
    @RequestMapping("/add")
    @ResponseBody 
    String add() {
        testInterFace.insertUser("username123寇鑫","password123寇鑫");
        return "插入成功";
    }
  //新增的接口方法
    @RequestMapping("/getall")
    @ResponseBody List<User> getall() {
        return testInterFace.selectAll();
    }
}
