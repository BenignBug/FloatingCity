package com.floatingcity.community.dao;

import org.springframework.stereotype.Repository;

@Repository  // 装载，然后才可调用
public class DemoDaoImpl implements DemoDao{
    @Override
    public String select() {
        return "haha";
    }
}
