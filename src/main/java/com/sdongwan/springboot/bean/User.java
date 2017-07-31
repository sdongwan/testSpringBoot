package com.sdongwan.springboot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/28.
 */

/**
 * 这个实体类是用于jpa中创建数据库表的
 */
//使用注解标记实体，然后可以使用jpa进行crud操作
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Integer userId = 0;//对应数据库表中的user_id列
    private String userName;//user_name
    private String passWord;//pass_word
    private int age;//age

    public User() {
    }

    public User(String userName, String passWord, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                '}';
    }
}
