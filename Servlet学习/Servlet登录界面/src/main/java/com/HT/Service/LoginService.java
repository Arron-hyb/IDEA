package com.HT.Service;

import com.HT.pojo.User;

public interface LoginService {
    User checkLoginService(String name, String pwd) throws ClassNotFoundException;
}
