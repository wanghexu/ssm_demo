package com.ssm.service;

import com.ssm.entity.User;

/**
 * 用户业务层接口
 * @author 王和旭
 * 20180815
 */
//Service层接口
public interface UserService {

  //检验用户登录
  User checkLogin(String username,String password);

}
