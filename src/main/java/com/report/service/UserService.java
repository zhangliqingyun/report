package com.report.service;
import java.util.List;

import com.report.bean.User;

/**
 * @Description  �û�service�ӿڲ�
 * @author ������[zhanglizeng] Tel��18860126570
 * @createDate 2018��6��28�� ����11:19:48
 */
public interface UserService {

    List<User> checkUser(User user);
    
}
