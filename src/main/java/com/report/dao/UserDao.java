package com.report.dao;

import java.util.List;

import com.report.bean.User;

/**
 * @Description  �û�dao�ӿڲ�
 * @author ������[zhanglizeng] Tel��18860126570
 * @createDate 2018��6��28�� ����11:20:29
 */
public interface UserDao {
	List<User> checkUser(User user);   
}
