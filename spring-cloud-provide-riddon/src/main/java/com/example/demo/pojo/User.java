package com.example.demo.pojo;

import java.util.Date;

/**
 * Created by admin on 2017/7/12.
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Date date;

    public User() {
    }

    public User(Integer id,String name , Integer age, Date date) {

        this.name = name;
        this.id = id;
        this.age = age;
        this.date = date;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
