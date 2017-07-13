package com.example.demo.dao.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by admin on 2017/7/12.
 */
@Service
public class UserDaoImpl implements UserDao {
    private Map<Integer,User> map=new HashMap();
    {
        map.put(1,new User(1,"韩寒",23,new Date()));
        map.put(2,new User(2,"寒寒",24,new Date()));
        map.put(3,new User(3,"韩煦",25,new Date()));
        map.put(4,new User(4,"韩泽",26,new Date()));
    }
    @Override
    public List<User> findAll() {
        List<User> users=new ArrayList<>();
        for(Map.Entry<Integer,User> user:map.entrySet()){
         users.add(user.getValue());
        }
        return users;
    }

    @Override
    public User findbyId(Integer id) {
        return map.get(id);
    }
}
