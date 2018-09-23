package me.lee.SpringBootDemo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.lee.SpringBootDemo.dao.UserDao;
import me.lee.SpringBootDemo.entity.User;
import me.lee.SpringBootDemo.service.TestInterFace;

//业务层接口实现
@Service
public class TestInterFaceImpl implements TestInterFace {
	  //引入dao层接口
	  @Autowired 
	  UserDao userDao;
  
	  @Override 
	  public int testInterFace() {
		  return 0;
	  }

  	@Override 
	  public User testUser() {
		  User u = new User();
		  u.setUsername("lee");
		  u.setPassword("123");
		  return u;
	  }
  	
    //新增的接口实现
    @Override 
    public int insertUser(String username,String password) {
    	return userDao.insertUser(username,password);
    }

    //新增的接口实现
	@Override
	public List<User> selectAll() {
		return userDao.selectAll();
	}
}

