package com.inno.eurekaclient.Service.Impl;

import com.inno.eurekaclient.Bean.User;
import com.inno.eurekaclient.Dao.UserDao;
import com.inno.eurekaclient.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String selectAll() {

        String  data=userDao.selectAll();
        return data;
    }
}
