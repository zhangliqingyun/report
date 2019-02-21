package com.report.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.report.bean.User;
import com.report.service.UserService;
import com.report.service.VersionService;

/**
 * @Description 用户controller层
 * @author 张立增[zhanglizeng] Tel：18860126570
 * @createDate 2018年6月28日 上午11:19:22
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;
    
    @Autowired
    VersionService versionService;
    
    
    /**
     * @Description 跳转到导入数据界面的方法
     * @author 张立增[zhanglizeng] Tel：18860126570
     * @createDate 2018年6月28日 下午1:10:25
     */
    @RequestMapping("/reportPage")
    public String reportPage() {
    	return "report";
    } 
    
    /**
     * @Description 跳转到home界面的方法
     * @author 张立增[zhanglizeng] Tel：18860126570
     * @createDate 2018年6月28日 下午1:10:25
     */
    @RequestMapping("/importPage")
    public String importPage() {
    	return "importdata";
    }
    
    /**
     * @Description 跳转到home界面的方法
     * @author 张立增[zhanglizeng] Tel：18860126570
     * @createDate 2018年6月28日 下午1:10:25
     */
    @RequestMapping("/homePage")
    public String home() {
    	return "home";
    }
    
    /**
     * @Description 跳转到用户登录界面的方法
     * @author 张立增[zhanglizeng] Tel：18860126570
     * @createDate 2018年6月28日 上午11:03:28
     */
    @RequestMapping("/login")   
    public String test(){
        return "login";
    }
    
    /**
     * @Description 登录验证用户名和密码的方法
     * @author 张立增[zhanglizeng] Tel：18860126570
     * @createDate 2018年6月28日 上午11:12:05
     */
    @RequestMapping("/home")  
    public String doLogin(User user,Model model,HttpServletRequest request){   
        List<User> userList = userService.checkUser(user);    
        if(userList != null && userList.size() > 0) {
        	for(int i = 0 ;i < userList.size();i++) {
        		if(userList.get(i).getPassword().equals(user.getPassword().trim())) {
        			model.addAttribute("message", "");                        
        			model.addAttribute("version", versionService.getVersion()); 
        			request.getSession().setAttribute("user",userList.get(i));      
        			return "index";
        		}
        	}
        }
        model.addAttribute("message", "用户名或密码不正确");  
        return "login";       
    }
}
