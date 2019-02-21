package com.report.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.report.bean.User;
import com.report.dao.UserDao;
import com.report.service.UserService;

/**
 * @Description  �û�serviceʵ�ֲ�
 * @author ������[zhanglizeng] Tel��18860126570
 * @createDate 2018��6��28�� ����11:20:10
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao testUserDao;
    
    @Override
    public List<User> checkUser(User user) {
        return testUserDao.checkUser(user);
    }

}
