package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }

    @Override
    public List<Users> findUserAll() {
        return this.usersMapper.selectUsersAll();
    }
}
