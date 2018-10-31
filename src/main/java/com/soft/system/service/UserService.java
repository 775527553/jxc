package com.soft.system.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.soft.utils.TableDataInfo;
import com.soft.system.dao.UserDao;
import com.soft.system.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class
UserService {

    @Autowired
    private UserDao userDao;


    public List<User> findAll(){
        return userDao.findAll();
    }
    public TableDataInfo findByPage(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> all = userDao.findAll();
        PageInfo<User> users=new PageInfo<>(all);
        TableDataInfo tableDataInfo=new TableDataInfo();
        tableDataInfo.setRows(users.getList());
        tableDataInfo.setTotal(users.getTotal());
        return tableDataInfo;
    }
}
