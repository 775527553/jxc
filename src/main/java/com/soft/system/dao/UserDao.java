package com.soft.system.dao;


import com.soft.system.entity.User;

import java.util.List;

//@Mapper
public interface UserDao {

    List<User> findAll();
}
