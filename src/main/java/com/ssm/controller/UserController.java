package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ssm.entity.User;
import com.ssm.service.UserService;

/**
 * 用户控制层
 * @author 王和旭
 * 20180815
 */
@Controller
@SessionAttributes("user")
public class UserController {
	 @Autowired
	    private UserService userServivce;
	 //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(User user,Model model){
        //调用service方法
    	System.out.println("进来用户控制层了"+user.getUser_name());
        user = userServivce.checkLogin(user.getUser_name(), user.getUser_pass());
        //若有user则添加到model里并且跳转到成功页面
        System.out.println("用户"+user);
        if(user!= null){
            model.addAttribute("user",user);
            return "success";
        }
        return "fail";
    }
}
