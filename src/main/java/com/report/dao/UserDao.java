package com.report.dao;

import java.util.List;

import com.report.bean.User;

/**
 * @Description  用户dao接口层
 * @author 张立增[zhanglizeng] Tel：18860126570
 * @createDate 2018年6月28日 上午11:20:29
 */
public interface UserDao {
	List<User> checkUser(User user);   
}
