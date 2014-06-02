package com.mahosyojyo.service;

import com.mahosyojyo.bean.User;
import com.mahosyojyo.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by FredFung on 2014/6/2.
 * implementation of IUserService
 */

/* TODO implement service interface */
@Service //Spring will auto-create this bean
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional //this method needs transaction management
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    @Transactional
    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }
}
