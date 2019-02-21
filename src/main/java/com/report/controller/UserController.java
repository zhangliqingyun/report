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
 * @Description �û�controller��
 * @author ������[zhanglizeng] Tel��18860126570
 * @createDate 2018��6��28�� ����11:19:22
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;
    
    @Autowired
    VersionService versionService;
    
    
    /**
     * @Description ��ת���������ݽ���ķ���
     * @author ������[zhanglizeng] Tel��18860126570
     * @createDate 2018��6��28�� ����1:10:25
     */
    @RequestMapping("/reportPage")
    public String reportPage() {
    	return "report";
    } 
    
    /**
     * @Description ��ת��home����ķ���
     * @author ������[zhanglizeng] Tel��18860126570
     * @createDate 2018��6��28�� ����1:10:25
     */
    @RequestMapping("/importPage")
    public String importPage() {
    	return "importdata";
    }
    
    /**
     * @Description ��ת��home����ķ���
     * @author ������[zhanglizeng] Tel��18860126570
     * @createDate 2018��6��28�� ����1:10:25
     */
    @RequestMapping("/homePage")
    public String home() {
    	return "home";
    }
    
    /**
     * @Description ��ת���û���¼����ķ���
     * @author ������[zhanglizeng] Tel��18860126570
     * @createDate 2018��6��28�� ����11:03:28
     */
    @RequestMapping("/login")   
    public String test(){
        return "login";
    }
    
    /**
     * @Description ��¼��֤�û���������ķ���
     * @author ������[zhanglizeng] Tel��18860126570
     * @createDate 2018��6��28�� ����11:12:05
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
        model.addAttribute("message", "�û��������벻��ȷ");  
        return "login";       
    }
}
