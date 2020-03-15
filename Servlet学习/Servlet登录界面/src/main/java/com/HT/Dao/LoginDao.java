package com.HT.Dao;

import com.HT.pojo.User;

public interface LoginDao {
    User checkLoginDao(String uname, String pwd) throws ClassNotFoundException;
}
