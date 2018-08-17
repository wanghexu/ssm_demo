package com.ssm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import com.ssm.service.UserService;

/**
 * 用户业务层
 * @author 王和旭
 *20180815
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    /* 
     * 检验用户登录业务
     * 
     */
    public User checkLogin(String username, String password){

        User user = userDao.findByUsername(username,password);
        if(user != null){
         
           return user;
        }
        return null;
    }
}
