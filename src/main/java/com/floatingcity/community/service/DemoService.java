package com.floatingcity.community.service;

import com.floatingcity.community.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class DemoService {

    @Autowired
    private DemoDao demoDao;

    public  DemoService() {
        System.out.println("gou..zao..");
    }

    @PostConstruct
    public void init() {
        System.out.println("init...");
    }

    @PreDestroy
    public void Destroy() {
        System.out.println("no");
    }

    public String find() {
        return demoDao.select();
    }

}
