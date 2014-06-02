package com.mahosyojyo.dao;

import com.mahosyojyo.bean.User;

import java.util.List;

/**
 * Created by FredFung on 2014/6/2.
 * Dao operation demo
 */

/* TODO define dao operation interface */
public interface IUserDao {
    void insertUser(User user);
    List<User> findAllUsers();
}
