package com.mahosyojyo.service;

import com.mahosyojyo.bean.User;

import java.util.List;

/**
 * Created by FredFung on 2014/6/2.
 * Service demo
 */

/* TODO define service interface*/
public interface IUserService {
    void insertUser(User user);
    List<User> findAllUsers();
}
