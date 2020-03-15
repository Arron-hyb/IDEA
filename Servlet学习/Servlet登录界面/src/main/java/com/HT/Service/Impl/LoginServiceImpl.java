package com.HT.Service.Impl;

import com.HT.Dao.Impl.LoginDaoImpl;
import com.HT.Service.LoginService;
import com.HT.pojo.User;

public class LoginServiceImpl implements LoginService {
    @Override
    public User checkLoginService(String name, String pwd) throws ClassNotFoundException {
        User u = new LoginDaoImpl().checkLoginDao(name,pwd);

        return u;
    }
}
