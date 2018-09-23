package me.lee.SpringBootDemo.service;

import java.util.List;

import me.lee.SpringBootDemo.entity.User;

//业务层接口
public interface TestInterFace {

  public int testInterFace();

  public User testUser();
  
  public int insertUser(String username,String password);//新增的接口
  
  //新增的方法
  List<User> selectAll();
}
