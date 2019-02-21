package com.report.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

public class UserAccessInterceptor extends HandlerInterceptorAdapter {
   
	@Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
        Object sessionObj = request.getSession().getAttribute("user");      
        if(sessionObj!=null) {   
            return true;  
        }   
        response.sendRedirect("login");       
        return false;  
    }
	
}
