package com.bjsxt.service;

import com.bjsxt.pojo.Users;

import java.util.List;

public interface UsersService {
    void addUser(Users users);
    List<Users> findUserAll();
}
