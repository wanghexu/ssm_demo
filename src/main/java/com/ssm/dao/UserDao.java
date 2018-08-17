package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.User;
/**
 * 用户控制层
 * @author 王和旭
 *20180815
 */
public interface UserDao {

	/**
     * 查找用户名和密码
     * @param username 登录用户名 
     * @param password 密码
     * @return
     */
    User findByUsername(@Param("username")String username,@Param("password")String password);
}
