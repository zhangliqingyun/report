package com.report.service;
import java.util.List;

import com.report.bean.User;

/**
 * @Description  用户service接口层
 * @author 张立增[zhanglizeng] Tel：18860126570
 * @createDate 2018年6月28日 上午11:19:48
 */
public interface UserService {

    List<User> checkUser(User user);
    
}
