package me.lee.SpringBootDemo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import me.lee.SpringBootDemo.dao.baseDao.MyMapper;
import me.lee.SpringBootDemo.entity.User;

@Mapper
public interface UserDao extends MyMapper<User>{
    @Select("SELECT * FROM USERINFO WHERE username = #{username}")
    User findByName(@Param("username") String username);

    @Insert("INSERT INTO USERINFO(username, password) VALUES(#{username}, #{password})")
    int insertUser(@Param("username") String name, @Param("password") String password);
}