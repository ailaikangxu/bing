package com.example.test;

import com.example.test.bean.UserBean;

public interface UserService {
    UserBean loginIn(String name, String password);
}
