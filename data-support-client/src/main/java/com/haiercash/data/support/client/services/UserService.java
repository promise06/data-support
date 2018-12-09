package com.haiercash.data.support.client.services;

import com.haiercash.data.support.client.dao.db1.UserDao;
import com.haiercash.data.support.client.dao.db2.ComputerDao;
import com.haiercash.data.support.client.entity.Computer;
import com.haiercash.data.support.client.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    public ComputerDao computerDao;

    public User selectUserByName(String name){
        return userDao.findUserByName(name);
    }
    public Computer selectComputerByName(String name) {
        return computerDao.findComputerByName(name);
    }
}