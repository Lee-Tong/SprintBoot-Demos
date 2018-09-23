package me.lee.SpringBootDemo.entity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by kx on 17/3/29.
 */
 //增加注解声明表名
@Table(name = "userinfo")
public class User {
    //增加注解声明字段名
    @Column(name = "username")
    private String username = "username寇鑫123";
    @Column(name = "password")
    private String password = "password寇鑫123";

    public String getUsername() {
    return username;
    }

    public void setUsername(String username) {
    this.username = username;
    }

    public String getPassword() {
    return password;
    }

    public void setPassword(String password) {
    this.password = password;
    }

    @Override public String toString() {
    return "User{" + "username='" + username + '\'' + ", password='" + password + '\'' + '}';
    }
}