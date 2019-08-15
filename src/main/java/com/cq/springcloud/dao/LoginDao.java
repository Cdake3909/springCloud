package com.cq.springcloud.dao;

import com.cq.springcloud.model.Custinfo;
import org.apache.ibatis.annotations.Param;

public interface LoginDao {
    public int insertIntoCustinfo(@Param("custinfo")  Custinfo custinfo);
}
