package com.cq.springcloud.service;

import com.cq.springcloud.controller.LoginController;
import com.cq.springcloud.dao.LoginDao;
import com.cq.springcloud.model.Custinfo;
import jdk.jfr.events.ExceptionThrownEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private LoginDao loginDao;
    /**
     * 遇到throw new RuntimeException(“…”);会回滚
     * 需要捕获的throw new Exception(“…”);不会回滚
     */
    @Transactional(rollbackFor = Exception.class)
    public int insertIntoCustinfo(Custinfo custinfo)  {
        return loginDao.insertIntoCustinfo(custinfo);
    }
}
