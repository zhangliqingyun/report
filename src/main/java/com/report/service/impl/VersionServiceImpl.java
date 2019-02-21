package com.report.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.report.bean.Version;
import com.report.dao.VersionDao;
import com.report.service.VersionService;

/**
 * @Description  用户service实现层
 * @author 张立增[zhanglizeng] Tel：18860126570
 * @createDate 2018年6月28日 上午11:20:10
 */
@Service
public class VersionServiceImpl implements VersionService{

    @Autowired
    VersionDao versionDao;
    
    @Override
    public Version getVersion() {
        return versionDao.getVersion();
    }

}
