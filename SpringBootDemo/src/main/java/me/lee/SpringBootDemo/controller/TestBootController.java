package me.lee.SpringBootDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.lee.SpringBootDemo.entity.User;
import me.lee.SpringBootDemo.service.TestInterFace;

@Controller
@RequestMapping("test")
public class TestBootController {
	//增加日志
    private final Logger log = LoggerFactory.getLogger(TestBootController.class);

    @Autowired
    private TestInterFace testInterFace;

    @RequestMapping("/num")
    @ResponseBody
    int home() {
	    int i = testInterFace.testInterFace();
	    return i;
    }
    
    @RequestMapping("/get")
    @ResponseBody 
    User getUser() {
	    //打印日志
	    log.info("TestBootController getUser info");
	    return testInterFace.testUser();
    }
}
